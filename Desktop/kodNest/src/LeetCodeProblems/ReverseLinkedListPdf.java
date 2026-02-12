package LeetCodeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseLinkedListPdf {
    class Node{
        int data;
        Node next;
    }
    Node first;
    public  void insertFront(int val){
        Node ref=new Node();
        ref.data=val;
        ref.next=null;

        if(first==null){
            first=ref;
        } else {
            ref.next=first;
            first=ref;
        }

    }
    public void insertEnd(int val){
    Node ref=new Node();
    ref.data=val;
    ref.next=null;
    if(first==null){
        first=ref;
    } else {
        Node temp=first;
        while (temp.next!=null) {
            temp = temp.next;
        }
           temp.next=ref;
    }
    }

    public void reverse(){
        if(first==null){
            System.out.println("List is empty");
        } else {
            Node prev=null;
            Node current=first;
            Node nextNode=null;
            while (current!=null){
                nextNode=current.next;
                current.next=prev;
                prev=current;
                current=nextNode;
            }
            first=prev;

        }
    }

    public Node mergeTwoLists(Node list1, Node list2) {
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
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp=temp.next;
        }
        if(list1 !=null){
            temp.next= list1;
        } else {
            temp.next= list2;
        }
        return result.next;
    }


    public void display(){
        if(first==null){
            System.out.println("LinkedList is Empty");
        } else {
            Node temp = first;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

    public Node deleteMiddle(Node first) {

        if (first == null || first.next == null) {
            return null;
        }

        int count = 0;
        Node temp = first;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int middleNode = count / 2;

        int count1 = 0;
        Node temp1 = first;
        while (temp1 != null) {
            if (count1 == middleNode - 1) {
                temp1.next = temp1.next.next;
                break;
            }
            count1++;
            temp1 = temp1.next;
        }
        return first;
    }

    public int pairSum(ReverseLinkedListPdf first) {
        if(this.first ==null){
            return -1;
        }
        List<Integer> list=new ArrayList<>();
        int index=0;
        Node temp= this.first;
        while (temp!=null){
            list.add(index,temp.data);
            index++;
            temp=temp.next;
        }
        int sum=0;
        int j=list.size()-1;
        for(int i=0; i<list.size(); i++){
            if(i<j) {
              int currentSum= list.get(i) + list.get(j);
                j--;
                sum=Math.max(currentSum,sum);
            } else {
               return sum;
            }
            System.out.println(sum);
        }
        return sum;
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        Node temp1=l1;
        String s1="";
        while (temp1!=null){
            s1 = temp1.data + s1;
            temp1=temp1.next;

        }

        Node temp2=l2;
        String s2="";
        while (temp2!=null){
            s2 = temp2.data + s2;
            temp2=temp2.next;
        }
        int set1= Integer.parseInt(s1);
        int set2=Integer.parseInt(s2);
        int totalSum=set2+set1;
        List<Integer> list=new ArrayList<>(totalSum);
        Collections.reverse(list);

        Node newNode =new Node();
        newNode.data=list.get(0);
        return newNode;


    }







}

