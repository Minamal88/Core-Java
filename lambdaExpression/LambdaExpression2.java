package lambdaExpression;

@FunctionalInterface
interface Demo
{
	int add(int n);
}
public class LambdaExpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d =(n)->{
			return n;
		};
		System.out.println("The value of n: "+d.add(5));
	}
}