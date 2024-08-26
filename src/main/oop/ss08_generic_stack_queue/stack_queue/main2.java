package main.oop.ss08_generic_stack_queue.stack_queue;

import java.util.Stack;

public class main2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        int n=0;
        while (n>0){
            stack.push(n % 2);
            n/=2;
        }

        int size= stack.size();
        for (int i=0; i < size; i++){
            System.out.println(stack.pop());
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
