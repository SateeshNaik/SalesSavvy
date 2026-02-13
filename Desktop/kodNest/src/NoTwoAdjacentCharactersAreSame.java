import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class NoTwoAdjacentCharactersAreSame {
    public static void main(String[] args) {
        String str = "aaba";
        System.out.println(rearrange(str));
    }
    public static String rearrange(String str) {
        Map<Character,Integer> freqMap=new HashMap<>();
        for(char c:str.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> maxHeap=new PriorityQueue<>((a,b) -> b.getValue() -a.getValue());
        maxHeap.addAll(freqMap.entrySet());


        StringBuilder result=new StringBuilder();
        Map.Entry<Character,Integer> prev=null;
        while (!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> current =maxHeap.poll();
            result.append(current.getKey());
            current.setValue(current.getValue()-1);
            if(prev!=null && prev.getValue()>0){
                maxHeap.add(prev);
            }
            prev=current;
        }
        if(result.length()!=str.length()){
            return "No possible to rearrange";
        }


        return result.toString();
    }
}

