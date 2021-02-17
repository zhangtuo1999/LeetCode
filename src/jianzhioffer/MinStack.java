package jianzhioffer;

import java.util.Stack;

public class MinStack {
    int val;
    Stack<Integer> data=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public MinStack() {}
    public MinStack(int i) { val=i; }

    public void push(int x) {
        data.push(x);
        if(min.empty())
            min.push(x);
        else min.push(Math.min(x,min.peek()));
    }

    public void pop() {
        min.pop();
        data.pop();
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
}
