import java.util.*;

public class sample_ArrayIndexOutOfBoundsException_String
{
    public static void main(String[] args) 
    {
        try
        {
            String[] Numbers = new String[6];
            
            Numbers[8] = "LOL" ;
        }
        
        catch(ArrayIndexOutOfBoundsException E)
        {
            System.out.println("Index exceeds the maximum array size. . .");
        }
    }
}