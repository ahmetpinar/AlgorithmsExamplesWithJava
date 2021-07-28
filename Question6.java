import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        
        int firstNumber;
        System.out.print("Enter your first integer: ");
        firstNumber = in.nextInt( );
        
        int secondNumber;
        System.out.print("Enter your second integer: ");
        secondNumber = in.nextInt( );
        if(firstNumber < secondNumber){
            int i;
            
            for (i = firstNumber; i < secondNumber;i++ ) {
                int j;
                int counter = 0;
                for (j = 2; j < i; j++ ) {
                    if(i % j == 0)
                        counter++;
                }
                if (counter == 0) 
                    System.out.println(i + " is a prime number.");
            }
        }
        
        if(firstNumber > secondNumber){
            int i;
            
            for (i = secondNumber; i < firstNumber;i++ ) {
                int j;
                int counter = 0;
                for (j = 2; j < i; j++ ) {
                    if(i % j == 0)
                        counter++;
                }
                if (counter == 0) 
                    System.out.println(i + " is a prime number.");
            }
        }

    }
}