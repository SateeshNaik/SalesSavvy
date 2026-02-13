import java.util.LinkedList;

public class SwapTheKthNodeLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int k=2;
        int  n=5;
        swap(list,k,n);
    }
    public static void swap(LinkedList<Integer> list,int k,int n){

      int left=k-1;
      int right=n-1;
      while (left<right){
          int temp=list.get(left);
          int temp1=list.get(right);
          list.set(left,temp1);
          list.set(right,temp);
          left++;
          right--;

      }


        System.out.println(list);

    }
}
