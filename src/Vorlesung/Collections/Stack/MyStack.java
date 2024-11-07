package Vorlesung.Collections.Stack;

public class MyStack {
    private int[] stack;
    private int last;

    public MyStack(int size) {
        stack = new int[size];
        last = -1;
    }

    public boolean isEmpty() {
        return last == -1;
    }

    public boolean isFull() {
        return last == stack.length - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        }else{
            stack[++last] = value;
        }

    }

    public int pop() {
        if (isEmpty()) {
            System.out.print("Stack is empty --> Flag: ");
            return -1;
        }
        return stack[last--];
    }
}
