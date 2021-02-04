package observer.subscribers;

import observer.Channel;
import observer.Subscriber;

public class Subscriber2 implements Subscriber{

	Channel channel;
	
	@Override
	public void update() {
		System.out.println("Yay, channel published new video !");
		
	}
	
	public Subscriber2(Channel channel){
		this.channel = channel;
	}
}
