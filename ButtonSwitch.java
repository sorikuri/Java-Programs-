import java.util.*;
public class ButtonSwitch {
    public static void main (String [] args)
    {
        System.out.print ("Enter Number :");
        Scanner sc = new Scanner (System.in);
        int Button = sc.nextInt ();
        switch (Button) {
            case 1:
                System.out.println("Hello!");
                break;
            case 2:
                System.out.println("Bonjour!");
                break;
            case 3:
                System.out.println("Hola!");
                break;
            default:
                System.out.println("Invalid case");
                break;
        }
    }
}
