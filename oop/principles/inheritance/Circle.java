package oop.principles.inheritance;

public class Circle extends Rectangle{
	// Phuong thuc ke thua... co day du cac phuong thuc va thuoc tinh cua circle
	public Circle(double edge) {
		super(edge, edge);
	}

	public void setEdge(int edge){

	}

	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		super.setLength(width);
	}

	@Override
	public void setLength(double length) {
		super.setWidth(length);
		super.setLength(length);
	}
}
