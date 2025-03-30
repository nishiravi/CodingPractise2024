package PracticeInterview.LeetCode;

import java.util.Stack;

public class QueueusingStacks {
//https://leetcode.com/problems/implement-queue-using-stacks/description/

        Stack<Integer> pushstack=new Stack<>();
        Stack<Integer> popstack=new Stack<>();
    public static void main(String[] args) {

        QueueusingStacks q=new QueueusingStacks();
        q.push(1);
        q.push(2);
        System.out.println(q.peek());
        System.out.println(q.pop());
        q.push(3);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.empty());
    }
    public void push(int i)
    {
      while(!popstack.empty())
      {
          pushstack.push(popstack.pop());
      }
     System.out.println("queue is"+ pushstack.push(i));
    }
    public int pop()
    {
        while(!pushstack.empty())
        {
            popstack.push(pushstack.pop());
        }

       return  popstack.pop();
    }
    public int peek()
    {
        while(!pushstack.empty())
        {
            popstack.push(pushstack.pop());
        }

        return  popstack.peek();
    }
    public boolean empty()
    {
        if(popstack.empty() && pushstack.empty()){
            return true;
        } else {
                return false;
        }

    }
}
