//this is a client side
package state_pattern;

import state_pattern.Tools.Brush;
import state_pattern.Tools.Eraser;

public class Main {
	public static void main(String args){
		Photoshop photoshop = new Photoshop(new Brush());
		//so we will draw something using brush tool
		photoshop.onMouseUp();
		photoshop.onMouseDown();
		//let me erase now
		photoshop.setTool(new Eraser());
		photoshop.onMouseUp();
		photoshop.onMouseDown();
		
		//I just wrote this code but did try to run. I hope it works well :)
	}
}
