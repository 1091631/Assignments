package Assgn;
class MyBall{
	private float x; 
	private float y;
	private float z;
	public MyBall(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public float getZ() {
		return z;
	}
	public void setXYZ(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public String toString() {
		return "("+this.x+","+this.y+","+this.z+")";
	}
}

class Player{
	private int number;
	private float x; 
	private float y;
	private float z;
	public Player(int number, float x, float y) {
		this.number = number;
		this.x = x;
		this.y = y;
		this.z = 0.0f;
	}
	public void move(float xDisp, float yDisp) {
		x += xDisp;
		y += yDisp;
	}
	public void jump(float zDisp) {
		z += zDisp;
	}
	public double distance(MyBall ball) {
		float xDiff = this.x - ball.getX();
		float yDiff = this.y - ball.getY();
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	public boolean near(MyBall ball) {
		return distance(ball)<8?true:false;
	}
	public void kick(MyBall ball) {
		float xDiff = this.x - ball.getX();
		float yDiff = this.y - ball.getY();
		System.out.println(Math.atan2(yDiff, xDiff));
	}
}


