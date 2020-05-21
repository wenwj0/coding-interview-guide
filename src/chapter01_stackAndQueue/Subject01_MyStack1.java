package chapter01_stackAndQueue;

import java.util.Stack;

public class Subject01_MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public Subject01_MyStack1(){
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }
    public void push(int newNum){
        if(this.stackData.isEmpty()){
            this.stackMin.push(newNum);
        }else if(newNum <= this.getMin()){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }
    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        int value = this.stackData.pop();
        if(value==this.getMin()){
            this.stackMin.pop();
        }
        return value;
    }
    public int getMin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }
}
