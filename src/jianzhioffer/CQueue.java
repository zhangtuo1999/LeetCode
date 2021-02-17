package jianzhioffer;

import java.util.Stack;

public class CQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public CQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if (!s2.empty()) {        //先看s2是不是空，如果不空就直接出栈
            return s2.pop();
        } else {                  //如果s2空，就看s1是不是空，
            if (!s1.empty()) {    //s1不空，全部出栈进s2
                while (!s1.empty())
                    s2.push(s1.pop());
                return s2.pop();
            } else               //s1空，返回-1
                return -1;
        }
    }

}
