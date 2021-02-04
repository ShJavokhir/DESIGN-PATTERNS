//This is observable

package observer;

public interface Channel {
	public void subscribe(Subscriber newSubscriber);
	public void notifyUsers();
}
