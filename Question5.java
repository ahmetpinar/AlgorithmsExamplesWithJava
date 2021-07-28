import javax.swing.JOptionPane;

public class Main
{
	public static void main(String[] args) {
	    
	    String a,c;
	    int accountNumber;
	    String code;
	    double gallonsOfWater;
	    
        a = JOptionPane.showInputDialog("Account number");
        accountNumber = Integer.parseInt(a);
        
        code = JOptionPane.showInputDialog("Code:");
        //code = char.parsechar(b);
        
        c = JOptionPane.showInputDialog("Gallons of Water:");
        gallonsOfWater = Double.parseDouble(c);
        
        double amount = 0.0;
        if(code.equals("H")){
            amount = 5 + gallonsOfWater * 0.005;
        }
        
        else if(code.equals("C")){
            if(gallonsOfWater < 4000000)
                amount = 1000;
            else
                amount = 1000 + (gallonsOfWater - 4000000) * 0.025;
        }
        
        else if(code.equals("I")){
            if(gallonsOfWater < 4000000)
                amount = 1000;
            else if(gallonsOfWater < 10000000)
                amount = 2000;
            else
                amount = 3000;
        }
         else {
            System.out.println("There is an error. Please enter a valid code"); 
         }
        
        System.out.println("Amount of your water bill is:" + amount);
	}
}