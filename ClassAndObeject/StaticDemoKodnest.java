package ClassAndObeject;

public class StaticDemoKodnest {
	static int a,b,c;
	int x,y,z;
	static {
		a=10;
		b=20;
		c=30;
	 
	}
	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(z);
	
	}
	{
		a=200;
		b=300;
		c=400;
		 x=100;
		 y=200;
		 z=300;
		 
	}
	void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
	}

}
