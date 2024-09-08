package exceptionHandling;
import java.io.*;
public class TryCatchExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw;
		try
		{
			pw=new PrintWriter("F:\\hello.txt");
			pw.println("saved");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("File saved successfully...");
	}

}
