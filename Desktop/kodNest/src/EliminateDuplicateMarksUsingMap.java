import java.util.*;

public class EliminateDuplicateMarksUsingMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(105,90);
        map.put(101,85);
        map.put(104,95);
        map.put(103,85);
        map.put(102,90);
        eliminate(map);
    }
    public static void eliminate(Map<Integer,Integer> map){
        Map<Integer,Integer> fre=new HashMap<>();
        for(int marks: map.values()){
            fre.put(marks, fre.getOrDefault(marks,0)+1);
        }
        TreeMap<Integer,Integer> sortmap=new TreeMap<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(fre.get(entry.getValue())==1){
                sortmap.put(entry.getKey(),entry.getValue());
            }
        }
        if(sortmap.isEmpty()){
            System.out.println("EMPTY");
        } else {
            for(Map.Entry<Integer,Integer>  e:sortmap.entrySet()){
                System.out.println(e.getKey() +" "+ e.getValue());
            }
        }
    }
}
