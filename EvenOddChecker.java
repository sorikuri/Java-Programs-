import java.util.*;
public class EvenOddChecker {
    public static void main (String[] args)
    {
        System.out.println("Enter Number1 :");
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter Number2 :");
        int num2 = sc.nextInt();
        if  (num1 ==  num2)
        {
            System.out.println("Equal");
        }
        else if (num1 > num2) 
        {
            System.out.println(num1 + " is Greater");
        }
        else
        {
            System.out.println(num1+ " is Smaller");
        }
    }
}
