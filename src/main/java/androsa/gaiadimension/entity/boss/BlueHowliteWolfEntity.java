package androsa.gaiadimension.entity.boss;

import androsa.gaiadimension.entity.HowliteWolfEntity;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;

import java.util.Random;

public class BlueHowliteWolfEntity extends MonsterEntity {

    //TODO: Flesh out and revise
    public BlueHowliteWolfEntity(EntityType<? extends BlueHowliteWolfEntity> entity, World world) {
        super(entity, world);
        this.experienceValue = 30;
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return MonsterEntity.func_234295_eP_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 100.0D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 6.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.9D);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(2, new LookAtGoal(this, HowliteWolfEntity.class, 8.0F));
        this.goalSelector.addGoal(3, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 0.5D));
        this.goalSelector.addGoal(4, new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 1.0D, true));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this).setCallsForHelp(HowliteWolfEntity.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, false));
    }

    @Override
    public float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 2.1F;
    }

    @Override
    public int getMaxSpawnedInChunk() {
        return 1;
    }

    @Override
    public boolean canSpawn(IWorld world, SpawnReason reason) {
        return true;
    }

    public static boolean canSpawnHere(EntityType<BlueHowliteWolfEntity> entity, IServerWorld world, SpawnReason spawn, BlockPos pos, Random random) {
        if (world.getDifficulty() != Difficulty.PEACEFUL) {
            if (spawn == SpawnReason.SPAWNER) {
                return isValidLightLevel(world, pos, random);
            } else {
                return world.getBlockState(pos.down()).canEntitySpawn(world, pos.down(), entity) && world.getLightFor(LightType.SKY, pos) > 8;
            }
        }
        return false;
    }

    //Keep this commented out until later
/*
    @Override
    public boolean isNonBoss() {
        return false;
    }
*/
}
