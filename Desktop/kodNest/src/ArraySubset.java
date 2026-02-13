public class ArraySubset {
    public static void main(String[] args) {
        int[] a={11, 7, 1, 13, 21, 3, 7, 3};
        int[] b={11, 3, 7, 1, 7};
        System.out.println(sub(a,b));

    }
    public static boolean sub(int[] a, int[] b){
        for(int i=0; i<b.length; i++){
            boolean found=false;
            for(int j=0; j<a.length; j++){
                if(b[i]==a[j]){
                    found=true;
                    break;
                }
            }
            if(!found)
                return false;
        }
        return true;
    }

    public static void sort(String[] array) {
    }
}
