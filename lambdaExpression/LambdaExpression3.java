package lambdaExpression;

@FunctionalInterface
interface Addition
{
	public String student(String name1,String name2);
	public default void show()
	{
		System.out.println("In a show()");
	}
	static void display()
	{
		System.out.println("In a display()");
	}
}
public class LambdaExpression3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a= (name1,name2)->{
			return name1+name2;
		};
		System.out.println(a.student("I am " , "Ram"));
		a.show();
		Addition.display();
	}

}
