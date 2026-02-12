public class MergeStringAlternately {
    public static void main(String[] args) {
        String s1="abcdfghj";
        String s2="pqrs";
        System.out.println(merge(s1,s2));
        
    }
    public static String merge(String s1,String s2){
        String result="";
        int i=0;
       while(i<s1.length() ){
           result+= String.valueOf(s1.charAt(i));
           if(i<s2.length()) {
               result += String.valueOf(s2.charAt(i));
           }
           i++;

       }
       while (i<s1.length()){
           result+=String.valueOf(s1.charAt(i));
           i++;
       }

       while (i<s2.length()){
           result+= String.valueOf(s2.charAt(i));
           i++;

       }
       return result;
    }
}
