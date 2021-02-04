package observer.subscribers;

import observer.Channel;
import observer.Subscriber;

public class Subscriber1 implements Subscriber {
	
	Channel channel;
	
	@Override
	public void update() {
		System.out.println("Yay, channel published new video !");
	}
	
	public Subscriber1(Channel channel){
		this.channel = channel;
	}

}
