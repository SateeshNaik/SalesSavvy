import java.util.*;

public class RoatateLinkedList {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        deleteNNodes(list);
    }
    public static void deleteNNodes(List<Integer> list){


        for(int i=0; i<list.size()-1; i+=2){
            int temp=list.get(i);
            list.set(i,list.get(i+1));
            list.set(i+1,temp);
        }
        System.out.println(list);
    }
}
