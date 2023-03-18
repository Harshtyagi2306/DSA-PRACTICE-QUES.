import java.util.Arrays;

public class ArrayKthelement {
    public static void main(String[] args) {
        int arr[]= {6,2,3,4,1,7};
        int k =2;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
    
}
