public class GasStation {
    public static void main(String[] args) {
        System.out.println(completeCircle(new int[]{2, 3, 4,}, new int[]{3, 4, 3}));

    }

    public static int completeCircle(int[] gas, int[] cost) {
        int sumGas=0, sumCost=0;
        for(int num:gas){
            sumGas+=num;
        }
        for(int num1:cost){
            sumCost+=num1;

        }
       if(sumGas!=sumCost) {
           return -1;
       }

       int currentGas = 0, index=0;
            for (int i = 0; i < gas.length; i++) {
                int diff = gas[i] - cost[i];
                currentGas += diff;
                if (currentGas < 0) {
                    index=i+1;
                    currentGas = 0;

                }

            }
            return index;
        }
    }
