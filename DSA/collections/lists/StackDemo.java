package DSA.collections.lists;

import java.util.Stack;

public class StackDemo {
    
    public static void main(String[] args) {
        // Stack example code would go here
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack elements: " + stack);
        System.out.println("Stack size: " + stack.size());
        stack.pop();
    }
}
