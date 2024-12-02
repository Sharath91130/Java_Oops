package ClassAndObeject;

class StaticDemo {
	static int a=10;
	static {
		System.out.println("static block");
		
	}
	static void StaticMethod() {
		System.out.println("static method");
	}
}
 class Sharath{
	public static void main(String[] args) {
		StaticDemo.StaticMethod();
		System.out.println(StaticDemo.a);
		
	}

}
