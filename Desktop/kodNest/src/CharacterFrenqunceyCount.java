import java.util.Scanner;

public class CharacterFrenqunceyCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        int count=1;
        String result="";
        for(int i=0; i<arr.length;i++){
            if( i+1<arr.length && arr[i]==arr[i+1]){
                count++;
            } else {
                result+= String.valueOf(arr[i]) + count;
                count=1;
            }

        }
        System.out.println(result);
    }
}
