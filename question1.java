
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
        
        int firstNumber;
        System.out.print("Enter your first integer: ");
        firstNumber = user_input.nextInt( );
        
        int secondNumber;
        System.out.print("Enter your second integer: ");
        secondNumber = user_input.nextInt( );
        
        int quotient;
        int reminder;
        quotient = firstNumber / secondNumber;
        reminder = firstNumber % secondNumber;
        
        System.out.println("The quotient is: " + quotient);
        System.out.println("The reminder is: " + reminder);

	}
}