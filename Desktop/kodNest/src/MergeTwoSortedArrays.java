import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {

        int[] arr1 ={0,1,0};
        int[] arr2 ={1,};

        merge(arr1,2, arr2,1);
        System.out.println(Arrays.toString(arr1));
    }
    public static void merge ( int[] nums1, int m, int[] nums2,int n){
        int i= m-1;
        int j=n-1;
        int index=m+n-1;
        while(index>=0 ) {
            if(i==-1){
                nums1[index]=nums2[j];
                j--;
            } else if(j==-1){
                nums1[index]=nums1[i];
                i--;
            }
             else if( nums1[i]<nums2[j]){
                nums1[index]=nums2[j];

                j--;
            } else {
                nums1[index]=nums1[i];
                i--;
            }
            index--;
        }



    }
    }




