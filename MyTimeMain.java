package Assgn;
class MyTime{
	private int hour;
	private int minute;
	private int second;
	public MyTime() {}
	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void setTime(int h, int m, int s) {
		this.hour = h;
		this.minute = m; 
		this.second = s;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public String toString() {
		if(hour<10 && minute<10 && second<10) 
			return "0"+hour+":"+"0"+minute+":"+"0"+second;
		else if(hour<10 && minute<10)
			return "0"+hour+":"+"0"+minute+":"+second;
		else if(minute<10 && second<10)
			return hour+":"+"0"+minute+":"+"0"+second;
		else if(hour<10 && second<10)
			return "0"+hour+":"+minute+":"+"0"+second;
		else if(hour<10)
			return "0"+hour+":"+minute+":"+second;
		else if(minute<10)
			return hour+":"+"0"+minute+":"+second;
		else if(second<10)
			return hour+":"+minute+":"+"0"+second;
		return hour+":"+minute+":"+second;
	}
	public MyTime nextSecond() {
		if(hour==23 && minute == 59 && second == 59) {
			this.hour = 0; this.minute = 0; this.second = 0;
		}
		else if(minute == 59 && second == 59) {
			this.hour += 1; this.minute = 0; this.second = 0;
		}
		else if(second == 59) {
			this.minute += 1; this.second = 0;
		}
		else
			this.second += 1;
		return this;
	}
	public MyTime previousSecond() {
		if(hour==0 && minute == 0 && second == 0) {
			this.hour = 23; this.minute = 59; this.second = 59;
		}
		else if(minute == 0 && second == 0) {
			this.hour -= 1; this.minute = 59; this.second = 59;
		}
		else if(second == 0) {
			this.minute -= 1; this.second = 59;
		}
		else
			this.second -= 1;
		return this;
	}
	public MyTime nextMinute() {
		if(hour==23 && minute == 59) {
			this.hour = 0; this.minute = 0;
		}
		else if(minute == 59) {
			this.hour += 1; this.minute = 0;
		}
		else
			this.minute += 1;
		return this;
	}
	public MyTime previousMinute() {
		if(hour==0 && minute == 0) {
			this.hour = 23; this.minute = 59;
		}
		else if(minute == 0) {
			this.hour -= 1; this.minute = 59;
		}
		else
			this.minute -= 1;
		return this;
	}
	public MyTime nextHour() {
		if(hour == 23)
			this.hour = 0;
		else
			this.hour += 1;
		return this;
	}
	public MyTime previousHour() {
		if(hour == 0)
			this.hour = 23;
		else
			this.hour -= 1;
		return this;
	}
}

public class MyTimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MyTime t1 = new MyTime(1, 2, 3);
	      System.out.println(t1);
	      t1.setHour(4);
	      t1.setMinute(5);
	      t1.setSecond(6);
	      System.out.println(t1);  // toString()
	      System.out.println("Hour: " + t1.getHour());
	      System.out.println("Minute: " + t1.getMinute());
	      System.out.println("Second: " + t1.getSecond());

	      
	      t1.setTime(23, 59, 58);
	      System.out.println(t1);  

	      System.out.println(t1.nextHour());
	      System.out.println(t1.previousHour());
	      
	      System.out.println(t1.nextMinute());
	      System.out.println(t1.previousMinute());
	      
	      System.out.println(t1.nextSecond());
	      System.out.println(t1.nextSecond().nextSecond());

	      
	      System.out.println(t1.previousSecond());
	      System.out.println(t1.previousSecond().previousSecond());
	}

}
