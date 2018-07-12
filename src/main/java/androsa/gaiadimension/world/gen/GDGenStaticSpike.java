package androsa.gaiadimension.world.gen;

import androsa.gaiadimension.registry.GDBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Random;

public class GDGenStaticSpike extends GDGenerator {

    private final Block block;
    private final int startHeight;

    public GDGenStaticSpike(Block blockIn, int startHeightIn) {
        super(false);
        this.block = blockIn;
        this.startHeight = startHeightIn;
    }

    @ParametersAreNonnullByDefault
    public boolean generate(World worldIn, Random rand, BlockPos position) {

        for (int cx = 0; cx < 3; cx++) {
            for (int cz = 0; cz < 3; cz++) {
                BlockPos pos = position.down();

                if (worldIn.isBlockLoaded(pos)) {
                    Block blockBelow = worldIn.getBlockState(pos.down()).getBlock();

                    if (blockBelow != GDBlocks.wastelandStone && blockBelow != GDBlocks.staticStone) {
                        return false;
                    }
                }
            }
        }


        int height = startHeight + rand.nextInt(4);

        for (int i = 0; i < height; i++) {
            worldIn.setBlockState(position.up(i), this.block.getDefaultState());

            if (i < height / 2) {
                for (int j = 0; j < height / 2 + 1; j++) {
                    worldIn.setBlockState(position.add(0, j, -1), this.block.getDefaultState());
                    worldIn.setBlockState(position.add(0, j, 1), this.block.getDefaultState());
                    worldIn.setBlockState(position.add(-1, j, 0), this.block.getDefaultState());
                    worldIn.setBlockState(position.add(1, j, 0), this.block.getDefaultState());

                    if (j < height / 4) {
                        for (int k = 0; k < height / 4 + 1; k++) {
                            worldIn.setBlockState(position.add(1, k, -1), this.block.getDefaultState());
                            worldIn.setBlockState(position.add(1, k, 1), this.block.getDefaultState());
                            worldIn.setBlockState(position.add(-1, k, -1), this.block.getDefaultState());
                            worldIn.setBlockState(position.add(-1, k, 1), this.block.getDefaultState());
                        }
                    }
                }
            }
        }
        return true;
    }
}
