import java.util.Scanner;

public class patternTriangle {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i=1;
        while(i<=N){
            int space=1;
            while(space<=N-i){
                System.out.print(" ");
                space++;   

            }
            int j=1;
            int p =i;
            while(j<=i){
                System.out.print(p);
                p++;
                j++;
                
            }
            p=2*i-2;
            j=1;
            while(j<=i-1){
                System.out.print(p);
                p--;
                j++;
                
            }
            System.out.println();
            i++;
            
        }
    }
}