package oop.principles.inheritance;

public class Rectangle {
	private double width;
	private double length;

	public Rectangle(double width , double length) {
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea(){
		return length * width;
	}

	public double getC(){
		return (length + width) * 2;
	}
}
