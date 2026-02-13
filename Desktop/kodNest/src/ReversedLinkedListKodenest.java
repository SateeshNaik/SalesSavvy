import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReversedLinkedListKodenest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ListNode head=new ListNode(sc.nextInt());
        ListNode current=head;
        for(int i=1; i<n; i++){
            current.next=new ListNode(sc.nextInt());
            current=current.next;


        }

//       ListNode result=reversedList(head);
//       printList(result);

        System.out.println(twinSum(head));


    }
    public static ListNode reversedList(ListNode head){
        if(head==null){
            return null;
        }
        ListNode prev=null;
        ListNode current=head;
        ListNode next=null;
        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        return prev;
    }
    public static int twinSum(ListNode head){
        ArrayList<Integer> values = new ArrayList<>();

        while (head!=null){
               values.add(head.val);
            head=head.next;
        }
        int maxSum=0;
        int n=values.size();
        for(int i=0; i<n/2; i++){
            int sum=values.get(i) +values.get(n-1-i);
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }

    public static void printList(ListNode head){
        while (head!=null){
            System.out.print(head.val +" ");
            head=head.next;
        }
        System.out.println();
    }
}
