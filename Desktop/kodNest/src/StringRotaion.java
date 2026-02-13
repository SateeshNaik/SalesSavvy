public class StringRotaion {
    public static void main(String[] args) {
        String str="abcdef";
        String str1="deabc";
        rotation(str,str1);
        System.out.println("The strings"+ str + " is rotation of " + str1);


    }
    public static boolean rotation(String str,  String str1){
        int i=0;
        while (i<str.length()){
            str=str.substring(str.length()-1,str.length()) + str.substring(0,str.length()-1);
            if(str.equals(str1))
                return true;
            i++;
        }
        return false;

    }
}
