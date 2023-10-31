
import java.util.Scanner;

public class sample_NumberFormatException
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        
        while(true)
        {
            System.out.print("Enter a number :  ");
            String input = scanner.nextLine();
            
            try
            {
                double number = Double.parseDouble(input);
                System.out.println("Number " + number + " is valid. . .");
            }
            
            catch(NumberFormatException e)
            {
                System.err.println("NumberFormatException occurred: Invalid number format");
            }
        }
    }
}
