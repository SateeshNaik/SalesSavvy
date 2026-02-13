public class CalculatingCubesInRange {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int sum=0;
        if(b<a){
            System.out.println("Invalid");
        } else {
            for(int i=a; i<=b; i++){
                sum+=i*i*i;
            }
        }
        System.out.println(sum);

    }

}
