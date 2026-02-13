import java.util.HashSet;
public class FindingLongestConsectiveSequence {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(100);
        set.add(4);
        set.add(200);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(101);
        int longestStreak=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentStreak=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }

        }
        System.out.println(longestStreak);
    }
}
