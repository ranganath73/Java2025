import java.io.*;  

public class FilterInputStreamExample {  

    public static void main(String[] args) throws IOException {  

        File data = new File("testout.txt");  // 1st box 
        FileInputStream  file = new FileInputStream(data); // 2nd box
        FilterInputStream filter = new BufferedInputStream(file); // 3rd box // 4th box
        int k =0;  

        while((k=filter.read())!=-1){  // -1 for EOF  
            System.out.print((char)k);  
        }  

        file.close();  
        filter.close();  
    }  
}  