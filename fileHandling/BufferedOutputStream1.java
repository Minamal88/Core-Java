package fileHandling;
import java.io.*;
public class BufferedOutputStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			try
			{
				FileOutputStream f = new FileOutputStream("file1.txt");
				BufferedOutputStream b = new BufferedOutputStream(f);
				String s="hello";
				byte bt[]=s.getBytes();
				b.write(bt);
				System.out.println("File successfully created");
				b.close();
				f.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
	}

}
