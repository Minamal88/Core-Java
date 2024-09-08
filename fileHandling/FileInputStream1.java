package fileHandling;

import java.io.*;

public class FileInputStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileInputStream f = new FileInputStream("file.txt");
			int i;
			while((i=f.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			f.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}
