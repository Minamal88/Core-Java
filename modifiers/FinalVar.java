package modifiers;
import package1.*;
public class FinalVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=100;
		//a=200;
		System.out.println("The value of a="+a);
		Demo d=new Demo();
		d.show();
		Sum s=new Sum();
		s.add();
	}

}
