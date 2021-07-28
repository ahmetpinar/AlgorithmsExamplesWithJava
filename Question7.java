import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        
        int sizeOfArray;
        System.out.print("Enter size of array: ");
        sizeOfArray = in.nextInt( );
        
        double myArray[] = new double[sizeOfArray];
        for (int i=0; i< sizeOfArray; i++){
           int j = i + 1;
           System.out.print("Enter value " + j + ". element of array: ");
           myArray[i]=in.nextDouble();
           if(myArray[i] % 2 != 0){
               myArray[i]++;
           }
        }
        for (int i=0; i< sizeOfArray; i++){
        System.out.println("The elements of array are: " + myArray[i]);
        }
    }
}