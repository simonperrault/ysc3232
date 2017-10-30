package model;

import java.awt.Point;

public class Triangle {

	private Point[] points;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		this.points = new Point[3];
		this.points[0] = new Point(x1, y1);
		this.points[1] = new Point(x2, y2);
		this.points[2] = new Point(x3, y3);
	}
	

}
