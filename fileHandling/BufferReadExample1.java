package fileHandling;
import java.io.*;
public class BufferReadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader f=new FileReader("hello1.txt");
			BufferedReader br =new BufferedReader(f);
			int i;
			while((i=br.read())!=-1)
			{
				System.out.print((char)i);
			}
			br.close();
			f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
