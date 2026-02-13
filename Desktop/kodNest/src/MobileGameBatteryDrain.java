public class MobileGameBatteryDrain {
    public static void main(String[] args) {
        int a=12;
        int moves=2;
        int[] arr={4,2};
        System.out.println(mobile(a,moves,arr));
    }
    public static String mobile(int a,int moves, int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i]+arr[i];

        } if(a<=sum){
            return "possible";
        } else {
            return "cannot reach zero";
        }
    }


}
