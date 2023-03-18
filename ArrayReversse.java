import java.util.*;

public class ArrayReversse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the size of an array");

        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values of an array");
        for(int i =0; i < n; i++){
            arr[i] = s.nextInt();
        
        }
        int temp;
        int start=0;
        int end = n-1;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
        System.out.println("print array after reverse");
        for (int j =0; j < n; j++){
            System.out.println(arr[j]);
        }

    
    }
}
