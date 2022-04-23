package com.timelesskeper.spartanextramaterial;

import com.timelesskeper.spartanextramaterial.data.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SpartanExtraMaterialMod.MOD_ID)
public class SpartanExtraMaterialMod
{
    public static final String MOD_ID = "spartanextramaterial";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public SpartanExtraMaterialMod() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemRegisterEvent(final RegistryEvent.Register<Item> blockRegistryEvent) {

            IForgeRegistry<Item> reg = blockRegistryEvent.getRegistry();

            reg.register(ModItems.daggerAluminium);
            reg.register(ModItems.parringDaggerAluminium);
            reg.register(ModItems.longswordAluminium);
            reg.register(ModItems.katanaAluminium);
            reg.register(ModItems.saberAluminium);
            reg.register(ModItems.rapierAluminium);
            reg.register(ModItems.greatswordAluminium);
            reg.register(ModItems.battleHammerAluminium);
            reg.register(ModItems.warhammerAluminium);
            reg.register(ModItems.spearAluminium);
            reg.register(ModItems.halbergAluminium);
            reg.register(ModItems.pikeAluminium);
            reg.register(ModItems.lanceAluminium);
            reg.register(ModItems.longbowAluminium);
            reg.register(ModItems.heavyCrossbowAluminium);
            reg.register(ModItems.throwingKnifeAluminium);
            reg.register(ModItems.tomahawkAluminium);
            reg.register(ModItems.javelinAluminium);
            reg.register(ModItems.boomerangAluminium);
            reg.register(ModItems.battleaxeAluminium);
            reg.register(ModItems.flangedMaceAluminium);
            reg.register(ModItems.glaiveAluminium);
            reg.register(ModItems.quarterstaffAluminium);
            reg.register(ModItems.scytheAluminium);


            reg.register(ModItems.daggerOsmium);
            reg.register(ModItems.parringDaggerOsmium);
            reg.register(ModItems.longswordOsmium);
            reg.register(ModItems.katanaOsmium);
            reg.register(ModItems.saberOsmium);
            reg.register(ModItems.rapierOsmium);
            reg.register(ModItems.greatswordOsmium);
            reg.register(ModItems.battleHammerOsmium);
            reg.register(ModItems.warhammerOsmium);
            reg.register(ModItems.spearOsmium);
            reg.register(ModItems.halbergOsmium);
            reg.register(ModItems.pikeOsmium);
            reg.register(ModItems.lanceOsmium);
            reg.register(ModItems.longbowOsmium);
            reg.register(ModItems.heavyCrossbowOsmium);
            reg.register(ModItems.throwingKnifeOsmium);
            reg.register(ModItems.tomahawkOsmium);
            reg.register(ModItems.javelinOsmium);
            reg.register(ModItems.boomerangOsmium);
            reg.register(ModItems.battleaxeOsmium);
            reg.register(ModItems.flangedMaceOsmium);
            reg.register(ModItems.glaiveOsmium);
            reg.register(ModItems.quarterstaffOsmium);
            reg.register(ModItems.scytheOsmium);


            reg.register(ModItems.daggerZinc);
            reg.register(ModItems.parringDaggerZinc);
            reg.register(ModItems.longswordZinc);
            reg.register(ModItems.katanaZinc);
            reg.register(ModItems.saberZinc);
            reg.register(ModItems.rapierZinc);
            reg.register(ModItems.greatswordZinc);
            reg.register(ModItems.battleHammerZinc);
            reg.register(ModItems.warhammerZinc);
            reg.register(ModItems.spearZinc);
            reg.register(ModItems.halbergZinc);
            reg.register(ModItems.pikeZinc);
            reg.register(ModItems.lanceZinc);
            reg.register(ModItems.longbowZinc);
            reg.register(ModItems.heavyCrossbowZinc);
            reg.register(ModItems.throwingKnifeZinc);
            reg.register(ModItems.tomahawkZinc);
            reg.register(ModItems.javelinZinc);
            reg.register(ModItems.boomerangZinc);
            reg.register(ModItems.battleaxeZinc);
            reg.register(ModItems.flangedMaceZinc);
            reg.register(ModItems.glaiveZinc);
            reg.register(ModItems.quarterstaffZinc);
            reg.register(ModItems.scytheZinc);


            reg.register(ModItems.daggerTungsten);
            reg.register(ModItems.parringDaggerTungsten);
            reg.register(ModItems.longswordTungsten);
            reg.register(ModItems.katanaTungsten);
            reg.register(ModItems.saberTungsten);
            reg.register(ModItems.rapierTungsten);
            reg.register(ModItems.greatswordTungsten);
            reg.register(ModItems.battleHammerTungsten);
            reg.register(ModItems.warhammerTungsten);
            reg.register(ModItems.spearTungsten);
            reg.register(ModItems.halbergTungsten);
            reg.register(ModItems.pikeTungsten);
            reg.register(ModItems.lanceTungsten);
            reg.register(ModItems.longbowTungsten);
            reg.register(ModItems.heavyCrossbowTungsten);
            reg.register(ModItems.throwingKnifeTungsten);
            reg.register(ModItems.tomahawkTungsten);
            reg.register(ModItems.javelinTungsten);
            reg.register(ModItems.boomerangTungsten);
            reg.register(ModItems.battleaxeTungsten);
            reg.register(ModItems.flangedMaceTungsten);
            reg.register(ModItems.glaiveTungsten);
            reg.register(ModItems.quarterstaffTungsten);
            reg.register(ModItems.scytheTungsten);


            reg.register(ModItems.daggerTitanium);
            reg.register(ModItems.parringDaggerTitanium);
            reg.register(ModItems.longswordTitanium);
            reg.register(ModItems.katanaTitanium);
            reg.register(ModItems.saberTitanium);
            reg.register(ModItems.rapierTitanium);
            reg.register(ModItems.greatswordTitanium);
            reg.register(ModItems.battleHammerTitanium);
            reg.register(ModItems.warhammerTitanium);
            reg.register(ModItems.spearTitanium);
            reg.register(ModItems.halbergTitanium);
            reg.register(ModItems.pikeTitanium);
            reg.register(ModItems.lanceTitanium);
            reg.register(ModItems.longbowTitanium);
            reg.register(ModItems.heavyCrossbowTitanium);
            reg.register(ModItems.throwingKnifeTitanium);
            reg.register(ModItems.tomahawkTitanium);
            reg.register(ModItems.javelinTitanium);
            reg.register(ModItems.boomerangTitanium);
            reg.register(ModItems.battleaxeTitanium);
            reg.register(ModItems.flangedMaceTitanium);
            reg.register(ModItems.glaiveTitanium);
            reg.register(ModItems.quarterstaffTitanium);
            reg.register(ModItems.scytheTitanium);


            reg.register(ModItems.daggerCupronickel);
            reg.register(ModItems.parringDaggerCupronickel);
            reg.register(ModItems.longswordCupronickel);
            reg.register(ModItems.katanaCupronickel);
            reg.register(ModItems.saberCupronickel);
            reg.register(ModItems.rapierCupronickel);
            reg.register(ModItems.greatswordCupronickel);
            reg.register(ModItems.battleHammerCupronickel);
            reg.register(ModItems.warhammerCupronickel);
            reg.register(ModItems.spearCupronickel);
            reg.register(ModItems.halbergCupronickel);
            reg.register(ModItems.pikeCupronickel);
            reg.register(ModItems.lanceCupronickel);
            reg.register(ModItems.longbowCupronickel);
            reg.register(ModItems.heavyCrossbowCupronickel);
            reg.register(ModItems.throwingKnifeCupronickel);
            reg.register(ModItems.tomahawkCupronickel);
            reg.register(ModItems.javelinCupronickel);
            reg.register(ModItems.boomerangCupronickel);
            reg.register(ModItems.battleaxeCupronickel);
            reg.register(ModItems.flangedMaceCupronickel);
            reg.register(ModItems.glaiveCupronickel);
            reg.register(ModItems.quarterstaffCupronickel);
            reg.register(ModItems.scytheCupronickel);


            reg.register(ModItems.daggerAluminium_Brass);
            reg.register(ModItems.parringDaggerAluminium_Brass);
            reg.register(ModItems.longswordAluminium_Brass);
            reg.register(ModItems.katanaAluminium_Brass);
            reg.register(ModItems.saberAluminium_Brass);
            reg.register(ModItems.rapierAluminium_Brass);
            reg.register(ModItems.greatswordAluminium_Brass);
            reg.register(ModItems.battleHammerAluminium_Brass);
            reg.register(ModItems.warhammerAluminium_Brass);
            reg.register(ModItems.spearAluminium_Brass);
            reg.register(ModItems.halbergAluminium_Brass);
            reg.register(ModItems.pikeAluminium_Brass);
            reg.register(ModItems.lanceAluminium_Brass);
            reg.register(ModItems.longbowAluminium_Brass);
            reg.register(ModItems.heavyCrossbowAluminium_Brass);
            reg.register(ModItems.throwingKnifeAluminium_Brass);
            reg.register(ModItems.tomahawkAluminium_Brass);
            reg.register(ModItems.javelinAluminium_Brass);
            reg.register(ModItems.boomerangAluminium_Brass);
            reg.register(ModItems.battleaxeAluminium_Brass);
            reg.register(ModItems.flangedMaceAluminium_Brass);
            reg.register(ModItems.glaiveAluminium_Brass);
            reg.register(ModItems.quarterstaffAluminium_Brass);
            reg.register(ModItems.scytheAluminium_Brass);


            reg.register(ModItems.daggerBrass);
            reg.register(ModItems.parringDaggerBrass);
            reg.register(ModItems.longswordBrass);
            reg.register(ModItems.katanaBrass);
            reg.register(ModItems.saberBrass);
            reg.register(ModItems.rapierBrass);
            reg.register(ModItems.greatswordBrass);
            reg.register(ModItems.battleHammerBrass);
            reg.register(ModItems.warhammerBrass);
            reg.register(ModItems.spearBrass);
            reg.register(ModItems.halbergBrass);
            reg.register(ModItems.pikeBrass);
            reg.register(ModItems.lanceBrass);
            reg.register(ModItems.longbowBrass);
            reg.register(ModItems.heavyCrossbowBrass);
            reg.register(ModItems.throwingKnifeBrass);
            reg.register(ModItems.tomahawkBrass);
            reg.register(ModItems.javelinBrass);
            reg.register(ModItems.boomerangBrass);
            reg.register(ModItems.battleaxeBrass);
            reg.register(ModItems.flangedMaceBrass);
            reg.register(ModItems.glaiveBrass);
            reg.register(ModItems.quarterstaffBrass);
            reg.register(ModItems.scytheBrass);

        }
    }
}
