public class CountingCharacters {
    public static void main(String[] args) {
        String str = "aaabbbbbbc";
//        char ch = str.charAt(0);
//        String s1="";
//        int count =1 ;
//        for (int i = 1; i <str.length(); i++) {
//
//            if (ch==str.charAt(i)) {
//                count++;
//            }else if(ch!=str.charAt(i) || i==str.length()-1) {
//                //System.out.println(String.valueOf(ch) + count);
//                ch = str.charAt(i);
//                count=1;
//            }
//        }
        System.out.println(countChar(str));
        }

        public static String countChar(String str){
        int count=0;
        String result="";
        int start=0;
        for(int i=start; i<str.length();i++){
            char ch=str.charAt(i);
            for(int j=i+1; j<str.length(); j++){
                if(ch==str.charAt(j))
                    count++;
                else {
                    start=j;
                    result = String.valueOf(ch )+ count;
                    System.out.println(result);
                    break;
                }
            }
        }
        return result;
        }

    }
