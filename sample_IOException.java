import java.io.*;

public class sample_IOException
{
    private static String filepath = "D:User/guest/Desktop/File2.txt" ;
    
    public static void main(String[] args) 
    {
        BufferedReader br1 = null ;
        String curline ;
        
        try
        {
            br1 = new BufferedReader( new FileReader(filepath)) ;
            
            while( ( curline = br1.readLine()) != null )
            {
                System.out.print(curline) ;
            }
        }
        
        catch( IOException E )
        {
            System.err.println("IOException found :  " + E.getMessage()) ;
        }
        
        finally
        {
            try
            {
                if( br1 != null )
                {
                    br1.close() ;
                }
            }
            
            catch( IOException E )
            {
                E.printStackTrace() ;
            }
        }
    }
    
}