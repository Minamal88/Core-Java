package reflectionAPI;

public class ClassExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class<Boolean> c1 = boolean.class;
		System.out.println(c1);
		
		Class<ClassExample1> c2 = ClassExample1.class;
		System.out.println(c2);
	}

}
