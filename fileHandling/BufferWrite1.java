package fileHandling;
import java.io.*;
public class BufferWrite1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter f= new FileWriter("hello1.txt");
		BufferedWriter b =new BufferedWriter(f);
		b.write("Welcome");
		b.close();
		f.close();
		System.out.println("Successful..");
	}

}
