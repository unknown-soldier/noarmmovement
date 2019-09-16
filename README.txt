!Important!
This Mod isn't currently working directly with Optifine (1.14.4) because Optifine also patches the Renderer Class and changing the Priority causes a Crash. You can remove the following Files from the Optifine Jar to make it work, however i don't know how this effects the functionallity of Optifine.
-patch/srg/net/minecraft/client/renderer/FirstPersonRenderer.class.md5
-patch/srg/net/minecraft/client/renderer/FirstPersonRenderer.class.xdelta
-patch/srg/net/minecraft/client/renderer/FirstPersonRenderer$1.class.md5
-patch/srg/net/minecraft/client/renderer/FirstPersonRenderer$1.class.xdelta
The 1.12.2 Version should work fine with Optifine.

What does this Mod do?
It removes the Code from the FirstPersonRenderer Class that makes the Arm Swing when you look around.

Is it copatible with Optifine?
See above
