package androsa.gaiadimension.fluid;

import androsa.gaiadimension.registry.GDBlocks;
import androsa.gaiadimension.registry.GDTabs;
import androsa.gaiadimension.registry.ModelRegisterCallback;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class GDFluidBlock extends BlockFluidClassic implements ModelRegisterCallback {

    private final MapColor mapColor;

    public GDFluidBlock(Fluid fluid, Material material, MapColor color) {
        super(fluid, material);
        setLightOpacity(4);
        setCreativeTab(GDTabs.tabBlock);
        mapColor = color;
    }

    @Override
    @Deprecated
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return mapColor;
    }

    @Override
    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        super.onBlockAdded(world, pos, state);

        this.mixFluids(world, pos);
    }

    @Override
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos neighbourPos) {
        super.neighborChanged(state, world, pos, neighborBlock, neighbourPos);

        this.mixFluids(world, pos);
    }

    public void mixFluids(World world, BlockPos pos) {
        for (EnumFacing side : EnumFacing.VALUES) {
            if (side != EnumFacing.DOWN) {
                IBlockState offset = world.getBlockState(pos.offset(side));
                if (offset.getMaterial().isLiquid()) {
                     if ((offset.getMaterial() == Material.LAVA) && (offset.getBlock() != GDBlocks.superhot_magma_block) && (offset.getBlock() instanceof BlockFluidBase || offset.getBlock() instanceof BlockLiquid)) {
                        world.setBlockState(pos, GDBlocks.gaia_cobblestone.getDefaultState());
                        this.playSound(world, pos);
                        break;
                    }
                }
            }
        }
    }

    protected void playSound(World worldIn, BlockPos pos) {
        double d0 = (double)pos.getX();
        double d1 = (double)pos.getY();
        double d2 = (double)pos.getZ();
        worldIn.playSound(null, pos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

        for (int i = 0; i < 8; ++i) {
            worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0 + Math.random(), d1 + 1.2D, d2 + Math.random(), 0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerModel() {
        final Item item = Item.getItemFromBlock(this);
        ModelBakery.registerItemVariants(item);
        String domain = getRegistryName() == null ? "minecraft" : getRegistryName().getNamespace();
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(domain + ":fluids", getFluid().getName());
        ModelLoader.setCustomMeshDefinition(item, stack -> modelResourceLocation);
        ModelLoader.setCustomStateMapper(this, new StateMapperBase() {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return modelResourceLocation;
            }
        });
    }
}
