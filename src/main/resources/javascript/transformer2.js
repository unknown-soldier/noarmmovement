function initializeCoreMod() {
	print("Init NoArmMovement Core...");
    return {
        'coreModName': {
            'target': {
                'type': 'METHOD',
                'class': 'net.minecraft.client.renderer.FirstPersonRenderer',
                'methodName': 'func_78440_a',
                'methodDesc': '(F)V'
            },
            'transformer': function(method) {
            	print("Patching Method...");
            	var label = 38;
            	var currentLabel = 0
            	var Opcodes = Java.type('org.objectweb.asm.Opcodes');
                var InsnNode = Java.type('org.objectweb.asm.tree.InsnNode');
                var InsnList = Java.type('org.objectweb.asm.tree.InsnList');
                var newList = new InsnList();
                for(i=0;i<method.instructions.size();i++) {
                	var insn = method.instructions.get(i);
                	if(insn instanceof Java.type("org.objectweb.asm.tree.LabelNode")) {
                		currentLabel++;
                	}
                	if(currentLabel != label) {
                		newList.add(insn);
                	}
                }
                method.instructions.clear();
                method.instructions.add(newList);
                return method;
            }
        }
    }
}