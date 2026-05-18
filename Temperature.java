// First Java Program for Temperture Conversion
import java.util.Scanner;
public class Temperature {
    public static void main (String [] argus)
    {
        System.out.println ("Enter Temperature in Celcius : ");
        Scanner C = new Scanner (System.in);
        float c = C.nextFloat ();
        float t = (c * 9/5) + 32 ; 
        System.out.println ("Temperature in Farenhite : ");
        System.out.print (t);
        C.close();
    }
}
