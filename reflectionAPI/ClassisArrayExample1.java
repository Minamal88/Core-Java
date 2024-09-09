package reflectionAPI;

public class ClassisArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,3,7,8};
		String str="hello";
		System.out.println("Is arr is an array? ");
		Class c1 = arr.getClass();
		System.out.println(c1.isArray());
		
		System.out.println("Is str is an array? ");
		Class c2 =str.getClass();
		System.out.println(c2.isArray());
	}

}
