public class TwoDArray {
    public static void main(String[] args) {
        int[][] example={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i=0; i<example.length; i++){
            for(int j=0; j<example[i].length; j++){
                System.out.print(example[i][j]+" ");
            }
            System.out.println();
        }

    }
}
