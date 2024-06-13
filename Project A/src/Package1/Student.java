package Package1;

public class Student {
	
	int age;
	int rollNo;
	public void display() {
		System.out.println("Welcome to you all");
		System.out.println("Automation is very easy");
		}
	public static void main(String[] args) {
		Student abc=new Student();
		abc.display();
		abc.age = 10;
		abc.rollNo = 25;
		System.out.println("Age" +"="+ abc.age);
		System.out.println("Roll No" + "="+ abc.rollNo);
		
		
	}
	
	}
