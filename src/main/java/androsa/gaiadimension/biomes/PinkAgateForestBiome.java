package androsa.gaiadimension.biomes;

import androsa.gaiadimension.registry.GaiaBiomeFeatures;
import androsa.gaiadimension.registry.ModEntities;
import net.minecraft.entity.EntityClassification;

public class PinkAgateForestBiome extends BaseGaiaBiome {

    public PinkAgateForestBiome(Builder props) {
        super(props);

        GaiaBiomeFeatures.addCarverNormal(this);
        GaiaBiomeFeatures.addMagmaLakes(this);
        GaiaBiomeFeatures.addMineralLakes(this);
        GaiaBiomeFeatures.addPocketsUnderground(this);
        GaiaBiomeFeatures.addBasicOres(this);
        GaiaBiomeFeatures.addRedOpals(this);
        GaiaBiomeFeatures.addWhiteOpals(this);
        GaiaBiomeFeatures.addPinkAgateTrees(this);
        GaiaBiomeFeatures.addCrystalGrowthNormal(this, 3);
        GaiaBiomeFeatures.addBloomsNormal(this);
        GaiaBiomeFeatures.addPinkMushrooms(this);
        GaiaBiomeFeatures.addUndergroundMushrooms(this);
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(ModEntities.GROWTH_SAPPER, 20, 3, 5));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(ModEntities.AGATE_GOLEM, 15, 1, 2));

        //flowers.add(new FlowerEntry(GDBlocks.spotted_kersei.getDefaultState(), 5));
    }

    /*@Override
    public WorldGenAbstractTree getRandomTreeFeature(Random par1Random) {
        return par1Random.nextInt(5) == 0 ? new GDGenNoTrees() : par1Random.nextInt(3) == 0 ? GaiaGenPinkTrees : new GDGenNoTrees();
    }*/
}