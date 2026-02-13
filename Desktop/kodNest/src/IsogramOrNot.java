public class IsogramOrNot {
    public static void main(String[] args) {
        String str="geeks";
        System.out.println(isogram(str));

    }

    public static boolean isogram(String str){
        char[] arr=str.toCharArray();
        for(int i=0; i<arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
