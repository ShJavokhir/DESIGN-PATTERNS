package state_pattern;

import state_pattern.Tools.Tool;

public class Photoshop {
	Tool currentTool = null;
	
	public Photoshop(Tool tool){
		//We will set current tool using constructor
		this.currentTool = tool;
	}
	
	public void setTool(Tool newTool){
		this.currentTool = newTool;
	}
	
	public void onMouseDown(){
		currentTool.onMouseDown();
	}
	
	public void onMouseUp(){
		currentTool.onMouseUp();
	}
}
