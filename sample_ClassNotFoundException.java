public class sample_ClassNotFoundException 
{
    private static final String CLASS_TO_LOAD = "main.java.utils" ;
    
    public static void main(String[] args) 
    {
        try
        {
            Class loadedClass = Class.forName( CLASS_TO_LOAD ) ;
            System.out.print( "Class :  " + loadedClass + " found!" ) ;
        }
        
        catch( ClassNotFoundException E )
        {
            System.err.println( "ClassNotFoundException was found:  " + E.getMessage());
            E.printStackTrace();
        }
    }
    
}