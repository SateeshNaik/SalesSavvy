public class MoveAllNegative1 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        movingElements(arr);
    }

    public static void movingElements(int[] arr) {
        int lastPos=arr.length-1;
        for(int i=arr.length-1; i>=0; i--){
            int index=i;
            if(arr[i]<0) {
                while ( index!=lastPos) {
                    int temp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = temp;
                    index++;
                }
                lastPos=index-1;
            }

        }
    }
}




