// Finding factorial of any number
import java.util.*;
public class functionPractice {
    public static int factorial (int n)
        {
            int fact = 1;
            for (int i = 1; i <=n; i ++)
            {
                fact = fact * i;
            }
            System.out.println("Factorial : " + fact);
            return fact;
        }
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt(); 
        factorial (n);
        sc.close();
    }
}
