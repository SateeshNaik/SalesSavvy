public class MinimumFlipsToMakeAorBToEqual {
    public static void main(String[] args) {
        int a=4;
        int b=2;
        int c=7;
        System.out.println(flips(a,b,c));
    }
    public static int flips(int a,int b,int c){
        int sum=a+b;
        if(sum>c){
            int gret=sum-c;
            return gret;
        } else if(sum<c){
            int Cgreater=c-sum;
            return Cgreater;
        }
        return 0;

    }
}
