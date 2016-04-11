package Sample_0411;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television mytv = new Television();
		Television yourtv = new Television();
		Television ttv = mytv;
		
		mytv.channel = 18;
		mytv.volume = 20;
		mytv.onOff = true;
		mytv.onOff = false;
		
		//mytv.volume = mytv.volumeUP(30);
		mytv.volumeUP();	
		
		//System.out.println(mytv.channel + " " + mytv.volume + " " + mytv.onOff);
		mytv.pr();
		
		yourtv.channel = 7;
		yourtv.volume = 9;
		yourtv.onOff = false;
		
		//System.out.println(yourtv.channel + " " + yourtv.volume + " " + yourtv.onOff);
		yourtv.pr();
		mytv.channel = 231;
		
		//ttv = null;
		//System.out.println(ttv.channel + " " + ttv.volume + " " + ttv.onOff);
		ttv.pr();
		ttv = null;
		
	}

}
