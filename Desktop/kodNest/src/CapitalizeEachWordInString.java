import java.util.Locale;

public class CapitalizeEachWordInString {
    public static void main(String[] args) {
        String str="hello world this is java";
        String[] arr=str.split(" ");
        for(int i=0; i<arr.length; i++){
            String s = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1, arr[i].length());
            arr[i]=s;


        }
        for(String s:arr){
            System.out.print(s+" ");
        }

    }
}
