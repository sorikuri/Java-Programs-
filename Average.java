import java.util.*;
public class Average {
    public static int calculateAverage (int a , int b, int c)
    {
        int Sum = a + b + c;
        int average = Sum / 3 ;
        return average ;
    }
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int calAverage = calculateAverage(n1, n2, n3);
        System.out.println("Average of 3 numbers are : " + calAverage);
        sc.close();
    }
}
