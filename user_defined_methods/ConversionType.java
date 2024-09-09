package user_defined_methods;

public class ConversionType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		double y=x;		//implicit conversion
		System.out.println("Value present in double datatype: "+y);
		
		double a=12.0;
		int b=(int)a;	//explicit conversion
		System.out.println("Value present in int datatype: "+b);
	}

}
