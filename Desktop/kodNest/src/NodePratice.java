public class NodePratice {
    class Node{
        int data;
        Node link;
    }
    Node first;
    public void insertFront(int value){
        Node ref=new Node();
        ref.data=value;
        ref.link=null;
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
            while (temp.link!=null){
                temp=temp.link;
            }
            temp.link=ref;
        }
    }
    public void deleteFront(){
        if(first==null){
            System.out.println("Deletion is not possible");
        } else {
            System.out.println("Deleted Element is = " + first.data);
            first=first.link;
        }
    }
    public void deleteRear(){
        if(first==null){
            System.out.println("Deletion is not possible");
        } else {
            Node temp=first;
            while (temp.link.link!=null){

                temp=temp.link;
            }
            System.out.println("deleted Element at last pos  = "+ temp.link.data);
            temp.link=null;
        }
    }
    public void insertAtPosition(int position, int value){
        Node newNode=new Node();
        newNode.data=value;
        newNode.link=null;

            Node temp=first;
            int pos=1;
            while (temp!=null){
                if(pos==position){
                    Node previousNode=temp.link;
                    temp.link=newNode;
                    newNode.link=previousNode;
                }
                temp=temp.link;
                pos++;


        }
    }
    public void deletAtPosition(int position){
        Node previousNode=null;
        if(first==null){
            System.out.println("deltionAtPostion is not posiible");
        } else {
            int pos=1;
            Node temp=first;
            while (temp!=null){
                if(pos==position-1){
                     previousNode=temp;
                }
                if(pos==position){
                    previousNode.link=temp.link;
                }
                temp=temp.link;
                pos++;
            }
        }
    }
    public void display(){
        if(first==null){
            System.out.println("list is empty");
        } else {
            Node temp=first;
            while (temp!=null){
                System.out.print(temp.data +" ");
                temp=temp.link;
            }
            System.out.println();
        }
    }
}
