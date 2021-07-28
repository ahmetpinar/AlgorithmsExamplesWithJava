
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        double lenghtInch, lenghtMeter;
        System.out.print("Enter the lenght in inches: ");
        lenghtInch = in.nextDouble( );
        
        lenghtMeter = lenghtInch * 0.0254;
        
        System.out.println("The length in inches: " + lenghtInch);
        System.out.println("The length in meters: " + lenghtMeter);

	}
}