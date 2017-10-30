package model;

import java.awt.Point;

public class Triangle {

	private Point p1;
	private Point p2;
	private Point p3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
	}
	
	public Point getFirstPoint()
	{
		return this.p1;
	}
	

}
