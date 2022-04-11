package Assgn;
class Rectangle{
	private float length;
	private float width;
	public Rectangle(){
		this.length = 1.0f;
		this.width = 1.0f;
	}
	public Rectangle(float l, float w){
		this.length = l;
		this.width = w;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public double getArea() {
		return this.length*this.width;
	}
	public double getPerimeter() {
		return 2*(this.length+this.width);
	}
	public String toString() {
		return "Rectangle[length="+this.length+" width="+this.width+"]";
	}
}

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1.2f, 3.4f);
	    System.out.println(r1);
	    Rectangle r2 = new Rectangle();
	    System.out.println(r2);
	    r1.setLength(5.6f);
	    r1.setWidth(7.8f);
	    System.out.println(r1);  
	    System.out.println("First Rectangle length is: " + r1.getLength());
	    System.out.println("First Rectangle width is: " + r1.getWidth());
	    System.out.printf("First Rectangle area is: %.2f%n", r1.getArea());
	    System.out.printf("First Rectangle perimeter is: %.2f%n", r1.getPerimeter());

	}

}

