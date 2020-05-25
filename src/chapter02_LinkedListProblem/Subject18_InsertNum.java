package chapter02_LinkedListProblem;

public class Subject18_InsertNum {
    public Node insertNum(Node head, int num){
        Node node = new Node(num);
        if(head==null){
            node.next = node;
            return node;
        }
        Node pre = head;
        Node cur = head.next;
        while(cur!=head){
            if(cur.value<=num && cur.next.value>num){
                break;
            }
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = node;
        node.next = cur;
        return head.value<num?head:node;
    }
}
