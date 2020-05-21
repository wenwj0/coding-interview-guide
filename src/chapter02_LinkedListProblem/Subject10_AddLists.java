package chapter02_LinkedListProblem;

import java.util.Stack;

public class Subject10_AddLists {
    public Node addLists1(Node head1, Node head2){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while(head1!=null){
            stack1.push(head1.value);
            head1 = head1.next;
        }
        while(head2!=null){
            stack2.push(head2.value);
            stack2.push(head2.value);
        }
        int ca = 0;
        int n = 0;
        int n1 = 0;
        int n2 = 0;
        Node pre = null;
        Node node = null;

        while(!stack1.isEmpty() || !stack2.isEmpty()){
            n1 = stack1.isEmpty()?0:stack1.pop();
            n2 = stack2.isEmpty()?0:stack2.pop();
            n = n1 + n2 + ca;
            pre = node;
            node = new Node(n%10);
            node.next = pre;
            ca = n / 10;
        }
        if(ca != 0){
            pre = node;
            node = new Node(ca);
            node.next = pre;
        }
        return node;
    }
    public Node addLists2(Node head1, Node head2){
        head1 = reverseList(head1);
        head2 = reverseList(head2);
        int ca = 0;
        int n = 0;
        int n1 = 0;
        int n2 = 0;
        Node c1 = head1;
        Node c2 = head2;
        Node pre = null;
        Node node = null;
        while(c1!=null || c2!=null){
            n1 = c1==null?0:c1.value;
            n2 = c2==null?0:c2.value;
            n = ca + n1 + n2;
            pre = node;
            node = new Node(n%10);
            node.next = pre;
            ca = n / 10;
            c1 = c1==null?null:c1.next;
            c2 = c2==null?null:c2.next;
        }
        if(ca != 0){
            pre = node;
            node = new Node(ca);
            node.next = pre;
        }
        reverseList(head1);
        reverseList(head2);
        return node;
    }
    public Node reverseList(Node head){
        Node pre = null;
        Node next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
