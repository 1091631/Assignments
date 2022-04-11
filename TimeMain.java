package Assgn;
class Time{
	private int hour;
	private int minute;
	private int second;
	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
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
	public void setTime(int h, int m, int s) {
		this.hour = h;
		this.minute = m; 
		this.second = s;
	}
	public Time nextSecond() {
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
	public Time previousSecond() {
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
}

public class TimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Time t1 = new Time(1, 2, 3);
	      System.out.println(t1);
	      t1.setHour(4);
	      t1.setMinute(5);
	      t1.setSecond(6);
	      System.out.println(t1);  // toString()
	      System.out.println("Hour: " + t1.getHour());
	      System.out.println("Minute: " + t1.getMinute());
	      System.out.println("Second: " + t1.getSecond());

	      // Test setTime()
	      t1.setTime(23, 59, 58);
	      System.out.println(t1);  // toString()

	      //Test nextSecond();
	      System.out.println(t1.nextSecond());
	      System.out.println(t1.nextSecond().nextSecond());

	      // Test previousSecond()
	      System.out.println(t1.previousSecond());
	      System.out.println(t1.previousSecond().previousSecond());

	}

}
