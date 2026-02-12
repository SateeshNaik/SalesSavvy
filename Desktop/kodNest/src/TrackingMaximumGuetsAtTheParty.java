public class TrackingMaximumGuetsAtTheParty {
    public static void main(String[] args) {
        int[] arr1={15,10,5};
        int[] arr2={15,10,5};
        int maximum=0;
        for(int i=0;i<arr1.length; i++){
             maximum+=arr1[i]-arr2[i];
        }
        System.out.println(maximum);
    }
}
