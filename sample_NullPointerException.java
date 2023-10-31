public class sample_NullPointerException
{
    public static void main(String[] args) 
    {
        try
        {
            String text = null;
            
            System.out.print(text.charAt(0));
        }
        
        catch(NullPointerException e)
        {
            System.out.println("A NullPointerException has been executed!");
        }
    }
}
