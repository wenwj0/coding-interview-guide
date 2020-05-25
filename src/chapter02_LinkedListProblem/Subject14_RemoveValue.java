package chapter02_LinkedListProblem;

import java.util.Stack;

public class Subject14_RemoveValue {
    public Node removeValue1(Node head, int num){
        Stack<Node> stack = new Stack<>();
        while(head!=null){
            if(head.value!=num)
                stack.push(head);
            head = head.next;
        }
        while(!stack.isEmpty()){
            stack.peek().next = head;
            head = stack.pop();
        }
        return head;
    }
    public Node removeValue2(Node head, int num){
        while(head!=null){
            if(head.value!=num){
                break;
            }
            head = head.next;
        }
        Node pre = head;
        Node cur = head;
        while(cur!=null){
            if(cur.value==num){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node h1 = new Node(2);
        Node h2 = new Node(3);
        Node h3 = new Node(3);
        h1.next = h2;
        h2.next = h3;
        Node res = new Subject14_RemoveValue().removeValue1(h1,2);
        while(res!=null) {
            System.out.println(res.value);
            res = res.next;
        }
    }
}
