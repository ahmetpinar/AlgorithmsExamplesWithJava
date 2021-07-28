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
        }
        
        double max = findMaxElement(myArray);
        System.out.println("The maximum element of array is: " + max);
    }
	
    public static double findMaxElement(double Array[]){
        double maxElement = Array[0];
        for (int i = 0; i < Array.length; i++){
            if(Array[i] > maxElement){
                maxElement = Array[i];
            }
        }
        return maxElement;    
    }
}