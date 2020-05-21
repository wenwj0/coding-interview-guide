package chapter02_LinkedListProblem;

public class Subject02_RemoveLastKthNode {
    public DoubleNode removeLastKthNode(DoubleNode head, int lastKth){
        if(head==null || lastKth<1) return head;
        DoubleNode cur = head;
        while(cur!=null){
            lastKth--;
            cur = cur.next;
        }
        if(lastKth==0){
            head = head.next;
            head.last = null;
        }
        if(lastKth<0){
            cur = head;
            while(++lastKth!=0){
                cur = cur.next;
            }
            DoubleNode newNext = cur.next.next;
            cur.next = newNext;
            if(newNext!=null)   newNext.last = cur;
        }
        return head;
    }
    public Node removeLastKthNode(Node head, int lastKth){
        if(head==null || lastKth<1) return head;
        Node cur = head;
        while(cur != null){
            lastKth--;
            cur = cur.next;
        }
        if(lastKth==0)  head = head.next;
        if(lastKth<0){
            cur = head;
            while(++lastKth != 0){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        head.next = n2;n2.next = n3; n3.next = n4;
        Node res = new Subject02_RemoveLastKthNode().removeLastKthNode(head,2);
        while(res!=null){
            System.out.println(res.value);
            res = res.next;
        }
    }
}
