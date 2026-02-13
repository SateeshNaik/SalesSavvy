public class GeeksForGeeks {
    public static void main(String[] args) {

        System.out.println(rotation("amazon", "azonam"));
    }

    public static boolean rotation(String s1, String s2){
        int r = 2;
        String result = s1.substring(r) + s1.substring(0, r);
        if (s1.contains(s2)) {
            System.out.println("true");
        }else
        {
            System.out.println("false");
        }


        return false;
    }

}


