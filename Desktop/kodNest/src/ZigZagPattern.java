public class ZigZagPattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <=5; j++) {
                for (int k = 1; k <= 5; i++) {
                    if (j == k) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
