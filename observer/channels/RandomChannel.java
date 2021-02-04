
package observer.channels;

import java.util.ArrayList;
import observer.Channel;
import observer.Subscriber;

public class RandomChannel implements Channel{
	
	ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	@Override
	public void subscribe(Subscriber newSubscriber) {
		subscribers.add(newSubscriber);
		
	}

	@Override
	public void notifyUsers() {
		for(Subscriber subscriber: subscribers){
			subscriber.update();
		}
		
	}

	
	
}
