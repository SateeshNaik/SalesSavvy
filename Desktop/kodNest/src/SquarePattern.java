public class SquarePattern {
    public static void main(String[] args){
        pattern1(4);
    }


    public static void pattern1(int n){
        for(int rows=0; rows<=n; rows++){
            for(int coln=0; coln<=n; coln++){
                System.out.print(coln+1+" ");
            }
            System.out.println();
        }
    }
}
