import java.io.FileInputStream; 
import java.util.Scanner; 

public class FileInputStreamExample {     // File

     public static void main(String args[]){   
          try{    
            FileInputStream fin=new FileInputStream("testout.txt"); 
            int i=0;   
            i=fin.read();
            System.out.println((char)i);
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
    }    
}  