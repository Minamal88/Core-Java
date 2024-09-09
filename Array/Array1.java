package array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		/*for(i=0;i<5;i++)
		{
			System.out.println("Array elements of "+i+"th position: "+arr[i]);
		}*/
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

}
