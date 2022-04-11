package Assgn;
class MyCylinder<Circle>{
	private Circle base;
	private double height;
	public MyCylinder(Circle base, double height) {
		this.base = base;
		this.height = height;
	}
	public MyCylinder() {
		this.base = new Circle();
		this.height = 1.0;
	}
	public double getVolume() {
		return base.getArea()*this.height;
	}
}

public class CircleComposition {

	public static <Circle> void main(String[] args) {
		// TODO Auto-generated method stub
		MyCylinder mc = new MyCylinder();
		System.out.println(mc.getVolume());
		Circle c = new Circle(2);
		MyCylinder mc1 = new MyCylinder(c, 2);
		System.out.println(mc1.getVolume());
	}

}

