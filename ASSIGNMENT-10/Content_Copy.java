import java.io.*;

public class Content_Copy
    {
        public static void main(String args[]){
        
        File f = new File("F:/abc.txt");
        
        File g = new File("F:/xyz.txt");
        
        try
            {
                FileInputStream fin = new FileInputStream(f);
            
                int i = fin.read();
                
                FileOutputStream fout = new FileOutputStream(g);
                
                while(i!=-1)
                {
                    fout.write((char)i);
                
                    i = fin.read();
                }
            
                fin = new FileInputStream(g);
            
                i = fin.read();
            
                while(i!=-1)
                {
                
                    System.out.print((char)i);
                
                    i = fin.read();
                }
            }
        
        catch(IOException e)
            {
            
                System.out.println(e);
            }
    }
}