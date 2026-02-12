import java.util.List;
import java.util.Scanner;
public class OddEvenLinkedListMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            return;
        }
        ListNode head =new ListNode(sc.nextInt());
        ListNode current=head;
        for(int i=1; i<n; i++){
            current.next=new ListNode(sc.nextInt());
            current=current.next;
        }
//       ListNode result=oddEvenList(head);
//            printList(result);
        }
    public static ListNode oddEvenList(ListNode head){
       if(head==null){
           return null;
       }
       ListNode odd=head;
       ListNode even=head.next;
       ListNode evenHead=even;
        while (even != null && even.next != null) {
          odd.next=even.next;
          odd=odd.next;
          even.next=odd.next;
          even=even.next;
        }
        odd.next=evenHead;
        return head;
    }


    public static void printList(ListNode head){
        while (head!=null){
            System.out.print(head.val +" ");
            head=head.next;
        }
        System.out.println();
    }
}
