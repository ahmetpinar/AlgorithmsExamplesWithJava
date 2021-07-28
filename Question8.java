public class Main
{
	public static void main(String[] args) {
	    
	    int myArray[] = new int[]{2,4,6,8};
	    int total = sumArray(myArray);
	   
        System.out.println("The sum of array is: " + total);
        
	}
	  public static int sumArray(int Array[]){
            int sum = 0;
            for (int i = 0; i < Array.length; i++){
                sum += Array[i];
                }
            return sum;    
        }
}