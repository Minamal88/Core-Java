package Serialization;

import java.io.*;

class StudentInfo implements Serializable
{
	int id;
	String name;
	StudentInfo(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
public class SerializationExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream f= new FileOutputStream("f.txt");
			ObjectOutputStream o = new ObjectOutputStream(f);
			StudentInfo s = new StudentInfo(101,"john");
			o.writeObject(s);
			o.close();
			f.close();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
