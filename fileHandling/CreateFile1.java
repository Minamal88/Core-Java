package fileHandling;
import java.io.*;
public class CreateFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("new file.txt");
		try
		{
			if(f.createNewFile())
			{
				System.out.println("File Successfully Created");
			}
			else
			{
				System.out.println("File already exist");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
