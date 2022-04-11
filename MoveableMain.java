package Assgn;

public class MoveableMain {
	interface Movable{
		void moveUp();
		void moveDown();
		void moveLeft();
		void moveRight();
	}

	class MovablePoints implements Movable{
		int x;
		int y;
		int speedX;
		int speedY;
		public MovablePoints(int x, int y, int speedX, int speedY) {
			this.x = x;
			this.y = y;
			this.speedX = speedX;
			this.speedY = speedY;
		}
		public String toString() {
			return "("+this.x+","+this.y+")"+" speed=("+this.speedX+","+this.speedY+")";
		}
		@Override
		public void moveUp() {
			this.y -= this.speedY;
		}
		@Override
		public void moveDown() {
			this.y += this.speedY;
		}
		@Override
		public void moveLeft() {
			this.x -= this.speedX;
		}
		@Override
		public void moveRight() {
			this.x += this.speedX;
		}
	}

	public class MovableMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}
}
