public class PatternCountNumbers {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(count<10)
                {
                    System.out.print("0");
                }
                    System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
