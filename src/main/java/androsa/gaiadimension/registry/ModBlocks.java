package androsa.gaiadimension.registry;

import androsa.gaiadimension.GaiaDimensionMod;
import androsa.gaiadimension.block.*;
import androsa.gaiadimension.world.gen.tree.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

import static net.minecraftforge.common.ToolType.*;

@ObjectHolder(GaiaDimensionMod.MODID)
@Mod.EventBusSubscriber(modid = GaiaDimensionMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    //Utility Blocks
    public static final GaiaPortalBlock gaia_portal = new GaiaPortalBlock();
    public static final Block keystone_block = new BasicGaiaBlock(Material.IRON, MaterialColor.GOLD, 5.0F, 10.0F, SoundType.METAL, PICKAXE, 2);
    public static final Block gold_fire = new GoldFireBlock();
    public static final Block pyrite_torch = new PyriteTorchBlock();
    public static final Block pyrite_wall_torch = new PyriteWallTorchBlock();
    public static final Block agate_crafting_table = new AgateCraftingTableBlock();
    public static final Block crude_storage_crate = new SmallCrateBlock();
    public static final Block mega_storage_crate = new LargeCrateBlock();
    public static final Block gaia_stone_furnace = new GaiaStoneFurnaceBlock();
    public static final Block restructurer = new RestructurerBlock();
    public static final Block purifier = new PurifierBlock();
    /*public static final Block mineral_water_block = null;
    public static final Block superhot_magma_block = null;
    public static final Block sweet_muck_block = null;
    public static final Block liquid_bismuth_block = null;
    public static final Block liquid_aura_block = null;*/

    //Natural Blocks
    public static final Block heavy_soil = new GaiaSoilBlock(MaterialColor.PURPLE_TERRACOTTA);
    public static final Block corrupt_soil = new GaiaSoilBlock(MaterialColor.GRAY);
    public static final Block boggy_soil = new GaiaSoilBlock(MaterialColor.GRAY);
    public static final Block light_soil = new GaiaSoilBlock(MaterialColor.GOLD);
    public static final Block glitter_grass = new GlitterGrassBlock();
    public static final Block corrupt_grass = new CorruptGrassBlock();
    public static final Block murky_grass = new MurkyGrassBlock();
    public static final Block soft_grass = new SoftGrassBlock();
    public static final Block frail_glitter_block = new GaiaGlassBlock(MaterialColor.PINK, 1.0F);
    public static final Block thick_glitter_block = new BasicGaiaBlock(Material.ROCK, MaterialColor.PURPLE_TERRACOTTA, 1.5F, 7.5F, PICKAXE, 1);
    public static final Block gummy_glitter_block = new GummyGlitterBlock();
    public static final Block pink_sludge_block = new PinkSludgeBlock();
    public static final Block pink_agate_leaves = new AgateLeavesBlock(MaterialColor.MAGENTA);
    public static final Block blue_agate_leaves = new AgateLeavesBlock(MaterialColor.BLUE);
    public static final Block green_agate_leaves = new AgateLeavesBlock(MaterialColor.GREEN);
    public static final Block purple_agate_leaves = new AgateLeavesBlock(MaterialColor.PURPLE_TERRACOTTA);
    public static final Block fossilized_leaves = new AgateLeavesBlock(MaterialColor.YELLOW);
    public static final Block corrupted_leaves = new AgateLeavesBlock(MaterialColor.TNT);
    public static final Block burnt_leaves = new AgateLeavesBlock(MaterialColor.GRAY);
    public static final Block burning_leaves = new AgateLeavesBlock(MaterialColor.ORANGE_TERRACOTTA, 3);
    public static final Block aura_leaves = new AgateLeavesBlock(MaterialColor.IRON);

    //Logs
    public static final Block pink_agate_log = new AgateLogBlock(MaterialColor.MAGENTA, MaterialColor.PINK_TERRACOTTA);
    public static final Block blue_agate_log = new AgateLogBlock(MaterialColor.BLUE, MaterialColor.BLUE_TERRACOTTA);
    public static final Block green_agate_log = new AgateLogBlock(MaterialColor.GREEN, MaterialColor.LIME_TERRACOTTA);
    public static final Block purple_agate_log = new AgateLogBlock(MaterialColor.PURPLE_TERRACOTTA, MaterialColor.PURPLE);
    public static final Block fossilized_log = new AgateLogBlock(MaterialColor.YELLOW, MaterialColor.DIRT);
    public static final Block corrupted_log = new AgateLogBlock(MaterialColor.TNT, MaterialColor.GRAY_TERRACOTTA);
    public static final Block burnt_log = new AgateLogBlock(MaterialColor.GRAY, MaterialColor.BLACK_TERRACOTTA);
    public static final Block burning_log = new AgateLogBlock(MaterialColor.ADOBE, MaterialColor.ORANGE_TERRACOTTA, 3);
    public static final Block aura_log = new AgateLogBlock(MaterialColor.IRON, MaterialColor.GRAY);
    public static final Block stripped_pink_agate_log = new AgateLogBlock(MaterialColor.MAGENTA, MaterialColor.MAGENTA);
    public static final Block stripped_blue_agate_log = new AgateLogBlock(MaterialColor.BLUE, MaterialColor.BLUE);
    public static final Block stripped_green_agate_log = new AgateLogBlock(MaterialColor.GREEN, MaterialColor.GREEN);
    public static final Block stripped_purple_agate_log = new AgateLogBlock(MaterialColor.PURPLE_TERRACOTTA, MaterialColor.PURPLE_TERRACOTTA);
    public static final Block stripped_fossilized_log = new AgateLogBlock(MaterialColor.YELLOW, MaterialColor.YELLOW);
    public static final Block stripped_corrupted_log = new AgateLogBlock(MaterialColor.TNT, MaterialColor.TNT);
    public static final Block stripped_burnt_log = new AgateLogBlock(MaterialColor.GRAY, MaterialColor.GRAY);
    public static final Block stripped_burning_log = new AgateLogBlock(MaterialColor.ADOBE, MaterialColor.ADOBE, 3);
    public static final Block stripped_aura_log = new AgateLogBlock(MaterialColor.IRON, MaterialColor.IRON);
    public static final Block pink_agate_wood = new AgateLogBlock(MaterialColor.PINK_TERRACOTTA, MaterialColor.PINK_TERRACOTTA);
    public static final Block blue_agate_wood = new AgateLogBlock(MaterialColor.BLUE_TERRACOTTA, MaterialColor.BLUE_TERRACOTTA);
    public static final Block green_agate_wood = new AgateLogBlock(MaterialColor.LIME_TERRACOTTA, MaterialColor.LIME_TERRACOTTA);
    public static final Block purple_agate_wood = new AgateLogBlock(MaterialColor.PURPLE, MaterialColor.PURPLE);
    public static final Block fossilized_wood = new AgateLogBlock(MaterialColor.DIRT, MaterialColor.DIRT);
    public static final Block corrupted_wood = new AgateLogBlock(MaterialColor.GRAY_TERRACOTTA, MaterialColor.GRAY_TERRACOTTA);
    public static final Block burnt_wood = new AgateLogBlock(MaterialColor.BLACK_TERRACOTTA, MaterialColor.BLACK_TERRACOTTA);
    public static final Block burning_wood = new AgateLogBlock(MaterialColor.ORANGE_TERRACOTTA, MaterialColor.ORANGE_TERRACOTTA, 3);
    public static final Block aura_wood = new AgateLogBlock(MaterialColor.GRAY, MaterialColor.GRAY);

    public static final Block salt = new GaiaFallingBlock(MaterialColor.SNOW, 0.9F, SoundType.SAND, 0xE0E0FF);
    public static final Block saltstone = new BasicGaiaBlock(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA, 1.5F, 10.0F, PICKAXE, 0);
    public static final Block pebbles = new GaiaFallingBlock(MaterialColor.GRAY, 1.3F, SoundType.GROUND, 0x663366);
    public static final Block gaia_stone = new BasicGaiaBlock(Material.ROCK, MaterialColor.MAGENTA, 2.0F, 15.0F, PICKAXE, 1);
    public static final Block gaia_cobblestone = new BasicGaiaBlock(Material.ROCK, MaterialColor.MAGENTA, 2.0F, 15.0F, PICKAXE, 1);
    public static final Block wasteland_stone = new BasicGaiaBlock(Material.ROCK, MaterialColor.BLUE_TERRACOTTA, 15.0F, 200.0F, PICKAXE, 2);
    public static final Block static_stone = new StaticStoneBlock();
    public static final Block charged_mineral = new ChargedMineralBlock();
    public static final Block volcanic_rock = new BasicGaiaBlock(Material.ROCK, MaterialColor.GRAY_TERRACOTTA, 15.0F, 200.0F, PICKAXE, 2);
    public static final Block searing_rock = new SearingRockBlock();
    public static final Block primal_mass = new BasicGaiaBlock(Material.ROCK, MaterialColor.PURPLE_TERRACOTTA, 30.0F, 400.0F, PICKAXE, 2);
    public static final Block impure_rock = new BasicGaiaBlock(Material.ROCK, MaterialColor.GRAY, 20.0F, 300.0F, PICKAXE, 2);
    public static final Block active_rock = new ActiveRockBlock();
    public static final Block impure_sludge = new ImpureSludgeBlock();
    public static final Block geyser_block = new GeyserBlock();
    public static final Block sparkling_rock = new BasicGaiaBlock(Material.ROCK, MaterialColor.IRON, 10.0F, 150.0F, SoundType.GLASS, PICKAXE, 1);
    public static final Block aura_shoot = new AuraShootBlock();

    //Plants
    public static final Block crystal_growth = new CrystalGrowthBlock(MaterialColor.SNOW);
    public static final Block crystal_growth_red = new CrystalGrowthBlock(MaterialColor.RED);
    public static final Block crystal_growth_black = new CrystalGrowthBlock(MaterialColor.BLACK);
    public static final Block crystal_growth_seared = new CrystalGrowthBlock(MaterialColor.BLACK);
    public static final Block crystal_growth_mutant = new CrystalGrowthBlock(MaterialColor.WHITE_TERRACOTTA);
    public static final Block crystal_growth_aura = new CrystalGrowthBlock(MaterialColor.LIGHT_BLUE_TERRACOTTA);
    public static final Block thiscus = new CrystalBloomBlock();
    public static final Block ouzium = new CrystalBloomBlock();
    public static final Block agathum = new CrystalBloomBlock();
    public static final Block varloom = new CrystalBloomBlock();
    public static final Block corrupted_varloom = new CrystalBloomBlock();
    public static final Block missingno_plant = new CrystalBloomBlock();
    public static final Block spotted_kersei = new CrystalFungusBlock(MaterialColor.PINK, false);
    public static final Block thorny_wiltha = new CrystalFungusBlock(MaterialColor.LIGHT_BLUE, false);
    public static final Block roofed_agaric = new CrystalFungusBlock(MaterialColor.LIME, false);
    public static final Block bulbous_hobina = new CrystalFungusBlock(MaterialColor.PINK_TERRACOTTA, false);
    public static final Block stickly_cupsir = new CrystalFungusBlock(MaterialColor.YELLOW_TERRACOTTA, false);
    public static final Block mystical_murgni = new CrystalFungusBlock(MaterialColor.GOLD, false);
    public static final Block corrupted_gaia_eye = new CrystalFungusBlock(MaterialColor.TNT, false);
    //public static final Block sacred_gaia_eye = new CrystalFungusBlock(false);
    public static final Block elder_imklia = new CrystalFungusBlock(MaterialColor.PURPLE, true);
    public static final Block gold_orb_tucher = new CrystalFungusBlock(MaterialColor.GOLD, true);
    public static final Block missingno_fungus = new CrystalFungusBlock(MaterialColor.MAGENTA, false);
    public static final Block pink_agate_sapling = new AgateSaplingBlock(MaterialColor.PINK, new PinkAgateTree());
    public static final Block blue_agate_sapling = new AgateSaplingBlock(MaterialColor.LIGHT_BLUE, new BlueAgateTree());
    public static final Block green_agate_sapling = new AgateSaplingBlock(MaterialColor.LIME, new GreenAgateTree());
    public static final Block purple_agate_sapling = new AgateSaplingBlock(MaterialColor.PURPLE_TERRACOTTA, new PurpleAgateTree());
    public static final Block fossilized_sapling = new AgateSaplingBlock(MaterialColor.YELLOW_TERRACOTTA, new FossilizedTree());
    public static final Block corrupted_sapling = new AgateSaplingBlock(MaterialColor.BLACK_TERRACOTTA, new GoldstoneCorruptTree());
    public static final Block burnt_sapling = new AgateSaplingBlock(MaterialColor.BLACK, new BurntAgateTree());
    public static final Block burning_sapling = new AgateSaplingBlock(MaterialColor.ORANGE_TERRACOTTA, new FieryAgateTree());
    public static final Block aura_sapling = new AgateSaplingBlock(MaterialColor.SNOW, new AuraTree());

    //Planks
    public static final Block pink_agate_planks = new AgatePlanksBlock(MaterialColor.PINK);
    public static final Block blue_agate_planks = new AgatePlanksBlock(MaterialColor.LIGHT_BLUE);
    public static final Block green_agate_planks = new AgatePlanksBlock(MaterialColor.LIME);
    public static final Block purple_agate_planks = new AgatePlanksBlock(MaterialColor.PURPLE_TERRACOTTA);
    public static final Block fossilized_planks = new AgatePlanksBlock(MaterialColor.YELLOW_TERRACOTTA);
    public static final Block corrupted_planks = new AgatePlanksBlock(MaterialColor.BLACK_TERRACOTTA);
    public static final Block burnt_planks = new AgatePlanksBlock(MaterialColor.BLACK);
    public static final Block burning_planks = new AgatePlanksBlock(MaterialColor.ORANGE_TERRACOTTA, 3);
    public static final Block aura_planks = new AgatePlanksBlock(MaterialColor.SNOW);
    public static final Block pink_agate_plank_slab = new AgatePlanksSlabBlock(MaterialColor.PINK);
    public static final Block blue_agate_plank_slab = new AgatePlanksSlabBlock(MaterialColor.LIGHT_BLUE);
    public static final Block green_agate_plank_slab = new AgatePlanksSlabBlock(MaterialColor.LIME);
    public static final Block purple_agate_plank_slab = new AgatePlanksSlabBlock(MaterialColor.PURPLE_TERRACOTTA);
    public static final Block fossilized_plank_slab = new AgatePlanksSlabBlock(MaterialColor.YELLOW_TERRACOTTA);
    public static final Block corrupted_plank_slab = new AgatePlanksSlabBlock(MaterialColor.BLACK_TERRACOTTA);
    public static final Block burnt_plank_slab = new AgatePlanksSlabBlock(MaterialColor.BLACK);
    public static final Block burning_plank_slab = new AgatePlanksSlabBlock(MaterialColor.ORANGE_TERRACOTTA, 7);
    public static final Block aura_plank_slab = new AgatePlanksSlabBlock(MaterialColor.SNOW);
    public static final Block pink_agate_plank_stairs = new AgatePlankStairsBlock(pink_agate_planks.getDefaultState(), MaterialColor.PINK);
    public static final Block blue_agate_plank_stairs = new AgatePlankStairsBlock(blue_agate_planks.getDefaultState(), MaterialColor.LIGHT_BLUE);
    public static final Block green_agate_plank_stairs = new AgatePlankStairsBlock(green_agate_planks.getDefaultState(), MaterialColor.LIME);
    public static final Block purple_agate_plank_stairs = new AgatePlankStairsBlock(purple_agate_planks.getDefaultState(), MaterialColor.PURPLE_TERRACOTTA);
    public static final Block fossilized_plank_stairs = new AgatePlankStairsBlock(fossilized_planks.getDefaultState(), MaterialColor.YELLOW_TERRACOTTA);
    public static final Block corrupted_plank_stairs = new AgatePlankStairsBlock(corrupted_planks.getDefaultState(), MaterialColor.BLACK_TERRACOTTA);
    public static final Block burnt_plank_stairs = new AgatePlankStairsBlock(burnt_planks.getDefaultState(), MaterialColor.BLACK);
    public static final Block burning_plank_stairs = new AgatePlankStairsBlock(burning_planks.getDefaultState(), MaterialColor.ORANGE_TERRACOTTA, 7);
    public static final Block aura_plank_stairs = new AgatePlankStairsBlock(aura_planks.getDefaultState(), MaterialColor.SNOW);

    //Manufactured
    public static final Block cloudy_glass = new GaiaGlassBlock(MaterialColor.YELLOW, 0.7F);
    public static final Block foggy_glass = new GaiaGlassBlock(MaterialColor.LIGHT_BLUE, 0.7F);
    public static final Block gaia_stone_bricks = new BasicGaiaBlock(Material.ROCK, MaterialColor.MAGENTA, 2.0F, 20.0F, PICKAXE, 1);
    public static final Block cracked_gaia_stone_bricks = new BasicGaiaBlock(Material.ROCK, MaterialColor.MAGENTA, 2.0F, 20.0F, PICKAXE, 1);
    public static final Block crusted_gaia_stone_bricks = new BasicGaiaBlock(Material.ROCK, MaterialColor.MAGENTA, 2.0F, 20.0F, PICKAXE, 1);
    public static final Block reinforced_bricks = new BasicGaiaBlock(Material.ROCK, MaterialColor.PURPLE, 10.0F, 100.0F, PICKAXE, 1);
    public static final Block malachite_bricks = new MalachiteBricksBlock(false);
    public static final Block malachite_cracked_bricks = new MalachiteBricksBlock(false);
    public static final Block malachite_crusted_bricks = new MalachiteBricksBlock(false);
    public static final Block malachite_floor_tiles = new MalachiteBricksBlock(false);
    public static final Block malachite_chisel_bricks = new MalachiteBricksBlock(false);
    public static final Block malachite_pulsing_bricks = new MalachiteBricksBlock(true);
    public static final Block malachite_pulsing_tiles = new MalachiteBricksBlock(true);
    public static final Block malachite_pulsing_chisel = new MalachiteBricksBlock(true);
    public static final Block malachite_brick_slab = new MalachiteBrickSlabBlock();
    public static final Block malachite_floor_slab = new MalachiteBrickSlabBlock();
    public static final Block malachite_pillar = new MalachiteBrickPillarBlock();
    public static final Block malachite_brick_stairs = new MalachiteStairsBlock(malachite_bricks.getDefaultState(), false);
    public static final Block malachite_floor_stairs = new MalachiteStairsBlock(malachite_floor_tiles.getDefaultState(), false);
    public static final Block malachite_chisel_stairs = new MalachiteStairsBlock(malachite_chisel_bricks.getDefaultState(), false);
    public static final Block malachite_pulsing_brick_stairs = new MalachiteStairsBlock(malachite_bricks.getDefaultState(), true);
    public static final Block malachite_pulsing_floor_stairs = new MalachiteStairsBlock(malachite_floor_tiles.getDefaultState(), true);
    public static final Block malachite_pulsing_chisel_stairs = new MalachiteStairsBlock(malachite_chisel_bricks.getDefaultState(), true);
    public static final Block malachite_pillar_stairs = new MalachiteStairsBlock(malachite_pillar.getDefaultState(), false);
    public static final Block bolstered_bricks =  new BasicGaiaBlock(Material.ROCK, MaterialColor.SAND, 30.0F, 400.0F, PICKAXE, 2);

    //Storage Blocks
    public static final Block sugilite_block = new StorageBlock(MaterialColor.PURPLE);
    public static final Block hematite_block = new StorageBlock(MaterialColor.GRAY);
    public static final Block labradorite_block = new StorageBlock(MaterialColor.GREEN);
    public static final Block opal_block_red = new StorageBlock(MaterialColor.RED);
    public static final Block opal_block_blue = new StorageBlock(MaterialColor.LIGHT_BLUE);
    public static final Block opal_block_green = new StorageBlock(MaterialColor.LIME);
    public static final Block opal_block_white = new StorageBlock(MaterialColor.SNOW);
    public static final Block pyrite_block = new StorageBlock(MaterialColor.GOLD, 15);
    public static final Block moonstone_block = new StorageBlock(MaterialColor.IRON);
    public static final Block cinnabar_block = new StorageBlock(MaterialColor.ADOBE);
    public static final Block tektite_block = new StorageBlock(MaterialColor.BLACK);
    public static final Block goldstone_block = new StorageBlock(MaterialColor.BLACK);
    public static final Block aura_block = new StorageBlock(MaterialColor.ICE);
    public static final Block bismuth_block = new StorageBlock(MaterialColor.OBSIDIAN);
    public static final Block ixiolite_block = new StorageBlock(MaterialColor.GRAY);
    public static final Block proustite_block = new StorageBlock(MaterialColor.MAGENTA);
    public static final Block euclase_block = new StorageBlock(MaterialColor.LIME);
    public static final Block leucite_block = new StorageBlock(MaterialColor.SAND);
    public static final Block carnelian_block = new StorageBlock(MaterialColor.RED);
    public static final Block benitoite_block = new StorageBlock(MaterialColor.BLUE);
    public static final Block diopside_block = new StorageBlock(MaterialColor.LIME);
    public static final Block chalcedony_block = new StorageBlock(MaterialColor.SNOW);

    //Ores
    public static final Block sugilite_ore = new GaiaOreBlock(MaterialColor.PURPLE, 1, 0, 3);
    public static final Block hematite_ore = new GaiaOreBlock(MaterialColor.GRAY, 2, 1, 4);
    public static final Block pyrite_ore = new GaiaOreBlock(MaterialColor.GOLD, 2, 1, 4);
    public static final Block opal_ore_red = new GaiaOreBlock(MaterialColor.RED, 2, 2, 5);
    public static final Block opal_ore_blue = new GaiaOreBlock(MaterialColor.LIGHT_BLUE, 2, 2, 5);
    public static final Block opal_ore_green = new GaiaOreBlock(MaterialColor.LIME, 2, 2, 5);
    public static final Block opal_ore_white = new GaiaOreBlock(MaterialColor.SNOW, 3, 3, 7);
    public static final Block labradorite_ore = new GaiaOreBlock(MaterialColor.GREEN, 2, 5, 2);
    public static final Block moonstone_ore = new GaiaOreBlock(MaterialColor.IRON, 2, 5, 2);
    public static final Block cinnabar_ore = new GaiaOreBlock(MaterialColor.ADOBE, 2, 1, 4);
    public static final Block speckled_rock = new GaiaOreBlock(MaterialColor.MAGENTA, 1);
    public static final Block coarse_rock = new GaiaOreBlock(MaterialColor.MAGENTA, 2);
    public static final Block precious_rock = new GaiaOreBlock(MaterialColor.MAGENTA, 3);

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
        final IForgeRegistry<Block> registry = e.getRegistry();

        //Utility Blocks
        registry.register(gaia_portal.setRegistryName("gaia_portal"));
        registry.register(keystone_block.setRegistryName("keystone_block"));
        registry.register(gold_fire.setRegistryName("gold_fire"));
        registry.register(pyrite_torch.setRegistryName("pyrite_torch"));
        registry.register(pyrite_wall_torch.setRegistryName("pyrite_wall_torch"));
        registry.register(agate_crafting_table.setRegistryName("agate_crafting_table"));
        registry.register(crude_storage_crate.setRegistryName("crude_storage_crate"));
        registry.register(mega_storage_crate.setRegistryName("mega_storage_crate"));
        registry.register(gaia_stone_furnace.setRegistryName("gaia_stone_furnace"));
        registry.register(restructurer.setRegistryName("restructurer"));
        registry.register(purifier.setRegistryName("purifier"));
        //registry.register(mineral_water_block, new GDFluidBlock(GDFluids.mineralWater, Material.WATER, MapColor.LIGHT_BLUE_STAINED_HARDENED_CLAY));
        //registry.register(superhot_magma_block, new GDSuperhotMagma(GDFluids.superhotMagma, Material.LAVA).setLightLevel(1.0F));
        //registry.register(sweet_muck_block, new GDFluidBlock(GDFluids.sweetMuck, Material.WATER, MapColor.PURPLE));
        //registry.register(liquid_bismuth_block, new GDLiquidBismuth(GDFluids.liquidBismuth, Material.LAVA));
        //registry.register(liquid_aura_block, new GDLiquidAura(GDFluids.liquidAura, Material.WATER));

        //Natural Blocks
        registry.register(heavy_soil.setRegistryName("heavy_soil"));
        registry.register(corrupt_soil.setRegistryName("corrupt_soil"));
        registry.register(boggy_soil.setRegistryName("boggy_soil"));
        registry.register(light_soil.setRegistryName("light_soil"));
        registry.register(glitter_grass.setRegistryName("glitter_grass"));
        registry.register(corrupt_grass.setRegistryName("corrupt_grass"));
        registry.register(murky_grass.setRegistryName("murky_grass"));
        registry.register(soft_grass.setRegistryName("soft_grass"));
        registry.register(frail_glitter_block.setRegistryName("frail_glitter_block"));
        registry.register(thick_glitter_block.setRegistryName("thick_glitter_block"));
        registry.register(gummy_glitter_block.setRegistryName("gummy_glitter_block"));
        registry.register(pink_sludge_block.setRegistryName("pink_sludge_block"));

        //Plants
        registry.register(crystal_growth.setRegistryName("crystal_growth"));
        registry.register(crystal_growth_red.setRegistryName("crystal_growth_red"));
        registry.register(crystal_growth_black.setRegistryName("crystal_growth_black"));
        registry.register(crystal_growth_seared.setRegistryName("crystal_growth_seared"));
        registry.register(crystal_growth_mutant.setRegistryName("crystal_growth_mutant"));
        registry.register(crystal_growth_aura.setRegistryName("crystal_growth_aura"));
        registry.register(thiscus.setRegistryName("thiscus"));
        registry.register(ouzium.setRegistryName("ouzium"));
        registry.register(agathum.setRegistryName("agathum"));
        registry.register(varloom.setRegistryName("varloom"));
        registry.register(corrupted_varloom.setRegistryName("corrupted_varloom"));
        registry.register(missingno_plant.setRegistryName("missingno_plant"));
        registry.register(spotted_kersei.setRegistryName("spotted_kersei"));
        registry.register(thorny_wiltha.setRegistryName("thorny_wiltha"));
        registry.register(roofed_agaric.setRegistryName("roofed_agaric"));
        registry.register(bulbous_hobina.setRegistryName("bulbous_hobina"));
        registry.register(stickly_cupsir.setRegistryName("stickly_cupsir"));
        registry.register(mystical_murgni.setRegistryName("mystical_murgni"));
        registry.register(corrupted_gaia_eye.setRegistryName("corrupted_gaia_eye"));
        //registry.register(sacred_gaia_eye, new GDCrystalFungus(false));
        registry.register(elder_imklia.setRegistryName("elder_imklia"));
        registry.register(gold_orb_tucher.setRegistryName("gold_orb_tucher"));
        registry.register(missingno_fungus.setRegistryName("missingno_fungus"));

        //Trees
        registry.register(pink_agate_sapling.setRegistryName("pink_agate_sapling"));
        registry.register(blue_agate_sapling.setRegistryName("blue_agate_sapling"));
        registry.register(green_agate_sapling.setRegistryName("green_agate_sapling"));
        registry.register(purple_agate_sapling.setRegistryName("purple_agate_sapling"));
        registry.register(fossilized_sapling.setRegistryName("fossilized_sapling"));
        registry.register(corrupted_sapling.setRegistryName("corrupted_sapling"));
        registry.register(burnt_sapling.setRegistryName("burnt_sapling"));
        registry.register(burning_sapling.setRegistryName("burning_sapling"));
        registry.register(aura_sapling.setRegistryName("aura_sapling"));
        registry.register(pink_agate_leaves.setRegistryName("pink_agate_leaves"));
        registry.register(blue_agate_leaves.setRegistryName("blue_agate_leaves"));
        registry.register(green_agate_leaves.setRegistryName("green_agate_leaves"));
        registry.register(purple_agate_leaves.setRegistryName("purple_agate_leaves"));
        registry.register(fossilized_leaves.setRegistryName("fossilized_leaves"));
        registry.register(corrupted_leaves.setRegistryName("corrupted_leaves"));
        registry.register(burnt_leaves.setRegistryName("burnt_leaves"));
        registry.register(burning_leaves.setRegistryName("burning_leaves"));
        registry.register(aura_leaves.setRegistryName("aura_leaves"));
        registry.register(pink_agate_log.setRegistryName("pink_agate_log"));
        registry.register(blue_agate_log.setRegistryName("blue_agate_log"));
        registry.register(green_agate_log.setRegistryName("green_agate_log"));
        registry.register(purple_agate_log.setRegistryName("purple_agate_log"));
        registry.register(fossilized_log.setRegistryName("fossilized_log"));
        registry.register(corrupted_log.setRegistryName("corrupted_log"));
        registry.register(burnt_log.setRegistryName("burnt_log"));
        registry.register(burning_log.setRegistryName("burning_log"));
        registry.register(aura_log.setRegistryName("aura_log"));
        registry.register(stripped_pink_agate_log.setRegistryName("stripped_pink_agate_log"));
        registry.register(stripped_blue_agate_log.setRegistryName("stripped_blue_agate_log"));
        registry.register(stripped_green_agate_log.setRegistryName("stripped_green_agate_log"));
        registry.register(stripped_purple_agate_log.setRegistryName("stripped_purple_agate_log"));
        registry.register(stripped_fossilized_log.setRegistryName("stripped_fossilized_log"));
        registry.register(stripped_corrupted_log.setRegistryName("stripped_corrupted_log"));
        registry.register(stripped_burnt_log.setRegistryName("stripped_burnt_log"));
        registry.register(stripped_burning_log.setRegistryName("stripped_burning_log"));
        registry.register(stripped_aura_log.setRegistryName("stripped_aura_log"));
        registry.register(pink_agate_wood.setRegistryName("pink_agate_wood"));
        registry.register(blue_agate_wood.setRegistryName("blue_agate_wood"));
        registry.register(green_agate_wood.setRegistryName("green_agate_wood"));
        registry.register(purple_agate_wood.setRegistryName("purple_agate_wood"));
        registry.register(fossilized_wood.setRegistryName("fossilized_wood"));
        registry.register(corrupted_wood.setRegistryName("corrupted_wood"));
        registry.register(burnt_wood.setRegistryName("burnt_wood"));
        registry.register(burning_wood.setRegistryName("burning_wood"));
        registry.register(aura_wood.setRegistryName("aura_wood"));

        registry.register(salt.setRegistryName("salt"));
        registry.register(saltstone.setRegistryName("saltstone"));
        registry.register(pebbles.setRegistryName("pebbles"));
        registry.register(gaia_stone.setRegistryName("gaia_stone"));
        registry.register(gaia_cobblestone.setRegistryName("gaia_cobblestone"));
        registry.register(wasteland_stone.setRegistryName("wasteland_stone"));
        registry.register(static_stone.setRegistryName("static_stone"));
        registry.register(charged_mineral.setRegistryName("charged_mineral"));
        registry.register(volcanic_rock.setRegistryName("volcanic_rock"));
        registry.register(searing_rock.setRegistryName("searing_rock"));
        registry.register(primal_mass.setRegistryName("primal_mass"));
        registry.register(impure_rock.setRegistryName("impure_rock"));
        registry.register(active_rock.setRegistryName("active_rock"));
        registry.register(impure_sludge.setRegistryName("impure_sludge"));
        registry.register(geyser_block.setRegistryName("geyser_block"));
        registry.register(sparkling_rock.setRegistryName("sparkling_rock"));
        registry.register(aura_shoot.setRegistryName("aura_shoot"));

        //Planks
        registry.register(pink_agate_planks.setRegistryName("pink_agate_planks"));
        registry.register(blue_agate_planks.setRegistryName("blue_agate_planks"));
        registry.register(green_agate_planks.setRegistryName("green_agate_planks"));
        registry.register(purple_agate_planks.setRegistryName("purple_agate_planks"));
        registry.register(fossilized_planks.setRegistryName("fossilized_planks"));
        registry.register(corrupted_planks.setRegistryName("corrupted_planks"));
        registry.register(burnt_planks.setRegistryName("burnt_planks"));
        registry.register(burning_planks.setRegistryName("burning_planks"));
        registry.register(aura_planks.setRegistryName("aura_planks"));
        registry.register(pink_agate_plank_slab.setRegistryName("pink_agate_plank_slab"));
        registry.register(blue_agate_plank_slab.setRegistryName("blue_agate_plank_slab"));
        registry.register(green_agate_plank_slab.setRegistryName("green_agate_plank_slab"));
        registry.register(purple_agate_plank_slab.setRegistryName("purple_agate_plank_slab"));
        registry.register(fossilized_plank_slab.setRegistryName("fossilized_plank_slab"));
        registry.register(corrupted_plank_slab.setRegistryName("corrupted_plank_slab"));
        registry.register(burnt_plank_slab.setRegistryName("burnt_plank_slab"));
        registry.register(burning_plank_slab.setRegistryName("burning_plank_slab"));
        registry.register(aura_plank_slab.setRegistryName("aura_plank_slab"));
        registry.register(pink_agate_plank_stairs.setRegistryName("pink_agate_plank_stairs"));
        registry.register(blue_agate_plank_stairs.setRegistryName("blue_agate_plank_stairs"));
        registry.register(green_agate_plank_stairs.setRegistryName("green_agate_plank_stairs"));
        registry.register(purple_agate_plank_stairs.setRegistryName("purple_agate_plank_stairs"));
        registry.register(fossilized_plank_stairs.setRegistryName("fossilized_plank_stairs"));
        registry.register(corrupted_plank_stairs.setRegistryName("corrupted_plank_stairs"));
        registry.register(burnt_plank_stairs.setRegistryName("burnt_plank_stairs"));
        registry.register(burning_plank_stairs.setRegistryName("burning_plank_stairs"));
        registry.register(aura_plank_stairs.setRegistryName("aura_plank_stairs"));

        //Manufactured Blocks
        registry.register(cloudy_glass.setRegistryName("cloudy_glass"));
        registry.register(foggy_glass.setRegistryName("foggy_glass"));
        registry.register(gaia_stone_bricks.setRegistryName("gaia_stone_bricks"));
        registry.register(cracked_gaia_stone_bricks.setRegistryName("cracked_gaia_stone_bricks"));
        registry.register(crusted_gaia_stone_bricks.setRegistryName("crusted_gaia_stone_bricks"));
        registry.register(reinforced_bricks.setRegistryName("reinforced_bricks"));
        registry.register(malachite_bricks.setRegistryName("malachite_bricks"));
        registry.register(malachite_cracked_bricks.setRegistryName("malachite_cracked_bricks"));
        registry.register(malachite_crusted_bricks.setRegistryName("malachite_crusted_bricks"));
        registry.register(malachite_floor_tiles.setRegistryName("malachite_floor_tiles"));
        registry.register(malachite_chisel_bricks.setRegistryName("malachite_chisel_bricks"));
        registry.register(malachite_pulsing_bricks.setRegistryName("malachite_pulsing_bricks"));
        registry.register(malachite_pulsing_tiles.setRegistryName("malachite_pulsing_tiles"));
        registry.register(malachite_pulsing_chisel.setRegistryName("malachite_pulsing_chisel"));
        registry.register(malachite_brick_slab.setRegistryName("malachite_brick_slab"));
        registry.register(malachite_floor_slab.setRegistryName("malachite_floor_slab"));
        registry.register(malachite_pillar.setRegistryName("malachite_pillar"));
        registry.register(malachite_brick_stairs.setRegistryName("malachite_brick_stairs"));
        registry.register(malachite_chisel_stairs.setRegistryName("malachite_chisel_stairs"));
        registry.register(malachite_pulsing_brick_stairs.setRegistryName("malachite_pulsing_brick_stairs"));
        registry.register(malachite_pulsing_chisel_stairs.setRegistryName("malachite_pulsing_chisel_stairs"));
        registry.register(malachite_pillar_stairs.setRegistryName("malachite_pillar_stairs"));
        registry.register(malachite_floor_stairs.setRegistryName("malachite_floor_stairs"));
        registry.register(malachite_pulsing_floor_stairs.setRegistryName("malachite_pulsing_floor_stairs"));
        registry.register(bolstered_bricks.setRegistryName("bolstered_bricks"));

        //Storage Blocks
        registry.register(sugilite_block.setRegistryName("sugilite_block"));
        registry.register(hematite_block.setRegistryName("hematite_block"));
        registry.register(labradorite_block.setRegistryName("labradorite_block"));
        registry.register(opal_block_red.setRegistryName("opal_block_red"));
        registry.register(opal_block_blue.setRegistryName("opal_block_blue"));
        registry.register(opal_block_green.setRegistryName("opal_block_green"));
        registry.register(opal_block_white.setRegistryName("opal_block_white"));
        registry.register(pyrite_block.setRegistryName("pyrite_block"));
        registry.register(moonstone_block.setRegistryName("moonstone_block"));
        registry.register(cinnabar_block.setRegistryName("cinnabar_block"));
        registry.register(tektite_block.setRegistryName("tektite_block"));
        registry.register(goldstone_block.setRegistryName("goldstone_block"));
        registry.register(aura_block.setRegistryName("aura_block"));
        registry.register(bismuth_block.setRegistryName("bismuth_block"));
        registry.register(ixiolite_block.setRegistryName("ixiolite_block"));
        registry.register(proustite_block.setRegistryName("proustite_block"));
        registry.register(euclase_block.setRegistryName("euclase_block"));
        registry.register(leucite_block.setRegistryName("leucite_block"));
        registry.register(carnelian_block.setRegistryName("carnelian_block"));
        registry.register(benitoite_block.setRegistryName("benitoite_block"));
        registry.register(diopside_block.setRegistryName("diopside_block"));
        registry.register(chalcedony_block.setRegistryName("chalcedony_block"));

        //Ores
        registry.register(sugilite_ore.setRegistryName("sugilite_ore"));
        registry.register(hematite_ore.setRegistryName("hematite_ore"));
        registry.register(pyrite_ore.setRegistryName("pyrite_ore"));
        registry.register(opal_ore_red.setRegistryName("opal_ore_red"));
        registry.register(opal_ore_blue.setRegistryName("opal_ore_blue"));
        registry.register(opal_ore_green.setRegistryName("opal_ore_green"));
        registry.register(opal_ore_white.setRegistryName("opal_ore_white"));
        registry.register(labradorite_ore.setRegistryName("labradorite_ore"));
        registry.register(moonstone_ore.setRegistryName("moonstone_ore"));
        registry.register(cinnabar_ore.setRegistryName("cinnabar_ore"));
        registry.register(speckled_rock.setRegistryName("speckled_rock"));
        registry.register(coarse_rock.setRegistryName("coarse_rock"));
        registry.register(precious_rock.setRegistryName("precious_rock"));
    }
}
