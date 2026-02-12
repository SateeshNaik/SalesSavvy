public class RightRotation {
    public static void main(String[] args) {

        System.out.println(getRightRotation("daxjheq" ,
                "eqdaxjh"));
    }
    public static boolean getRightRotation(String s1, String s2){
        String clockWiseRotatedString=s1.substring(s1.length()-2)+s1.substring(0,s1.length()-2);
        String antiClockWiseRotatedString=s1.substring(2)+s1.substring(0,2);
        return clockWiseRotatedString.equals(s2)|| antiClockWiseRotatedString.equals(s2);
    }
}
