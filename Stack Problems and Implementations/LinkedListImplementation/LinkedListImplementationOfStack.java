package stack.LinkedListImplementation;

import java.io.*;
import java.util.*;
public class LinkedListImplementationOfStack {
    public static void main(String[] args) {
        LLstack s = new LLstack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }

    // Node class for Linked list
    public static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    // Stack class
    public static class LLstack{
        Node head;
        int stackSize;
        LLstack(){
            head = null;
            stackSize = 0;
        }

        // adds element to the top of stack
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            stackSize++;
        }
        // removes the top element in the stack
        int pop(){
            if(head == null){
                return Integer.MAX_VALUE;
            }
            int res = head.data;
            Node temp = head;
            head = head.next;
            stackSize--;
            return res;
        }

        // size fxn returns the current size of the stack
        int size(){
            return stackSize;
        }

        // peek returns top element of the stack
        int peek(){
            if(head==null){
                return Integer.MAX_VALUE;
            }
            return head.data;
        }

        // isEmpty checks if stack is empty or not
        boolean isEmpty(){
            return head == null;
        }

    }
}
