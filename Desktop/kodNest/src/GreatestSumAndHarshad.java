import java.util.Scanner;

public class GreatestSumAndHarshad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int maxNumber=Integer.MIN_VALUE;
        int harshad = 0;
        for(int num:arr) {
            if (maxNumber < num) {
                maxNumber = num;
            }
            if (isHarshad(num)) {
                harshad += num;
            }
        }
        if(!isHarshad(maxNumber)){
                System.out.println("0,0");
            } else {
                System.out.println(maxNumber);
                System.out.println(harshad);
        }
    }
    public static boolean isHarshad(int num) {
         int sum = 0;
        int temp = num;
        while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            return num % sum == 0;
        }
}
