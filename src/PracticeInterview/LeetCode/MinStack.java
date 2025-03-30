package PracticeInterview.LeetCode;

import java.util.Stack;

public class MinStack {
//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//Implement the MinStack class:
//MinStack() initializes the stack object.
//void push(int val) pushes the element val onto the stack.
//void pop() removes the element on the top of the stack.
//int top() gets the top element of the stack.
//int getMin() retrieves the minimum element in the stack.
//You must implement a solution with O(1) time complexity for each function.
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public static void main(String[] args) {
        MinStack min = new MinStack();
        min.push(2);
        min.push(3);
        min.push(-3);
        System.out.println(min.getMin());
        System.out.println(min.pop());
        System.out.println(min.getMin());
        System.out.println(min.top());
        System.out.println(min.pop());
        System.out.println(min.getMin());
    }

    void push(int i) {
        stack.push(i);
        if (minstack.empty()) {
            minstack.push(i);
        } else if (i < minstack.peek()) {
            minstack.push(i);
        } else {
            minstack.push(minstack.peek());
        }
    }

    int pop()
    {

        minstack.pop();
        return stack.pop();
    }
    int top()
    {
       return stack.peek();
    }

    int getMin()
    {
       return minstack.peek();
    }
}
