package LeetCodeProblems;

public class IntersectionTwoLikedListsApp {
    public static void main(String[] args) {
//        IntersectionOfTwoLinkedLists listA = new IntersectionOfTwoLinkedLists();
//        IntersectionOfTwoLinkedLists listB = new IntersectionOfTwoLinkedLists();
//
//        IntersectionOfTwoLinkedLists.Node common1 = listA.new Node(8);
//        IntersectionOfTwoLinkedLists.Node common2 = listA.new Node(4);
//        IntersectionOfTwoLinkedLists.Node common3 = listA.new Node(5);
//
//        common1.next = common2;
//        common2.next = common3;
//
//        listA.insertAtLast(4);
//        listA.insertAtLast(1);
//
//        IntersectionOfTwoLinkedLists.Node tempA=listA.head;
//
//        while (tempA.next!=null){
//            tempA=tempA.next;
//        }
//        tempA.next=common1;
//
//        listB.insertAtLast(5);
//        listB.insertAtLast(6);
//        listB.insertAtLast(1);
//
//        IntersectionOfTwoLinkedLists.Node tempB= listB.head;
//        while (tempB.next!=null){
//            tempB=tempB.next;
//        }
//        tempB.next=common1;
//
//        listA.display();
//        System.out.println("===============");
//        listB.display();
//
//        IntersectionOfTwoLinkedLists.Node result = listA.getIntersectionNode(listA.head, listB.head);
//
//        if(result != null){
//            System.out.println("Intersected at: " + result.data);
//        }else{
//            System.out.println("No Intersection");
//        }

        IntersectionOfTwoLinkedLists linkedLists = new IntersectionOfTwoLinkedLists();
        linkedLists.insertAtLast(1);
        linkedLists.insertAtLast(2);
//        linkedLists.insertAtLast(2);
//        linkedLists.insertAtLast(1);
        System.out.println(linkedLists.isPalindrome(linkedLists.head));



    }
}
