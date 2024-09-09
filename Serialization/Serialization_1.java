package Serialization;
import java.io.*;
class Student1 implements Serializable
{
	int id;
	String name;
	Student1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
public class Serialization_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream f = new FileOutputStream("student.txt");
			ObjectOutputStream o = new ObjectOutputStream(f);
			Student1 s = new Student1(101,"john");
			o.writeObject(s);
			System.out.println("done");
			o.close();
			f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
