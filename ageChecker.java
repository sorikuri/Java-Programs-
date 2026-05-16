import java.util.Scanner;
public class ageChecker {
    public static void main (String[] args)
    {
        System.out.println ("Enter Your Age :");
        Scanner age = new Scanner (System.in);
        int Age = age.nextInt ();
        if (Age >= 18)
        {
            System.out.println ("You are an Adult.");
        }
        else{
            System.out.println ("You are not an Adult.");
        }
        age.close();
    }
}
