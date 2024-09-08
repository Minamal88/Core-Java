package fileHandling;

import java.io.*;

public class FileOutputStream1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream f = new FileOutputStream("file.txt");
		try
		{
			String s="hello";
			byte b[]=s.getBytes();
			f.write(b);
			f.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println("File successfully created");
	}

}
