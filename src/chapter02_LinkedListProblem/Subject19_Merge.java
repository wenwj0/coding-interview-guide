package chapter02_LinkedListProblem;

public class Subject19_Merge {
    public Node merge(Node head1, Node head2){
        if(head1==null || head2== null)
            return head1==null?head2:head1;
        Node head = head1.value<=head2.value?head1:head2;
        Node p1 = head==head1?head1:head2;
        Node p2 = head==head1?head2:head1;
        Node pre = head;
        Node next = null;
        while(p1!=null && p2!=null){
            if(p1.value<=p2.value){
                pre = p1;
                p1 = p1.next;
            }else {
                next = p2.next;
                pre.next = p2;
                p2.next = p1;
                pre = p2;
                p2 = next;
            }
        }
        pre.next = p1==null?p2:p1;
        return head;
    }
}
