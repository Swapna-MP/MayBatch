package Arthematic;

public class Maths {
	public int sum (int a, int b)
		{
		
		int c;
		c=a+b;
		System.out.println("sum result" + "=" + c );
		return c;
				
	}
	
	public int sum1 (int a1, int a2)
	
	{
		
		int z;
		z = a1+ a2;
		System.out.println("sum1 result"+ "=" + z);
		return z;
		
}
	
	public int sub (int b1, int b2)
	
	{
		
		int n;
		n = b1- b2;
		System.out.println("sub result"+"=" +n);
		return n;
		
}
	
	public int mul (int d1, int d2)
	
	{
		
		int p;
		p = d1* d2;
		System.out.println("mul result"+"=" +p);
		return p ;
		
}
	
	public void div (int a, int b)
	
	{
		
		int p;
		p = a/b;
		System.out.println("Final result"+"=" +p);
				
}
	
	public static void main(String[] args) {
		
		Maths Arthematic = new Maths ();
		
		int	sumresult= Arthematic.sum(10, 10);
		int sum1result=Arthematic.sum1(sumresult,5);
		int subresult= Arthematic.sub(sum1result, 2);
		int mulresult=Arthematic.mul(subresult, 3);
		Arthematic.div(mulresult, 2);
		
		
		
		
		
		
	}

	
	
	}
