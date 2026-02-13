public class Pattern1 {
    public static void main(String[] args){
     pattern1(4);
    }
    public static void pattern1(int n){
        for(int rows=1; rows<=n; rows++){
            for(int coln=1; coln<=rows; coln++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
