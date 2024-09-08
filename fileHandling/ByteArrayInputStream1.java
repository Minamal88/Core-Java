package fileHandling;
import java.io.*;
public class ByteArrayInputStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream f1 = new FileInputStream("myfile1.txt");
			byte b1[] = new byte[f1.available()];
			f1.read(b1);
			f1.close();
			
			FileInputStream f2 = new FileInputStream("myfile2.txt");
			byte b2[]= new byte[f2.available()];
			f2.read(b2);
			f2.close();
			
			ByteArrayInputStream bout1 = new ByteArrayInputStream(b1);
			ByteArrayInputStream bout2 = new ByteArrayInputStream(b2);
			
			System.out.println("Contents of myfile1.txt");
			int i;
			while((i=bout1.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
			System.out.println("Contents of myfile2.txt");
			while((i=bout2.read())!=-1)
			{
				System.out.print((char)i);
			}
			bout1.close();
			bout2.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}
