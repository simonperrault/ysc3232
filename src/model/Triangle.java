package model;

import java.awt.Point;

public class Triangle {

	private Point[] points;
	
	/**
	 * Constructor for a triangle
	 * @param x1 the X coordinate of the first point
	 * @param y1 the Y coordinate of the first point
	 * @param x2 the X coordinate of the second point
	 * @param y2 the Y coordinate of the second point
	 * @param x3 the X coordinate of the third point
	 * @param y3 the Y coordinate of the third point
	 */
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
	}
	/**
	 * Getter to get the first point of the triangle.
	 * @return the first point of the triangle
	 */
	
	public Point getFirstPoint()
	{
		return this.points[0];
	}
	

	public Point getSecondPoint()
	{
		return this.points[1];
	}
}
