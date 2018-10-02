package androsa.gaiadimension.entity;

import androsa.gaiadimension.registry.GDBiomes;
import androsa.gaiadimension.registry.GDBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

//TODO: Loot Table
public class GDMuckling extends EntitySlime {
    private static final AttributeModifier DOUBLE_HEALTH = new AttributeModifier("Muckling extra health", 1, 1).setSaved(false);

    public GDMuckling(World par1World) {
        super(par1World);
    }

    @Override
    protected EntitySlime createInstance() {
        return new GDMuckling(this.world);
    }

    @Override
    public void setSlimeSize(int size, boolean resetHealth) {
        super.setSlimeSize(size, resetHealth);
        this.experienceValue += 3;
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.world.getDifficulty() != EnumDifficulty.PEACEFUL &&
                this.world.checkNoEntityCollision(getEntityBoundingBox()) &&
                this.world.getCollisionBoxes(this, getEntityBoundingBox()).isEmpty() &&
                !this.world.containsAnyLiquid(getEntityBoundingBox()) &&
                this.isValidLightLevel() ||
                this.world.getBiome(new BlockPos(this)) == GDBiomes.purple_agate_swamp;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).applyModifier(DOUBLE_HEALTH);
    }

    @Override
    protected boolean canDamagePlayer() {
        return true;
    }

    @Override
    protected int getAttackStrength() {
        return super.getAttackStrength() + 3;
    }

    @Override
    protected boolean spawnCustomParticles() {
        int i = getSlimeSize();
        for (int j = 0; j < i * 8; ++j) {
            float f = this.rand.nextFloat() * ((float) Math.PI * 2F);
            float f1 = this.rand.nextFloat() * 0.5F + 0.5F;
            float f2 = MathHelper.sin(f) * (float) i * 0.5F * f1;
            float f3 = MathHelper.cos(f) * (float) i * 0.5F * f1;
            World world = this.world;
            double d0 = this.posX + (double) f2;
            double d1 = this.posZ + (double) f3;
            IBlockState state = GDBlocks.gummy_glitter_block.getDefaultState();
            world.spawnParticle(EnumParticleTypes.BLOCK_CRACK, d0, this.getEntityBoundingBox().minY, d1, 0.0D, 0.0D, 0.0D, Block.getStateId(state));
        }
        return true;
    }

    private boolean isValidLightLevel() {
        BlockPos blockpos = new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ);

        if (this.world.getBiome(new BlockPos(this)) == GDBiomes.purple_agate_swamp) {
            return true;
        } else {
            if (this.world.getLightFor(EnumSkyBlock.SKY, blockpos) > this.rand.nextInt(32)) {
                return false;
            } else {
                int i = this.world.getLightFromNeighbors(blockpos);

                if (this.world.isThundering()) {
                    int j = this.world.getSkylightSubtracted();
                    this.world.setSkylightSubtracted(10);
                    i = this.world.getLightFromNeighbors(blockpos);
                    this.world.setSkylightSubtracted(j);
                }
                return i <= this.rand.nextInt(8);
            }
        }
    }
}
