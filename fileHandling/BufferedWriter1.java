package fileHandling;
import java.io.*;
public class BufferedWriter1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
			FileWriter f = new FileWriter("welcome.txt");
			BufferedWriter b = new BufferedWriter(f);
			b.write("hello");
			System.out.println("Successfully write");
			b.close();
			f.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
