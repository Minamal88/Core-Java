package lambdaExpression;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
public class UnaryOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer>up =(v)->(v*10);
		System.out.println(up.apply(5));
		
		UnaryOperator<String>up1 =(str)->(str.replace('t','s'));
		System.out.println(up1.apply("hello"));
		
		BinaryOperator<String>bp =(str,str1)->(str.concat(str1));
		System.out.println(bp.apply("hello","world"));
		
		BinaryOperator<String>bp1 =(str,str1)->(str.length()>=str1.length()?str:str1);
		System.out.println(bp1.apply("hello", "world1"));
	}

}
