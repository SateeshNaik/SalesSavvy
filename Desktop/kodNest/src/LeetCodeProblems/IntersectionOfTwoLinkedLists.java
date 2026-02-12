package LeetCodeProblems;

public class IntersectionOfTwoLinkedLists {

    class Node {
        Node next;
        int data;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void insertAtLast(int val){
        Node ref = new Node(val);
        if(head == null){
            head = ref;
        } else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = ref;
        }
    }
    public void display(){
        if(head == null){
            System.out.println("LinkedList is Empty");
        } else {
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA==null || headB==null){
            return null;
        }
        Node tempA=headA;
        Node tempB=headB;
        while (tempA!=tempB){

            if(tempA==null){
                tempA=headB;
            } else {
                tempA=tempA.next;
            }

            if(tempB==null){
                tempB=headA;
            } else {
                tempB=tempB.next;
            }
        }
        return tempA;

    }
    public boolean isPalindrome(Node head) {
      StringBuilder sb = new StringBuilder();
        if(head==null){
            return false;
        } else {
            Node temp=head;
            while (temp!=null){
              sb.append(temp.data);
                temp=temp.next;
            }
        }
        String original=sb.toString();
        String rev= sb.reverse().toString();
        if(original.equals(rev)){
            return true;
        }
        return false;
    }
}
