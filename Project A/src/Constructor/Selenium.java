package Constructor;

public class Selenium 
{
	public Selenium() {
		this (12,10, 22);
		System.out.println("This is a default constructor");
	}

		public Selenium(int a) {
			System.out.println("One parameterized constructor");
		}

		public Selenium(int a, int b) {
			System.out.println("Two parameterized constructor");
		}
		
		
		public Selenium(int a, int b, int c) {
			System.out.println("Three parameterized constructor");
		}
		
		public static void main(String[] args) {
			new Selenium();
			new Selenium(22,33);
			new Selenium (25);
		}
		
		
}
