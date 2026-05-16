// Finding percentage through marks
import java.util.Scanner;
public class MarksPercentageCalculator {
    public static void main (String[] args){
        System.out.println ("Enter Marks :");
        Scanner Marks = new Scanner (System.in);
        int marks = Marks.nextInt ();
        int Result = (marks * 100)/100;
        System.out.print ("Result : " + Result); 
    }
}
