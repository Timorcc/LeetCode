package StackQueue;

import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;
import javafx.scene.shape.ClosePathBuilder;

import java.util.Stack;

public class No20 {
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (char a : s.toCharArray()
        ) {
            if (a == '(') stack.push(')');
            else if (a == '[') stack.push(']');
            else if (a == '{') stack.push('}');
            else if (stack.isEmpty() || a != stack.pop()) return false;
        }
        return stack.isEmpty();

    }
}
