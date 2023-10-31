public class sample_ArrayIndexOutOfBoundsException_Integer
{
    public static void main(String[] args) 
    {
        try
        {
            int[] Numbers = new int[6];
            
            Numbers[8] = 2 ;
        }
        
        catch(ArrayIndexOutOfBoundsException E)
        {
            System.out.println("Index exceeds the maximum array size. . .");
        }
    }
}
