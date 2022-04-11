package Assgn;
class Shape{
	private String color;
	private boolean filled;
	public Shape() {
		this.color = "red";
		this.filled = true;
	}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "Shape[color="+this.color+",filled="+this.isFilled()+"]";
	}
}

class Circle1 extends Shape{
	private double radius;
	public Circle1() {
		this.radius = 1.0;
	}
	public Circle1(double radius) {
		this.radius = radius;
	}
	public Circle1(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}
	public String toString() {
		return "Circle["+super.toString()+",radius="+this.radius+"]";
	}
}

class Rectangle1 extends Shape{
	private double width;
	private double length;
	public Rectangle1() {
		this.width = 1.0;
		this.length = 1.0;
	}
	public Rectangle1(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public Rectangle1(double width, double length, String color, boolean filled) {
		super(color, filled);
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
	public double getArea() {
		return this.length * this.width;
	}
	public double getPerimeter() {
		return 2*(this.length+this.width);
	}
	public String toString() {
		return "Rectangle["+super.toString()+",length="+this.length+",width="+this.width+"]";
	}
}

class Square extends Rectangle1{
	private double side;
	public Square() {}
	public Square(double side) {
		super(side, side);
		this.side = side;
	}
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void setWidth(double width) {
		this.side = width;
	}
	public void setLength(double length) {
		this.side = length;
	}
	public String toString() {
		return "Square["+super.toString()+"]";
	}
}

public class ShapeAndSubclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		System.out.println(s);
		Rectangle1 r = new Rectangle1();
		System.out.println(r);
		Circle1 c = new Circle1();
		System.out.println(c);
		Square sq = new Square(5, "green", false);
		System.out.println(sq);
		System.out.println(sq.getArea());
		System.out.println(sq.getPerimeter());
	}

}
