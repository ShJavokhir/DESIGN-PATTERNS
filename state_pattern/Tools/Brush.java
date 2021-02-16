package state_pattern.Tools;

public class Brush implements Tool{

	@Override
	public void onMouseDown() {
		System.out.println("Started drawing using brush");
	}

	@Override
	public void onMouseUp() {
		System.out.println("Stopped drawing using brush");
	}
	
}
