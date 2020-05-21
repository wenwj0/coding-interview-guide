package chapter01_stackAndQueue;

import java.util.Stack;

public class Subject01_MyStack2 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    public Subject01_MyStack2(){
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }
    public void push(int newNum){
        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if(newNum < this.getMin()){
            this.stackMin.push(newNum);
        }else{
            int newMin = this.stackMin.peek();
            this.stackMin.push(newMin);
        }
        this.stackData.push(newNum);
    }
    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("Your stack is Empty.");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }
    public int getMin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }
}
