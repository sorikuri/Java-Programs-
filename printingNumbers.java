import java.util.*;
public class printingNumbers {
    public static void main (String [] args)
    {
        // int Sum = 0;
        // System.out.println("Enter Number for Sum");
        // Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= n ; i ++)
        // {
        //     Sum += i;
        // } 
        // System.out.println("Sum : " + Sum);
        // sc.close();    

        System.out.print("Enter Number for Table : ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i ++)
        {
            System.out.println(n + " X " + i + " = " + i*n);
        }
        sc.close();
    }
}
