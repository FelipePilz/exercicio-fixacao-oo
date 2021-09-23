package entities;

public class Rectangle {
	public double width = 2;
	public double height = 2;
	
	public double area() {
		double area = width * height;
		return area;
	}
	
	public double perimeter() {
		double perimeter = (width + height) * 2;
		return perimeter;
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return diagonal;
	}
	
}
