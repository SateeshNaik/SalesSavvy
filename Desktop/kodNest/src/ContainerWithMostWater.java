public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int maximumWater=0;
        int i=0, j=height.length-1;
        while (i<j) {
            int width = j - i;
            int heights = Math.min(height[i], height[j]);
            int water = width * heights;
            maximumWater=Math.max(maximumWater, water);
            if(height[i]<height[j]) {
                i++;
            } else {
                j--;
            }
        }

      return maximumWater;

    }
}
