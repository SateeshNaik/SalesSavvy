import java.util.*;

public class LetterCombinationOfAPhoneNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String digits=sc.nextLine();
        System.out.println(combination(digits));

    }
    public static List<String> combination(String digits){
        List<String > list=new ArrayList<>();

        int[] arr={2,3,4,5,6,7,8,9};
        String[] str={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        list.add("");

            for (int i = 0; i < digits.length(); i++) {
                int digit = Character.getNumericValue(digits.charAt(i));
                int index=digit-2;
                if(index>=0 && index<str.length) {
                    if (arr[index] == digit) {
                        List<String> temp = new ArrayList<>();
                        char[] ch = str[index].toCharArray();

                        for (String s : list)
                            for (char c : ch) {
                                temp.add(s + c);
                            }
                        System.out.println(list);
                        list = temp;
                        System.out.println(list);


                    }
                }
            }

        return list;

    }

}
