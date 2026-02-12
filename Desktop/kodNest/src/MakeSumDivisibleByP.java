public class MakeSumDivisibleByP {
    public static void main(String[] args) {
        int[] nums={6,3,5,2};
        int  p = 9;
        System.out.println(elements(nums,p));

    }
    public static int elements(int[] nums, int p){
        int sum=0;
        int[] arr=new int[2
                ];
        for (int i=0; i< nums.length; i++){
            sum+=nums[i];
        }
        if(sum%p==0){
            return 0;
        }
        int diff=sum-p;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==diff){
                  arr[i]=nums[i];
                } else {
                    if(nums[i]+nums[j]==diff){
                        arr[i]=nums[i];
                        arr[j]=nums[j];
                    }
                }
            }
        }
        return arr.length;



    }
}
