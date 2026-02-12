public class reversesAStringWhilePreservingSpaces {
    public static void main(String[] args) {
        String str="i love programming";
        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        char[] result=new char[str.length()];
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                result[i]=' ';
            }
        }
        int j = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                while (j >= 0 && result[j] == ' ') {
                    j--;
                }
                result[j] = str.charAt(i);
                j--;
            }
        }
        return new String(result);

    }
}
