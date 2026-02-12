public class StringToInteger {
    public static void main(String[] args) {
        String s="42";

        System.out.println(myAtoi(s));

    }
    public static int myAtoi(String s) {

         int a=Integer.parseInt(s);
         return a;
    }
}
