public class StringPermutaions {
    public static void main(String[] args) {
        String str="abc";
        permutaion(str,"");
    }
    public static void permutaion(String str, String prefix){
        if(str.length()==0){
            System.out.println(prefix);
        } else {
            for(int i=0; i<str.length(); i++){
                char ch=str.charAt(i);
                String remaining=str.substring(0,i)+str.substring(i+1);
                permutaion(remaining,prefix+ch);
            }
        }
    }
}
