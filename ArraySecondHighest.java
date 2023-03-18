/*BY sorting an array
import java.util.Arrays;

public class ArraySecondHighest {
    public static void main(String[] args) {
        int num[] = {1,5,3,9,7,-1,6};

        int n = num.length;

        Arrays.sort(num);

        System.out.println("Second highest number is " + num[n-2]);
    }
}  NOW without Sorting array*/

public class ArraySecondHighest {
    public static void main(String[] args) {
        int num[] = {1,4,6,7,8,3,5,2,};
        int n =num.length;
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int i = 0; i< n; i++){

    
            if (num[i] > highest){
                secondHighest = highest;
                highest = num[i];

            }
            if(num[i] < highest && num[i] > secondHighest){
                secondHighest = num[i];
            }
            
        }
        System.out.println("second highest number" + secondHighest);
        
    
    }
}
