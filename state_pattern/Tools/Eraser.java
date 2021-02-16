package state_pattern.Tools;

public class Eraser implements Tool{

	@Override
	public void onMouseDown() {
		System.out.println("Started erasing using eraser");
	}

	@Override
	public void onMouseUp() {
		System.out.println("Stopped erasing using eraser");
	}
	
}
