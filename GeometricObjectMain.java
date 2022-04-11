package Assgn;
interface GeometricObjectMain{
	public double getArea();
	public double getPerimeter();
}
class Circle2 implements GeometricObjectMain{
	private double radius;
	public Circle2(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.radius*this.radius*Math.PI;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.radius;
	}
	public String toString() {
		return "Circle[radius="+this.radius+"]";
	}
}

class Rectangle2 implements GeometricObjectMain{
	private double width;
	private double length;
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.length*this.width;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(this.length+this.width);
	}
	public String toString() {
		return "Rectangle[length="+this.length+" width="+this.width+"]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
