package state_pattern.Tools;

public class Pen implements Tool{

	@Override
	public void onMouseDown() {
		System.out.println("Started drawing using pen");
	}

	@Override
	public void onMouseUp() {
		System.out.println("Stopped drawing using pen");
	}

}
