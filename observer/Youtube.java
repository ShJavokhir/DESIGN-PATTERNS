//This is client

package observer;

import observer.channels.RandomChannel;
import observer.subscribers.Subscriber1;
import observer.subscribers.Subscriber2;
import observer.subscribers.Subscriber3;

public class Youtube {
	public static void main(String[] args) {
		RandomChannel randomChannel = new RandomChannel();
		
		//Time to make instances of subs and maake them aware about channel :)
		Subscriber1 sub1 = new Subscriber1(randomChannel); // We passed channel as constructor, in our case we suppose subscribers can only subscribe to only one channel
		Subscriber2 sub2 = new Subscriber2(randomChannel);
		Subscriber3 sub3 = new Subscriber3(randomChannel);
		
		//Time to subscribe users to channel
		randomChannel.subscribe(sub1);
		randomChannel.subscribe(sub2);
		randomChannel.subscribe(sub3);
		
		//So randomChannel published new video and now it is time to notify users
		randomChannel.notifyUsers();
		
	}
}
