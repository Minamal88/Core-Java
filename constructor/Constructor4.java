package constructor;

class person1
{
	int roll;
	double salary;
	person1(int a,double b)	//parameterized constructor
	{
		roll=a;
		salary=b;
		System.out.println("Original constructor values: \n"+roll+"\t"+salary);
	}
	person1(person1 ref)	//copy constructor
	{
		roll=ref.roll;
		salary=ref.salary;
		System.out.println("Copy constructor values: \n"+roll+"\t"+salary);
	}
}
public class Constructor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person1 p=new person1(10,12.4444);
		person1 p1=new person1(p);
	}

}
