package LeetCodeProblems;

public class MaximumMeetingsInOneRoom {
    public static void main(String[] args) {
        int[] start={10,12,20};
        int[] end={20,25,30};
        System.out.println(meetings(start,end));
    }
    public static int meetings(int[] start,int[] end){
        int count=1;

        int endTime=end[0];
        for(int i=1; i<start.length; i++){
            if(endTime<start[i]){
                count++;
                endTime=end[i];
            }
        }
        return count;

    }
        public static int maxMeetings(int[] start, int[] end) {
            // Your code here
            for(int i=0;i<end.length-1;i++) {
                int min=end[i];
                int pos=i;
                for(int j=i+1;j<=end.length-1;j++) {
                    if(end[j]<min) {
                        min=end[j];
                        pos=j;
                    }
                }
                //swap end[i] and end[pos]

                int tempend=end[i];
                end[i]=end[pos];
                end[pos]=tempend;

                //swap start[i] and start[pos]
                int tempstart=start[i];
                start[i]=start[pos];
                start[pos]=tempstart;
            }

            int count=0;
            int lastEnd=-1;
            for(int i=0;i<=start.length-1;i++) {
                if(start[i]>lastEnd) {
                    count++;
                    lastEnd= end[i];
                }
            }
            return count;
        }
}
