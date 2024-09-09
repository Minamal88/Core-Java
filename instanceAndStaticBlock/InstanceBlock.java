package instanceAndStaticBlock;

public class InstanceBlock {

	int a=100;
	static int b=200;
	{			//instance block
		System.out.println(a);
		System.out.println(b);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceBlock i=new InstanceBlock();
	}

}
