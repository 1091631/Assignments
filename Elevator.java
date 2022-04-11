package Assgn;
import java.util.Scanner;

class Elevator{
	static int floor = 1;
	void selectFloor(int f) {
		try {
		if(f<1 || f>10) {
			throw new MyException("Please select a floor between 1 and 10");
		}
		if(f>floor) {
			System.out.print("Going up");
			while(floor<f) {
				Thread.sleep(1000);
				System.out.print(".."+ ++floor);
			}
			System.out.println("..Ding");
		}
		else if(f<floor) {
			System.out.print("Going down");
			while(floor>f) {
				Thread.sleep(1000);
				System.out.print(".." + --floor);
			}
			System.out.println("..Ding");
		}
		else {
			System.out.println("You've arrived at your requested floor");
		}
		Thread.sleep(1000);
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	void fireAlarm() {
		try {
		if(floor>1) {
			System.out.print("Going down");
			while(floor>1) { 
				Thread.sleep(1000);
				System.out.print(".." + --floor);
			}
		}
		System.out.println("..Ding");
		System.out.println("Please exit the building by pressing 'q'");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}




	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Elevator e = new Elevator();
		char ch;
		do {
			System.out.println("Please select an option");
			System.out.println("(s)elect a floor, (f)ire alarm, (q)uit");
			ch = sc.next().toLowerCase().charAt(0);
			switch(ch) {
			case 's':System.out.println("Enter the floor you'd like to go to: ");
					 int select = sc.nextInt();
					 e.selectFloor(select);
					 break;
			case 'f':System.out.println("Danger! You must exit the building now!");
			 		 e.fireAlarm();
			 		 break;
			case 'q':System.out.println("Moving out");
			         break;
			default:System.out.println("Invalid Selection");
			}
		}while(ch!='q');
		sc.close();
	}
}
class MyException extends Exception{
	MyException(String s){
		super(s);
	}
}

