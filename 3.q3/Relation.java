class Relation
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		boolean equal= a==b;
		boolean notequal= a!=b;
		boolean greater= a>b;
		boolean lesser= a<b;
		boolean greatereq= a>=b;
		boolean lessereq= a<=b;
		System.out.println("value of a :"+a+"\nvalue of b is :"+b);
		System.out.println("a is equal to b :"+equal);
		System.out.println("a is not equal to b :"+notequal);
		System.out.println("a is greater than b :"+greater);
		System.out.println("a is less than b :"+lesser);
		System.out.println("a is greater than or equal to b :"+greatereq);
		System.out.println("a is lesser than or equal to b :"+lessereq);
	}
}