package Assgn;
class Circle{
	private double radius;
	private String color;
	public Circle(){
		this.radius = 1.0;
		this.color = "Red";
	}
	public Circle(double r){
		this.radius = r;
		this.color = "Red";
	}
	public Circle(double r, String c){
		this.radius = r;
		this.color = c;
	}
	double getRadius() {
		return this.radius;
	}
	void setRadius(double r) {
		this.radius = r;
	}
	public String getColor() {
		return this.color;
	}
	void setColor(String c) {
		this.color = c;
	}
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	public String toString() {
		return "Circle[radius="+this.radius+" color="+this.color+" area="+this.getArea()+"]";
	}
}

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		System.out.println("The First circle has radius of "+c.getRadius()+", area of "
		+c.getArea()+" and it's color is "+c.getColor());
		System.out.println(c);
		Circle c1 = new Circle(2);
		System.out.println("The Second circle has radius of "+c1.getRadius()+", area of "
		+c1.getArea()+" and it's color is "+c1.getColor());
		System.out.println(c1.toString());
		Circle c2 = new Circle(3, "Blue");
		System.out.println("The Third circle has radius of "+c2.getRadius()+", area of "
		+c2.getArea()+" and it's color is "+c2.getColor());
		System.out.println(c2.toString());
		c.setColor("Cyan");
		System.out.println("The First circle has radius of "+c.getRadius()+", area of "
		+c.getArea()+" and it's color is "+c.getColor());
		System.out.printf("First circle's area formatted to precision = %.3f\n",c.getArea());
	}

}

