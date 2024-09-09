package reflectionAPI;

public class ClassisPrimitiveExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//boolean a = int.class.isPrimitive();
		//System.out.println(a);
		ClassisPrimitiveExample1 obj = new ClassisPrimitiveExample1();
		Class c1 = obj.getClass();
		int a=10;
		Class c2 = int.class;
		boolean a1 = c1.isPrimitive();

		System.out.println("Primitive Type? "+c2);
	}

}
