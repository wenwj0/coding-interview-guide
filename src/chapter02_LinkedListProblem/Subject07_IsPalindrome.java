package chapter02_LinkedListProblem;

import java.util.HashMap;

public class Subject07_IsPalindrome {
    public boolean isPalindrome(Node head){
        if(head==null || head.next == null )
            return true;
        Node fast = head.next;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        head2 = reverseNode(head2);
        while(head!=null && head2!=null){
            if(head.value!=head2.value)
                return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
    public Node reverseNode(Node head){
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

    public static void main(String[] args) {
        Node h1 = new Node(1);
        Node h2 = new Node(2);
        Node h3 = new Node(2);
        Node h4 = new Node(1);
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        System.out.println(new Subject07_IsPalindrome().isPalindrome(h1));
    }
}
