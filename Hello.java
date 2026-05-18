import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        // System.out.println ("Taking Input 1 from the user :");
        Scanner obj = new Scanner (System.in);
        // int r = obj.nextInt();
        // System.out.println ("Taking Input 2 from the user :");
        // int d = obj.nextInt();
        // int sum = r + d;
        // System.out.print ("Sum : ");
        // System.out.println (sum);
        Boolean b1 = obj.hasNextInt();
        System.out.println (b1);
        obj.close(); 
    }
}