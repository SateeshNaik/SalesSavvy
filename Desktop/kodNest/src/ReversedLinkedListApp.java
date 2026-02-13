import LeetCodeProblems.ReverseLinkedListPdf;

public class ReversedLinkedListApp {
    public static void main(String[] args) {
        ReverseLinkedListPdf r1 = new ReverseLinkedListPdf();
        r1.insertEnd(1);
        r1.insertEnd(2);
        r1.insertEnd(3);
        r1.insertEnd(4);
        r1.insertEnd(7);
        r1.insertEnd(1);
        r1.insertEnd(2);
        r1.insertEnd(6);
        r1.display();
        System.out.println();
        ReverseLinkedListPdf r2 = new ReverseLinkedListPdf();
        r2.insertEnd(4);
        r2.insertEnd(2);
        r2.insertEnd(2);
        r2.insertEnd(3);
        r2.display();
        r2.pairSum(r1);


        }
    }





