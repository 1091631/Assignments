package Assgn;
class Date{
	private int day;
	private int month;
	private int year;
	public Date(int date, int month, int year) {
		this.day = date;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString() {
		if(day<10 && month<10) 
			return "0"+day+"/"+"0"+month+"/"+year;
		else if(day<10)
			return "0"+day+"/"+month+"/"+year;
		else if(month<10)
			return day+"/"+"0"+month+"/"+year;
		return day+"/"+month+"/"+year;
	}
}

public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Date d1 = new Date(1, 2, 2014);
	      System.out.println(d1);
	      d1.setMonth(12);
	      d1.setDay(9);
	      d1.setYear(2099);
	      System.out.println(d1);
	      System.out.println("Month: " + d1.getMonth());
	      System.out.println("Day: " + d1.getDay());
	      System.out.println("Year: " + d1.getYear());
	      d1.setDate(3, 4, 2016);
	      System.out.println(d1);

	}

}

