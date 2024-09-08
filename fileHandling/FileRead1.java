package fileHandling;
import java.io.*;
public class FileRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader f = new FileReader("new file.txt");
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
