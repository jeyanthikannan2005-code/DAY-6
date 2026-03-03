class Logic
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		boolean r1=(a>b)&&(a!=b);
		boolean r2=(a>b)||(a!=b);
		boolean r3=!(((r1)||(r2))&&(a<=10));
		System.out.println("value of a :"+a+"\nvalue of b :"+b);
		System.out.println("Result of a and b while using AND operator :"+r1);
		System.out.println("Result of a and b while using OR operator :"+r2);
		System.out.println("Result of a and b while using NOT operator :"+r3);
	}
}
		

		
		