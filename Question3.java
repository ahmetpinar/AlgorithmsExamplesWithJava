
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        final int currentYear = 2021;
        int birthYear, age;
        System.out.print("Enter your birth year: ");
        birthYear = in.nextInt( );
        
        age = currentYear - birthYear ;
        
        System.out.println("Your age is: " + age);

	}
}