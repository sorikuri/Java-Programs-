// Calculator Program
import java.util.*;
public class calculator {
    public static void main (String[] args)
    {
        System.out.println("Enter First Number :");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        System.out.println("Enter Second Number :");
        int b = obj.nextInt();
        int Result ;
        System.out.println("Enter Case : ");
        Scanner sc = new Scanner (System.in);
        char character = sc.next().charAt(0);
        switch (character)
        {
            case 'A':
                Result = a + b;
                System.out.println("Result : " + Result);
                break;
            case 'M':
                Result = a * b;
                System.out.println("Result : " + Result);
                break;
            case 'S':
                Result = a - b;
                System.out.println("Result : " + Result);
                break;
            case 'D':
                Result = a / b;
                System.out.println("Result : " + Result);
                break;
            case 'R':
                Result = a % b;
                System.out.println("Result : " + Result);
                break;
            default:
                break;
                
        }
        obj.close();
        sc.close();
    }
}
