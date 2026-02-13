public class AbundantNumbers {
    public static void main(String[] args) {
        int n=5;

        int[] arr=new int[n];
        int i=1,index=0;

        while (index<n){
            if(isAbundant(i)) {
                arr[index] = i;
                index++;

            }
            i++;

        }
        for(int num:arr){
            System.out.println(num);
        }
    }


    public  static boolean isAbundant(int num){
        int sumOfDivisors=0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sumOfDivisors+=i;

            }
        }
        return sumOfDivisors>num;
    }
}
