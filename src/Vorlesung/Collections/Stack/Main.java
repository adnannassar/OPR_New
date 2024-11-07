package Vorlesung.Collections.Stack;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        System.out.println(stack.pop()); // Stack is empty!

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.push(6); // Stack is full

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());
    }
}
