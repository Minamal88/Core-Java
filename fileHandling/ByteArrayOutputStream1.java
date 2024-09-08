package fileHandling;
import java.io.*;
public class ByteArrayOutputStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream f1 = new FileOutputStream("myfile1.txt");
			FileOutputStream f2 = new FileOutputStream("myfile2.txt");
			ByteArrayOutputStream b = new ByteArrayOutputStream();
			String s="hello";
			byte b1[] = s.getBytes();
			b.write(b1);
			b.writeTo(f1);
			b.writeTo(f2);
			b.close();
			System.out.println("File successfully created");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
