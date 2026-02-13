import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions {
    public static void main(String[] args) {
        int[] spells = {3,1,2};
        int[] potions = {8,5,8};
        long success = 16;
        //System.out.println(Arrays.toString(successfulPairs(spells,potions,success)));
        System.out.println(Arrays.toString(successfulPairs1(spells,potions,success)));
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] arr=new int[spells.length];
        for(int i=0; i<spells.length; i++){
            int count=0;
            for(int j=0; j<potions.length; j++){
                long mulValue=(long)spells[i]*potions[j];
                if(mulValue>=success){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;

    }
        public static int[] successfulPairs1(int[] spells, int[] potions, long success) {
            Arrays.sort(potions);
            int n = potions.length;
            int[] result = new int[spells.length];

            for (int i = 0; i < spells.length; i++) {
                long minPotion = (success + spells[i] - 1) / spells[i]; // ceiling division
                int idx = lowerBound(potions, minPotion);
                result[i] = n - idx;
            }
            return result;
        }

        private static int lowerBound(int[] position, long minPostion) {
            int left = 0, right = position.length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (position[mid] < minPostion) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }

