import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class StudentLeaderBoard {
    public static void main(String[] args) {
        Comparator<StudentTree> leaderboardComparator =(s1,s2) -> {
            if(s1.marks!=s2.marks){
                return Integer.compare(s2.marks,s1.marks);
            } else {
                return s1.name.compareTo(s2.name);
            }

        };

        NavigableSet<StudentTree> leaderboard = new TreeSet<>(leaderboardComparator);


        leaderboard.add(new StudentTree( "Alice",90));
        leaderboard.add(new StudentTree("Bob",95));
        leaderboard.add(new StudentTree( "Charlie",90));
        leaderboard.add(new StudentTree( "David",85));
        leaderboard.add(new StudentTree( "Eve",95));


        System.out.println("Student LearderBoard: ");
        for(StudentTree s : leaderboard){
            System.out.println(s);

        }

    }
}
