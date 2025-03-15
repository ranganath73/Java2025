//Java program demonstrating ObjectOutputStream methods
//illustrating annotateClass(Class<?> cl) method

import java.io.*;
class ObjectOutputStreamDemo extends ObjectOutputStream
{
	public ObjectOutputStreamDemo(OutputStream out) throws IOException
	{
		super(out);
	}
	
	public static void main(String[] args) throws IOException,
	ClassNotFoundException
	{
		FileOutputStream fout = new FileOutputStream("file.txt");
		ObjectOutputStreamDemo oot = new ObjectOutputStreamDemo(fout);
		Character c = 'A';
		
		//illustrating annotateClass(Class<?> cl) method
		oot.annotateClass(Character.class);
        //https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html
        //https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html
		
		//Write the specified object to the ObjectOutputStream
		oot.writeObject(c);
		
		//flushing the stream
		oot.flush();
		
		//closing the stream
		oot.close();
		
		FileInputStream fin = new FileInputStream("file.txt");
		ObjectInputStream oit = new ObjectInputStream(fin);
		System.out.println(oit.readObject());
		oit.close();
	}
}
