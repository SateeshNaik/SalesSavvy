public class LongestNonRepeatingStrings {
    public static void main(String[] args) {
        String str="abcabcbb";
        String res="";
        for(int i=0; i<str.length(); i++){
            String temp="";
            for(int j=i+1; j<str.length(); j++){
                if(temp.indexOf(str.charAt(j)) == -1){
                    temp+=str.charAt(j);
                }
                else {
                    break;
                }

            }
            if(temp.length()>res.length()){
                res=temp;
            }
        }
        System.out.println(res.length());

    }
}
