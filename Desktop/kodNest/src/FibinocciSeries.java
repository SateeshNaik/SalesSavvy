public class FibinocciSeries {
    public static void main(String[] args) {
        int a=5;

        System.out.println(fibn(a));

    }
    public static int  fibn(int n){
        if (n <= 1)
            return n;

        int first = 0, second = 1, third=1, next = 0;
        for (int i = 2; i <= n; i++) {
            next = first + second+third;
            first = second;
            second = third;
            third=next;
        }
        return second;


    }

}
