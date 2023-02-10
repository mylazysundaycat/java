package Chapter7_EX;

public class EX7_4 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		t.setChannel(13);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(55);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println(t.getChannel());
	}
	
}


class MyTv {
	protected boolean isPowerOn;
	protected int channel;
	protected int volume;
	protected int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setChannel(int channel) {
		this.prevChannel = this.channel;
		if(channel<MIN_CHANNEL||channel>MAX_CHANNEL) {
			return;
		}
		this.channel = channel; 
	}
	
	public int getChannel() {
		return this.channel;
	}
	
	public void setVolume(int volume) {
		if(volume<MIN_VOLUME||volume>MAX_VOLUME) {
			return;
		}
		this.volume = volume; 
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	
	
}