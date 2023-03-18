import java.util.*;

public class SumofNNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n =s.nextInt();
        
        int i = 1; //nextnumtobeadded
        int sum = 0;
        while ( i <= n){
            sum = sum + i;
            i = i + 1;

        }
        System.out.println(sum);

    }
    
}
