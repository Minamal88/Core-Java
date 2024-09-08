package ControlStructure;

public class JumpStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			
			/*
			 * if(i==5) 
			 * { 
			 * 		break;	//stop 
			 * }
			 */
			if(i==5)
			{
				continue;	//skip
			}
			System.out.println(i);
		}
	}

}
