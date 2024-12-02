package ClassAndObeject;

public class AppTV {
	void start( RelationTVandRemote tv) {
		tv.on();
	}
	void stop(RelationTVandRemote tv) {
		tv.stoped();
	}
	void channels(ChaneelDescrption ch) {
		 ch.channelName("uday");
		 ch.episode("biggBoss");
		 ch.channelNum(100);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppTV tv=new AppTV();
		tv.start(new RelationTVandRemote());
//			
//		tv.start(new RelationTVandRemote());
//		tv.channels(new ChaneelDescrption());
//		tv.stop(new RelationTVandRemote());
		new AppTV().start(new RelationTVandRemote());
//
}

}
