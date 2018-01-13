package de.unknownsoldier.noarmmovement.coremod;

import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.*;

import java.util.Iterator;

public class Transformer implements IClassTransformer {

    public static final int LABEL_NUMBER = 19;

    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        if(name.equals("net.minecraft.client.renderer.ItemRenderer") || name.equals("buu")) {
            System.out.println("[NoArmMovement] Found Class..");
            ClassNode classNode = new ClassNode();
            ClassReader classReader = new ClassReader(basicClass);
            classReader.accept(classNode,0);
            Iterator<MethodNode> methods = classNode.methods.iterator();
            while(methods.hasNext()) {
                MethodNode m = (MethodNode) methods.next();
                if((m.name.equals("a") || m.name.equals("renderItemInFirstPerson")) && m.desc.equals("(F)V")) {
                    System.out.println("[NoArmMovement] Found Method..");
                    System.out.println("[NoArmMovement] Patching Method..");
                    Iterator<AbstractInsnNode> iterator = m.instructions.iterator();
                    int label = -1;
                    InsnList newList = new InsnList();
                    while(iterator.hasNext()) {
                        AbstractInsnNode node = iterator.next();
                        if(node instanceof LabelNode) {
                            LabelNode ln = (LabelNode) node;
                            label++;
                            if(label != LABEL_NUMBER) {
                                newList.add(node);
                            }
                        } else if (label != LABEL_NUMBER) {
                            newList.add(node);
                        }
                    }
                    m.instructions.clear();
                    m.instructions.add(newList);
                }
            }
            ClassWriter writer = new ClassWriter(1);
            classNode.accept(writer);
            return writer.toByteArray();
        }
        return basicClass;
    }
}
