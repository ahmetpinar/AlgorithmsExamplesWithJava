import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        
        int sizeOfRows;
        System.out.print("Enter size rows of array: ");
        sizeOfRows = in.nextInt( );
        
        int sizeOfColumns;
        System.out.print("Enter size columns of array: ");
        sizeOfColumns = in.nextInt( );
        
        double myArray[][] = new double[sizeOfRows][sizeOfColumns];
        for (int i=0; i< sizeOfRows; i++){
            for (int j = 0; j < sizeOfColumns ; j++){ 
                System.out.print("Enter value " + i + ". row " + j + ". column element of array: ");
                myArray[i][j]=in.nextDouble();
            }
        }
        
        int rowOrColumnSummation;
        System.out.print("Enter {-1} for summation each rows of array: \nEnter {-2} for summation each columns of array:");
        rowOrColumnSummation = in.nextInt( );
        
        if(rowOrColumnSummation == -1)
            sumOfRows(myArray);
            
        else if(rowOrColumnSummation == -2)
            sumOfColumns(myArray);
	}
	
    public static void sumOfRows(double Array[][]){
        for (int i = 0; i < Array.length; i++){
            double sum = 0.0;
            for (int j = 0; j < Array[0].length ; j++){
                sum += Array[i][j];
            }
            System.out.println("The sum of " + i + ". row is: " + sum);
        }
    }
    
    public static void sumOfColumns(double Array[][]){
        for (int j = 0; j < Array[0].length; j++){
            double sum = 0.0;
            for (int i = 0; i < Array.length ; i++){
                sum += Array[i][j];
            }
            System.out.println("The sum of " + j + ". column is: " + sum);
        }
    }
}
