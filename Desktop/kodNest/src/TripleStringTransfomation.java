import java.util.Scanner;

public class TripleStringTransfomation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
       String str3=sc.next();
        String vowels="aeiouAEIOU";
        String newStr1=new String();
        String newStr2=new String();
        for(int i=0; i<str1.length(); i++){
            if(vowels.indexOf(str1.charAt(i)) != -1){
                newStr1 = newStr1.concat("%");
            }
            else
                newStr1 =  newStr1.concat(String.valueOf(str1.charAt(i)));
        }
        for (int i=0; i<str2.length(); i++){
            if(vowels.indexOf(str1.charAt(i)) != -1){
                newStr2 = newStr1.concat("#");

            }  else
                newStr2 =  newStr2.concat(String.valueOf(str1.charAt(i)));

        }
        System.out.println(newStr2);

        System.out.println(newStr1);
    }
    
}
