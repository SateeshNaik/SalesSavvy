package LeetCodeProblems;

public class MaximumNumberOfVowelsSubstringOfGivenLength {
    public static void main(String[] args) {
         String s = "aeiou";
         int k = 2;
        System.out.println(maxVowels(s,k));
    }

    public static int maxVowels(String s, int k) {
        char[] arr=s.toCharArray();
        int count=0;
        int maxVowels=0;
        for(int i=0; i<k; i++){
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                count++;
            }
        }
        maxVowels=count;
        for(int i=k; i<s.length(); i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                count++;
            }
            if(arr[i-k] == 'a' || arr[i-k] == 'e' || arr[i-k] == 'i' || arr[i-k] == 'o' || arr[i-k] == 'u'){
                count--;
            }
            maxVowels=Math.max(count,maxVowels);

        }
        return maxVowels;

    }
}
