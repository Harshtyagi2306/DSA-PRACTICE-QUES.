import java.util.*;

public class SumofEvennumber {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        int sum = 0;
        while (i <= n ){

            if (i%2==0){
                sum= sum+1;

            }
            i = i+1;

        }
        System.out.println(sum);
    }
    
}
