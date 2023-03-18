
import java.util.*;

public class ArrayLargestsumSubArray {
    public static void main(String[] args) {
        int[] a = {-2,-3,4,-1,-2,1,5,-3};
        ArrayLargestsumSubarray obj = new ArrayLargestsumSubarray();
        System.out.println(obj.maxSubArraySum(a));
    }
    public int maxSubArraySum(int a[]){
        int size = a.length;
        int currsum = 0;
        int maxsum = 0;

        for(int i =0; i<size;i++){
            currsum = currsum +a[i];
            if(currsum > maxsum){
                maxsum = currsum;
            }
            if(currsum<0){
                currsum = 0;
            }
        }
        
        return maxsum;
    }
}
