package ch11;

import java.util.Stack;

public class S05 {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<String>();

        stack.push("사과");
        stack.push("바나나");
        stack.push("멜론");

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);

    }
}
