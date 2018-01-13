package de.unknownsoldier.noarmmovement;

import com.google.common.eventbus.Subscribe;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventBus;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class NoArmMovement extends DummyModContainer {

    private static Logger logger;

    public NoArmMovement() {
        super(new ModMetadata());
        ModMetadata meta = getMetadata();
        meta.modId = "noarmmovement";
        meta.name = "NoArmMovement";
        meta.version = "1.0";
        meta.credits = "Unknown Soldier (Developer) and Emex (Idea)";
        meta.authorList = Arrays.asList(new String[] { "Unknown Soldier" });
        meta.description = "Disables the Arm Movement";
        meta.url = "";
        meta.screenshots = new String[0];
        meta.logoFile = "";
    }

    @Override
    public boolean registerBus(com.google.common.eventbus.EventBus bus, LoadController controller) {
        bus.register(this);
        return true;
    }

    @Subscribe
    public void modConstruction(FMLConstructionEvent evt){

    }

    @Subscribe
    public void preInit(FMLPreInitializationEvent evt) {

    }

    @Subscribe
    public void init(FMLInitializationEvent evt) {

    }


    @Subscribe
    public void postInit(FMLPostInitializationEvent evt) {

    }
}
