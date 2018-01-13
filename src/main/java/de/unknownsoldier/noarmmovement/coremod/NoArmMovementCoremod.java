package de.unknownsoldier.noarmmovement.coremod;

import de.unknownsoldier.noarmmovement.NoArmMovement;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import javax.annotation.Nullable;
import java.util.Map;

@IFMLLoadingPlugin.MCVersion("1.12.2")
public class NoArmMovementCoremod implements IFMLLoadingPlugin {

    @Override
    public String[] getASMTransformerClass() {
        return new String[] {Transformer.class.getName()};
    }

    @Override
    public String getModContainerClass() {
        return NoArmMovement.class.getName();
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
