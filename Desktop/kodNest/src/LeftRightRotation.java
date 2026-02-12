public class LeftRightRotation {
    public static void main(String[] args) {
        System.out.println(right("abcde", 2));
    }
    public static String right(String str, int r){
        int partition=str.length()-r;
       String result = str.substring(partition)+str.substring(0,partition);
        return result;
    }
}
