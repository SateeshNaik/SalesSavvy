public class PowerOf2 {
    public static void main(String[] args) {
        int n=98;
        if ((power(n))){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
    public static boolean power(int n){
        if(n<=0){
            return false;
        }
        while (n> 1) {
           if(n%2!=0) {
               return false;
           }
            n=n/2;
        }
        return true;
    }
}
