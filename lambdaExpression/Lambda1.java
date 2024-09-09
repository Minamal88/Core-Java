package lambdaExpression;

interface Demo1
{
	String show(String i,String j);
}
public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d=(i,j)->
		{
			return i+j;
		};
		System.out.println(d.show("hello","world"));
	}

}
