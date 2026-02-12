public class KodPattern {
    public static void main(String[] args) {
                int rows = 5;
                int columns = 1;

                for (int i = 0; i < rows; i++) {

                    for (int k = 0; k < rows - i - 1; k++) {
                        System.out.print(" ");
                    }

                    for (int j = 0; j < columns; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    columns += 2;
                }
                for(int i=0; i<rows; i++) {
                    for(int k=0; k<9; k++){
                        if(k==0 || k==9-1 || i==4) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }

