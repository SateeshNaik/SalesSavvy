import java.util.*;


public class Practing  {
    public static void main(String[] args) {
     int[] nums = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
     int k = 2;

        System.out.println(maxOperations(nums,k));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int i=0;
        int j=nums.length-1;
        while(i<j) {
            int sum = nums[i] + nums[j];
            if(sum==k){
                count++;
                i++;
                j--;
            } else if(sum<k){
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}


















































//        String source= "C:\\Users\\satee\\Desktop\\sateesh resume.pdf";
//        String destination="C:\\Users\\satee\\Documents\\pdfHandling.pdf";
//          FileInputStream input=new FileInputStream(source);
//          FileOutputStream output=new FileOutputStream(destination);
//
//          byte[] buffer=new byte[1024];
//          int bufferdatd;
//          while ((bufferdatd=input.read(buffer))!=-1){
//              output.write(buffer,0,bufferdatd);
//          }
//        System.out.println("Pdf is successfully copied");
//          input.close();
//          output.close();





//            try {
//                byte[] buffer = new byte[1024];
//                int bufferdata;
//                while ((bufferdata = input.read(buffer)) != -1) {//buffer =buffer → where the data is coming from
//                    output.write(buffer, 0, bufferdata);  // 0 → starting position in buffer
//                                                        //bufferdata → number of bytes to write
//
//                }
//                System.out.println("Pdf is succesfully copied");
//                input.close();
//                output.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }






