package fileHandling;
import java.io.*;
public class FileWrite1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter f = new FileWriter("new file.txt");
			f.write("java programming lanagaugae");
			System.out.println("Successfully write data in the file");
			f.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}
