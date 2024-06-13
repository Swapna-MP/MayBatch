package Constructor;

public class Practise1 
{
	public Practise1() {
		System.out.println("This is a default constructor");
	}

	public Practise1(int a) {
		System.out.println("This is a first parameterized constructor");
	}

	public Practise1(int a, int b) {
		System.out.println("This is a second parameterized constrauctor");
	}
	
	public Practise1(int a, int b , int c) {
		this ();
		System.out.println("This is a 3rd parameterized constructor");
		
	}
	public static void main(String[] args) {
		new Practise1(22,10,36);
		new Practise1(22,10);
		new Practise1(15);
		
	}
}

