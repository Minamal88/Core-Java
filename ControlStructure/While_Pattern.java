package ControlStructure;

public class While_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j;
		while(i<=5)
		{
			j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
