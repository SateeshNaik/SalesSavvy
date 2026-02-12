public class Textjustifiaction {
    public static void main(String[] args) {
        String[] str={"this", "is","an","example","of","text","justification"};
        String[] str1={"what", "must","be","acknowledgement","shall","be"};
        int maxWidth=16;
//        //text(str,maxWidth);
//        //text(str1,maxWidth);
//        String[] words = {"Science","is","what","we","understand","well","enough","to","explain",
//                "to","a","computer.","Art","is","everything","else","we","do"};
        text(str,16);
    }
    public static void text(String[] str, int maxWidth){
        String st = str[0]+" ";
        int numberOfWords = 1;
        int noOfSpacesRequired = 0;
        for(int i=1; i<str.length; i++){
                String s = str[i]+" ";
                if( (st+s).length() > maxWidth){
                noOfSpacesRequired = maxWidth - (st.length()-numberOfWords) ;
                int k = noOfSpacesRequired;
                for(int j=0;j<st.length()-1 ;j++){
                    if (noOfSpacesRequired>1)
                     k= noOfSpacesRequired - (noOfSpacesRequired/2);
                    if(k == 0)
                        k = noOfSpacesRequired;

                    char ch = st.charAt(j);
                    if(ch != ' ')
                        System.out.print(ch);
                    else {
                        while (k != 0) {
                            System.out.print(" ");
                            k--;
                            noOfSpacesRequired--;
                        }
                        numberOfWords--;
                    }
                }
                System.out.println();
                numberOfWords=1;
                st = str[i]+" ";


            }
            else {
                st +=s;
                numberOfWords++;
            }
        }
        if(!st.isEmpty()) System.out.println(st);
    }
}
