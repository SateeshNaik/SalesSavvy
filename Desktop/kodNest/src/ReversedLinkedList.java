import java.util.Currency;

public class ReversedLinkedList {
    class Node{
        int data;
        Node link;

        Node(){
        }
        Node(int data){
            this.data=data;
        }

    }
   Node first;
    public void insert(int value){
        Node ref=new Node();
        ref.data=value;
        ref.link=null ;
        if(first==null){
            first=ref;
        } else {
            ref.link=first;
            first=ref;
        }
    }
    public void insertEnd(int value) {
        Node ref = new Node(value);

        if (first == null) {
            first = ref;
            return;
        }

        Node temp = first;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = ref;
    }
    public void display(){
        if(first==null){
            System.out.println("Linked is Empty");
        } else {
           Node temp=first;
            while (temp!=null){

                System.out.print(temp.data+" ");
                temp=temp.link;
            }

            System.out.println();
        }
    }
    public void reverse(){
        Node prev=null;
        Node current=first;
        Node next=null;
        while (current!=null){
            next=current.link;
            current.link=prev;
            prev=current;
            current=next;

        }
        first=prev;

    }
    public Node merge(Node list1, Node list2 ){
        if(list1 ==null){
           return list2;
        }
        if(list2 ==null){
            return list1;
        }
        Node result =new Node();
        Node temp=result;

            while (list1 !=null && list2 !=null) {
                if (list1.data <= list2.data) {
                    temp.link = list1;
                    list1 = list1.link;

                } else {
                    temp.link = list2;
                    list2 = list2.link;

                }
                temp=temp.link;
            }
        if(list1 !=null){
            temp.link= list1;
        } else {
            temp.link= list2;
        }
        return result.link;


    }
    public Node reverseBetween(Node first,int left,int right) {
        Node dummy = new Node();
        dummy.link=first;

      Node leftpre=dummy;
      Node currNode=first;

      for(int i=0; i<left-1; i++){
          leftpre=leftpre.link;
          currNode=currNode.link;
      }

      Node subListFirst=currNode;

       Node preNode=null;
       for(int i=0; i<=right-left; i++){
           Node nextNode=currNode.link;
           currNode.link=preNode;
           preNode=currNode;
           currNode=nextNode;
       }
       leftpre.link=preNode;
       subListFirst.link=currNode;
   return dummy.link;
    }

    public Node removeDuplicates(Node first){
        Node temp=first;
        while (temp!=null && temp.link!=null){
            if(temp.data==temp.link.data){
                temp.link=temp.link.link;
            } else {
                temp=temp.link;
            }
        }
        return first;

    }
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode first = head;
        ListNode last = head;
        while (first!= null && first.next != null) {
            last = last.next;
            first= first.next.next;

            if (last == first) {
                return true;
            }
        }
        return false;
    }

    public Node removeElements(Node first, int val) {
        Node temp=first;
        Node dummy=new Node();
        dummy.link=first;

        Node prev=dummy;

        while (temp!=null){
            if(temp.data==val){
                prev.link=temp.link;
            } else {
                prev = temp;
            }
            temp=temp.link;

        }
        return dummy.link;

    }
    public Node getIntersectionNode(Node headA, Node headB) {
        Node temp=first;
        while (temp!=null){
            temp=temp.link;
        }

        Node dummy=first;
        while (dummy!=null){
            dummy=dummy.link;
        }
    return temp;
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        Node temp1=l1;
        Node temp2=l2;
        

        while (l1 != null || l2 != null ) {
            int sum =0;

            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.link;
            }
            if (temp2 != null) {
                sum += temp2.data;
                temp2 = temp2.link;
            }
            Node newNode = new Node(sum % 10);


        }
        return new Node();
    }

   }



