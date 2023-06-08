package DSA;

import java.util.Stack;

public class Stack_code {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(34);
        stack.push(32);
        stack.push(43);
        stack.push(54);
        stack.push(76);
        stack.push(23);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
