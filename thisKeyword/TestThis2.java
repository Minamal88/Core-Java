package thisKeyword;
//this keyword refers to the current object inside a method
public class TestThis2 {
	void show()
	{
		System.out.println(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThis2 t = new TestThis2();
		System.out.println(t);
		t.show();
	}

}
