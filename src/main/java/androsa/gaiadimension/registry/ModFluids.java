package androsa.gaiadimension.registry;

import androsa.gaiadimension.GaiaDimensionMod;
import androsa.gaiadimension.fluids.*;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(GaiaDimensionMod.MODID)
@Mod.EventBusSubscriber(modid = GaiaDimensionMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModFluids {

    public static final FlowingFluid mineral_water_still = new ForgeFlowingFluid.Source(GaiaFluidAttributes.mineral_water_properties);
    public static final FlowingFluid mineral_water_flow = new ForgeFlowingFluid.Flowing(GaiaFluidAttributes.mineral_water_properties);
    public static final FlowingFluid superhot_magma_still = new SuperhotMagmaFluid.Source(GaiaFluidAttributes.superhot_magma_properties);
    public static final FlowingFluid superhot_magma_flow = new SuperhotMagmaFluid.Flowing(GaiaFluidAttributes.superhot_magma_properties);
    public static final FlowingFluid sweet_muck_still = new SweetMuckFluid.Source(GaiaFluidAttributes.sweet_muck_properties);
    public static final FlowingFluid sweet_muck_flow = new SweetMuckFluid.Flowing(GaiaFluidAttributes.sweet_muck_properties);
    public static final FlowingFluid liquid_bismuth_still = new LiquidBismuthFluid.Source(GaiaFluidAttributes.liquid_bismuth_properties);
    public static final FlowingFluid liquid_bismuth_flow = new LiquidBismuthFluid.Flowing(GaiaFluidAttributes.liquid_bismuth_properties);
    public static final FlowingFluid liquid_aura_still = new ForgeFlowingFluid.Source(GaiaFluidAttributes.liquid_aura_properties);
    public static final FlowingFluid liquid_aura_flow = new ForgeFlowingFluid.Flowing(GaiaFluidAttributes.liquid_aura_properties);

    @SubscribeEvent
    public static void registerFluid(RegistryEvent.Register<Fluid> e) {
        final IForgeRegistry<Fluid> registry = e.getRegistry();

        registry.register(mineral_water_still.setRegistryName("mineral_water_still"));
        registry.register(mineral_water_flow.setRegistryName("mineral_water_flow"));
        registry.register(superhot_magma_still.setRegistryName("superhot_magma_still"));
        registry.register(superhot_magma_flow.setRegistryName("superhot_magma_flow"));
        registry.register(sweet_muck_still.setRegistryName("sweet_muck_still"));
        registry.register(sweet_muck_flow.setRegistryName("sweet_muck_flow"));
        registry.register(liquid_bismuth_still.setRegistryName("liquid_bismuth_still"));
        registry.register(liquid_bismuth_flow.setRegistryName("liquid_bismuth_flow"));
        registry.register(liquid_aura_still.setRegistryName("liquid_aura_still"));
        registry.register(liquid_aura_flow.setRegistryName("liquid_aura_flow"));
    }
}