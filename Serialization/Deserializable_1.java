package Serialization;
import java.io.*;
public class Deserializable_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream f = new FileInputStream("student.txt");
			ObjectInputStream o = new ObjectInputStream(f);
			Student1 s = (Student1)o.readObject();
			System.out.println("Id: "+s.id+" Name: "+s.name);
			o.close();
			f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
