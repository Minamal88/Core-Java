package Serialization;

import java.io.*;

public class DeserializationExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream f= new FileInputStream("f.txt");
			ObjectInputStream o= new ObjectInputStream(f);
			StudentInfo s= (StudentInfo)o.readObject();
			System.out.println("id: "+s.id+"\t name: "+s.name);
			o.close();
			f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
