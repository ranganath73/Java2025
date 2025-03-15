import java.io.*;  

public class ByteArrayInputStreamExample {  

  public static void main(String[] args) throws IOException {  // Stream / Data Stream / Byte Stream
    byte[] buffer = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 99 }; <--- // Size = 10 // 1.Create an Empty Array. 2.Initialization
    // byte[] buffer = new byte[10];    // Declaration
    // Create the new byte array input stream  
    ByteArrayInputStream byt = new ByteArrayInputStream(buf);  // = File Class
    int k = 0;  // (1.Declaration, 2.Initialization)
    
    while ((k = byt.read()) != -1) {       // EOF   // Entry Controlled Loop
      //Conversion of a byte into character  
      char ch = (char) k;        // Typecasting
      System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
    }  
  }  
}  