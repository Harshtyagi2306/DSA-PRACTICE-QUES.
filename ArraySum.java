
public class ArraySum {
    public static void main(String[] args) {
        int a[] = {2,6,7,8,9};
         
        int sum = 0;
        for(int i =0; i < a.length; i++){

            sum = sum+a[i];

        }
        System.out.println("Sum of Array elements:" + sum);
    }
    
}
