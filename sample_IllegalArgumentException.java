import java.io.File;

public class sample_IllegalArgumentException 
{
    public static String createRelativePath(String par, String f_name)
    {
        if (par == null)
        {   
            throw new IllegalArgumentException("\nYou cannot provide null parent path!\n");
        }    
        
        if (f_name == null)
        {    
            throw new IllegalArgumentException("\nPlease enter the complete filename!\n");
        }
        
        return par + File.separator + f_name;
    }
    
    public static void main(String[] args)
    {
        System.out.println(sample_IllegalArgumentException.createRelativePath("dir1", "file1")); 
        System.out.println();
        
        System.out.println(sample_IllegalArgumentException.createRelativePath(null, "file1"));
    }
}
