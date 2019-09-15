function initializeCoreMod() {
    return {
        'coreModName': {
            'target': {
                'type': 'METHOD',
                'class': 'net.minecraft.client.renderer.FirstPersonRenderer',
                'methodName': 'rotateArm',
                'methodDesc': '(F)V'
            },
            'transformer': function(method) {
            	var Opcodes = Java.type('org.objectweb.asm.Opcodes');
                var InsnNode = Java.type('org.objectweb.asm.tree.InsnNode');
                method.instructions.insert(new InsnNode(Opcodes.RETURN));
                return method;
            }
        }
    }
}