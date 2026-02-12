public class DescendingOrderCharm {
    public static void main(String[] args) {
        int[] arr={3,1,5,1};
        System.out.println(oder(arr));

    }

    public static int oder(int[] arr){
        int i=0;
        int diff=0;
        while(i<arr.length-1){
            if(arr[i]<=arr[i+1]){
                diff+=arr[i+1] -arr[1];
                arr[i+1]=arr[i];
            }
            i++;
        }
        return diff;

    }
}
