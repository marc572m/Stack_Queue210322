package com.company;

public class Main {

    public static void main(String[] args) {
        Stack s = new Stack(20);
        s.push(4);
        s.push(9);
        s.push(47);
        s.push(12);
        s.push(5);
        s.pop();
        s.pop();

        s.printStack();
        System.out.println("Top of stack = " + s.peek());
        System.out.println("Is the stack empty? " + s.empty());

        System.out.println("Size of Stack = " + s.getSize());

        System.out.println("Queue");
        Queue q = new Queue(20);
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.remove();
        q.printQueue();
        System.out.println("Top of Queue = " + q.peek());
        System.out.println("Is queue empty? " + q.empty());
        System.out.println("Size of Queue = " + q.getSize());






    }
}
