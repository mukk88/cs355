package lab1.models;

import java.awt.Point;

public class Line extends ParentShape{
	
	private Point pointStart;
	private Point pointEnd;
	
	public Line(){
		super();
		pointStart = new Point(0,0);
		pointEnd = new Point(0,0);
	}
	
	public Line(Point start, Point end){
		super();
		pointStart = start;
		pointEnd = end;
	}

	public Point getPointStart() {
		return pointStart;
	}

	public void setPointStart(Point pointStart) {
		this.pointStart = pointStart;
	}

	public Point getPointEnd() {
		return pointEnd;
	}

	public void setPointEnd(Point pointEnd) {
		this.pointEnd = pointEnd;
	}
	
}
