public class DoubleLinkedListImplemention {
    class Node{
        int data;
        Node prev;
        Node next;
    }
    Node head;
    Node tail;
    public void insertfront(int value){
        Node newNode=new Node();
        newNode.data=value;
        newNode.prev=null;
        newNode.next=null;
        if(head==null){
            head=tail=newNode;
        } else {
            newNode.next=head;
            newNode.prev=null;
            head=newNode;
        }
    }
    public void insertRear(int value){
        Node newNode=new Node();
        newNode.data=value;
        newNode.prev=null;
        newNode.next=null;
        if(head==null){
            head=tail=newNode;
        } else {
           tail.next=newNode;
            newNode.prev=tail;
           tail = newNode;
        }

    }
    public void display(){
        if(head==null){
            System.out.println("LinkedlIst is empty");
        } else {
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();

        }
    }
    public void deleteFront(){
        if(head==null){
            System.out.println("List is Empty");
        } else {
            System.out.println("deletion element is = "+ head.data);
            head=head.next;
        }

    }
    public void deleteRear(){
        if(tail==null){
            System.out.println("List is Empty");
        } else {
            System.out.println("deletion element is = " + tail.data);
            Node temp=head;
            while(temp.next.next!=null) {
                temp = temp.next;
            }
            temp.next=null;
                    tail=temp;
            }
        }
        public void insertAtPosition(int position,int value) {
            Node newNode = new Node();
            newNode.data = value;
            newNode.next = null;
            newNode.prev = null;
            Node temp = head;
            int pos = 1;
            while (temp != null) {
                if (pos == position - 1) {
                    Node previousNode = temp.next;
                    temp.next = newNode;
                    newNode.next = previousNode;
                }
                temp = temp.next;
                pos++;
            }
        }
        public void deletAtPosition(int position){
        Node  previousNode=null;
        if(head==null ){
            System.out.println("Deletion is not possible");
        } else {
            int pos=1;
            Node temp=head;
            while (temp!=null){
                if(pos==position-1){
                    previousNode=temp;
                }
                if(pos==position){
                    previousNode.next=temp.next;
                }
                temp=temp.next;
                pos++;
            }
        }
        }
}
