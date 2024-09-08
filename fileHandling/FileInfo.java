package fileHandling;
import java.io.*;
public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("new file.txt");
		File r = new File("welcome.txt");
		if(f.exists())
		{
			System.out.println("File name: "+f.getName());
			System.out.println("File path: "+f.getAbsolutePath());
			System.out.println("File writable: "+f.canWrite());
			System.out.println("File readable: "+f.canRead());
			System.out.println("File size: "+f.length());
			//System.out.println("Rename file name: "+f.renameTo(r));
			//System.out.println("File renamed successfully");
			System.out.println("File remove: "+f.delete());
		}
		else
		{
			System.out.println("File does not exist");
		}
	}

}
