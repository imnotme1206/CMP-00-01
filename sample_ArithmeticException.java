import java.util.*;
public class sample_ArithmeticException
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        int a ;
        
        System.out.println("\tDivide\n");
        
        try
        {
            System.out.print("Enter 1st number :  ");
            int str = scan.nextInt();
            
            System.out.print("Enter 2nd number:  ");
            int num = scan.nextInt();
            
            a = str / num;
            System.out.println("\nResult :  " + str + " / " + num + " = " + a);
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("\nDivision by Zero is not allowed. . .\n");
            System.out.println(e+"\n");
        }
        
        catch(InputMismatchException e)
        {
            System.out.println("\nDetected String input. . .\n\nAn error has occured. . .");
        }
        
        finally
        {
            System.out.println("\n\tProgram automatically terminated. . .");
        }
    }
}