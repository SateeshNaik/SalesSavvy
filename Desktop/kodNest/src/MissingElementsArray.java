public class MissingElementsArray {
    public static void main(String[] args) {
                int[] arr={1,2,3,5};
                int n=5;
                boolean[] present=new boolean[n+1];
                for(int num:arr){
                    if(num<=n){
                        present[num]=true;
                    }
                }
                for(int i=1; i<=n; i++){
                    if(!present[i]){
                        System.out.print(i+" ");
                    }
                }
            }
        }
