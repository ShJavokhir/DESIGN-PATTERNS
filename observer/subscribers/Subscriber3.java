package observer.subscribers;

import observer.Channel;
import observer.Subscriber;

public class Subscriber3 implements Subscriber{

	Channel channel;
	
	@Override
	public void update() {
		System.out.println("Yay, channel published new video !");
		
	}
	
	public Subscriber3(Channel channel){
		this.channel = channel;
	}

}
