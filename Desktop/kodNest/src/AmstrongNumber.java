public class AmstrongNumber {
    public static void main(String[] args) {
        int n=123;
        int count=count(n);
        int sum=amstrong(n,count);
        System.out.println("Number of digits: " +count);
        System.out.println("Amstrong sum: " + sum);
        if(n==sum){
            System.out.println(n + " is Armstrong number.");
        } else {
            System.out.println(n + " is not an Amstrong number.");
        }
    }
    public static int count(int n){
        int count=0;
        while (n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static int  amstrong(int n,int count){
        int sum=0;
        int temp=n;
        while (temp!=0){
            int rem=temp%10;
            sum+=Math.pow(rem,count);
            temp=temp/10;
        }
        return sum;

    }
}
