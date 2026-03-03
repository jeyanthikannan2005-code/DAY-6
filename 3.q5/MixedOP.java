class MixedOP
{
	public static void main(String[] args)
	{
		int a=10;
		int b=5;
		int c=15;
		//Arithmatic
		int d=(a+b)*c;
		int e=(c%a)/(a-b);
		//Relational
		boolean b1= e<=b;
		boolean b2= d>=e;
		boolean b3= true==false;
		boolean b4= (a+b)<(c%a);
		boolean b5= (a>b)!=(c<b); 
		//logical
		boolean r1=(a>b)&&(a!=c);
		boolean r2=(a>b)||(a!=b);
		Boolean r3=!(((r1)||(r2))&&(a<=c));
		boolean r4= (true==false)||(b5);
		//SOP
		System.out.println("The results for arithmetic operations :"+"\n"+d+"\n"+e);
		System.out.println("The results for relational operations :"+"\n"+b1+"\n"+b2+"\n"+b3+"\n"+b4+"\n"+b5);
		System.out.println("The results for logical operations :"+"\n"+r1+"\n"+r2+"\n"+r3+"\n"+r4);
	}
}
		

		

		