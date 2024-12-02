package ClassAndObeject;

public class classRoom {
	String name;
	void lightsOn(String name) {
		System.out.println(name+" light "+"is on ");
	}
	void fanson(FansON f ) {
		f.rotate();
		
	}
	void blowsair(FansON f) {
		f.blowsair();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       classRoom cls=new classRoom();
       cls.lightsOn("yellow");
       cls.fanson(new FansON() );
       cls.blowsair(new FansON());
	}

}
