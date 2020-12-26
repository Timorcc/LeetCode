package JzOffer;

import jdk.internal.org.objectweb.asm.tree.JumpInsnNode;

/**
 * @author lga
 * @date 2020-12-23 9:25
 * @desc
 */
public class No9 {
    public static int JumpFloorII(int target) {

        if (target == 0) return 1;
        if (target == 1) return 1;
        if (target == 2) return 2;
        int sum = 0;
        while (target > 0) {
            target--;
            sum += JumpFloorII(target);

        }
        return sum;
    }

    public static void main(String[] args) {
        int res = JumpFloorII(3);
        System.out.println(res);
    }

}
