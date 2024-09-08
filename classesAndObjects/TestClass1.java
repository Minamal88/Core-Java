package classesAndObjects;
//Object using array
import java.util.*;
class MyClass
{
	int a;
	/*MyClass(int data)
	{
		this.data=data;
	}*/
	void get()
	{
		
		Scanner st=new Scanner(System.in);
		System.out.println("Enter value for a: ");
		a=st.nextInt();
	}
	void getdata()
	{
		System.out.println(a);
	}
}
public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MyClass Obj[]=new MyClass[3];
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter data for object "+(i+1)+": ");
			//int data =sc.nextInt();
			Obj[i]=new MyClass();
			Obj[i].get();
		}
		for(int i=0;i<3;i++)
		{
			Obj[i].getdata();
		}
		
	}

}
