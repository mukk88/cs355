package lab1.models;

import java.util.ArrayList;

public class Model {
	private ArrayList<ParentShape> shapeList = new ArrayList<ParentShape>();
	
	public Model(){
		
	}
	
	public void addShape(ParentShape shape){
		shapeList.add(shape);
	}
}
