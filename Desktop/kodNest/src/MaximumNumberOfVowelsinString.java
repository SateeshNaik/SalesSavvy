import java.util.HashMap;

public class MaximumNumberOfVowelsinString {
    public static void main(String[] args) {

        String s="aeiou";
        int k=2;
        vowels(s,k);
    }
    public static void vowels(String s,int k){

        int max=0;
        for(int i=0; i+k<=s.length(); i++) {
            int count=0;
            String str=s.substring(i,i+k).toLowerCase();
            for(int j=0;j<str.length(); j++){

            if (str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'){
                count++;
            }

            }
            if(count>max){
                max=count;

            }


        }

        System.out.println( max);


    }
}
