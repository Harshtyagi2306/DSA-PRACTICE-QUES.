import java.util.*;
public class TotalSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        char Grade=s.next().charAt(0);
        double hra=0;
        double da=0;
        int allow=0;
        double pf = 0;
        double totalsalary=0;
        
        if (Grade ='A'){
            allow=1700;
        }
        else if (Grade = 'B'){
            allow =1500;
        }
        else(Grade='C'){
            allow = 1300;
        }
        hra = 0.2*basic;
        da=0.5*basic;
        pf=0.11*basic;

        totalsalary=basic +hra +da +allow -pf;

        System.out.println(totalsalary);
    }
    
}
