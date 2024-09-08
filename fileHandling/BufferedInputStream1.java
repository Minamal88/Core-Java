package fileHandling;
import java.io.*;
public class BufferedInputStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileInputStream f = new FileInputStream("file1.txt");
			BufferedInputStream b = new BufferedInputStream(f);
			int i;
			while((i=b.read())!=-1)
			{
				System.out.print((char)i);
			}
			b.close();
			f.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
