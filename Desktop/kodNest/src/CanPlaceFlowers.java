public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,0,0,0,0,0,0};
        int[] arr2={0,0,0};
        int m=5;
        System.out.println(placing(arr,m));
        System.out.println(placing(arr2,1));
    }
    public static boolean placing(int[] arr,int m) {
        int prev = 0, curr = 0, next = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                prev = arr[i - 1];
            }
                curr = arr[i];
                if (i < arr.length - 1) {
                    next = arr[i + 1];
                }
                if (curr != 1 && prev != 1 && next != 1) {
                    arr[i] = 1;
                    m--;
                }
                if(m==0){
                    return true;
                }
            }
            return m == 0 ? true : false;
        }
    }
