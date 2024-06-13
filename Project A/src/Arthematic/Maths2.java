package Arthematic;

public class Maths2 {
	
	public int mul(int a,int b)
	{
		
		int c;
		c=a*b;
		System.out.println("mul result" + "=" + c);
		return c;
				
	}
	
	public int sub (int a1, int a2)
	
	{
		
		int z;
		z = a1 - a2;
		System.out.println("sub result"+ "=" + z);
		return z;
		
}
	
	public int sum (int b1, int b2)
	
	{
		
		int n;
		n = b1+ b2;
		System.out.println("sum result"+"=" +n);
		return n ;
		
}
	
	public int sub2 (int d1, int d2)
	
	{
		
		int p;
		p = d1- d2;
		System.out.println("sub2 result"+"=" +p);
		return p ;
		
}
	
	public void div (int a, int b)
	
	{
		
		int p;
		p = a/b;
		System.out.println("Final result"+"=" +p);
				
}
	public static void main(String[] args) {
		
		Maths2 Arthematic = new Maths2 ();
		
		int	mulresult= Arthematic.mul(10, 10);
		int subresult=Arthematic.sub(mulresult,5);
		int sumresult= Arthematic.sum(subresult, 2);
		int sub1result=Arthematic.mul(sumresult, 3);
		Arthematic.div(sub1result, 2);
		
		
		
		
		
		
	}

	
	
	}
