public class ClimbStairs {
    public static void main(String[] args) {
        int n=5;
        System.out.println(climb(n));
    }
    public static int climb(int n){
        if(n<=2){
            return n;
        }
        int a=1;
        int b=2;
        for (int i=3; i<=n; i++){
            int temp=a+b;
            a=b;
            b=temp;
        }
        return b;

    }

}
