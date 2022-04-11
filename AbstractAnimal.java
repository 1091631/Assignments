package Assgn;

import Assignments.Animal1;
import Assignments.BigDog;
import Assignments.Cat1;
import Assignments.Dog1;

abstract class Animal1 {
	private String name;
	public void Animal1(String name) {
		this.name = name;
	}
	public abstract void greets();
}
class Cat1 extends Animal1{
	public Cat1(String name) {
		super();
	}
	public void greets() {
		System.out.println("Meow");
	}
}
class Dog1 extends Animal1{
	public Dog1(String name) {
		super();
	}
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Dog1 another) {
		System.out.println("Woooof");
	}
}
class BigDog extends Dog1{
	public BigDog(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Woow");
	}
	public void greets(Dog1 another) {
		System.out.println("Woooow");
	}
	public void greets(BigDog another) {
		System.out.println("Woooooooooow");
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Cat1 cat1 = new Cat1("Tom");
	      cat1.greets();
	      Dog1 dog1 = new Dog1("Scoob");
	      dog1.greets();
	      BigDog bigDog1 = new BigDog("Tiger");
	      bigDog1.greets();
	       
	      // Using Polymorphism
	      Animal1 animal1 = new Cat1("Kitty");
	      animal1.greets();
	      Animal1 animal2 = new Dog1("Snuffles");
	      animal2.greets();
	      Animal1 animal3 = new BigDog("Croc");
	      animal3.greets();
	      Dog1 dog2 = (Dog1)animal2;
	      BigDog bigDog2 = (BigDog)animal3;
	      Dog1 dog3 = (Dog1)animal3;
	      dog2.greets(dog3);
	      dog3.greets(dog2);
	      dog2.greets(bigDog2);
	      bigDog2.greets(dog2);
	      bigDog2.greets(bigDog1);


	}
}


