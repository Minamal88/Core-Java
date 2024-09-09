package string;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("java");
		StringBuffer s1=new StringBuffer();
		System.out.println(s);
		//System.out.println(s.append("is programming langaunge"));
		//System.out.println(s.insert(1,"is"));
		System.out.println(s.length());
		System.out.println(s.capacity());
		System.out.println(s1.capacity());
		System.out.println(s.replace(1, 3, "hello"));
		System.out.println(s.reverse());
		System.out.println(s.delete(0, 2));
	}

}
