public class MajorityElementInKodnest {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        int elemnt=0;
        int maxcount=0;
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(maxcount<count){
                maxcount=count;
                elemnt=arr[i];
            }
        }
        System.out.println(elemnt);
    }
}
