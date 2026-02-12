class SingleLinkedlist {
    class Node{
        int data;
        Node link;
        }
        Node first;
    public void insertFront(int value){
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
    public void insertRear(int value){
        Node ref=new Node();
        ref.data=value;
        ref.link=null;
        if(first==null){
            first=ref;
        } else {
            Node temp=first;
            while ((temp.link!=null)){
                temp=temp.link;
            }
            temp.link=ref;
        }
    }
    public void deletFront(){
        if(first==null){
            System.out.println("Deletion is not possible because of  LinkedList is Empty");
        } else {
            System.out.println("Deleted data is = " + first.data);
            first=first.link;
        }
    }
    public void deleteRear(){
        if(first==null){
            System.out.println("Deletion is not possible because of  LinkedList is Empty");
        } else {
            Node temp=first;
            while (temp.link.link!=null){
                temp=temp.link;
            }
            System.out.println("Deleted list is = "+ temp.link.data);
            temp.link=null;
        }
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
    public void insertAtMiddle(int position , int value){
        Node newNode=new Node();
        newNode.data=value;
        newNode.link=null;

        Node  temp=first;
        int pos=1;
        while (temp!=null){
            if(pos==position){
                Node node=temp.link;
                temp.link=newNode;
                newNode.link=node;
            }
            temp=temp.link;
            pos++;
        }
    }
    public void deleteMiddle(int position){
        Node previousLink=null;
        if(first==null){
            System.out.println("link is Empty");
        } else {
            int pos=1;
            Node temp=first;
            while (temp!=null){
                if(pos==position-1){
                    previousLink=temp;
                }
                if(position==pos){
                   previousLink.link=temp.link;
                }
                temp=temp.link;
                pos++;

            }
        }
    }
    public void deleteMiddelEvenOrOdd(){
        Node temp=first;
        int count=0;
        while (temp!=null){
            temp=temp.link;
            count++;
        }
        int middleIndex=count/2;

        Node current=first;
        Node  previousNode=null;
        int position=0;
        while (current!=null){
        if(position==middleIndex) {
            if (previousNode!=null) {
                previousNode.link = current.link;
           }
            System.out.println("Deleted middle node at position: " + middleIndex);
            break;
        }
        previousNode=current;
        current=current.link;
            position++;
        }
        System.out.println("Size of the SingleLinkedList = " + count);
    }

}
