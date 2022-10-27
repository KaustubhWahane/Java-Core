import java.io.FileReader;
import java.io.FileWriter;  
public class FileWriterReaderExample {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("E:\\file.txt");    
           fw.write("Welcome to the World of Anime");    
           fw.close();    
           FileReader fr=new FileReader("E:\\file.txt");    
           int i;    
           while((i=fr.read())!=-1)    
           System.out.print((char)i);    
           fr.close();    
          }
          catch(Exception e)
          {
            System.out.println(e);
        }    
          System.out.println("\nFile successfully created...");    
     }  
    
} 