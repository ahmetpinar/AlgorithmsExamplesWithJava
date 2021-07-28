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
        
        String operator;
        System.out.print("Please enter one of these operators = {+,-,*,/}: ");
        operator = user_input.next( );
        
        
        if(operator.equals("+")){
            int sum = firstNumber + secondNumber;
            System.out.println("The result is: " + sum);
        }
         else if(operator.equals("-")){
            int sub = firstNumber - secondNumber;
            System.out.println("The result is: " + sub);
        }
         else if(operator.equals("*")){
            int mult = firstNumber * secondNumber;
            System.out.println("The result is: " + mult);
        }
          else if(operator.equals("/")){
            double firstNumberDouble = (double) firstNumber;
            double secondNumberDouble = (double) secondNumber;
            
            double division = firstNumberDouble / secondNumberDouble;
            System.out.println("The result is: " + division);
        }
    }
}