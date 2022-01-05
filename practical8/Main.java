package practical8;
import java.util.Scanner;

//========================Abstract Class Car Factory==============//
abstract class CarFactory{
	//declaration of data member
	String company,car_name;
	double budget;
	
	//declaration of abstract methods
	abstract void getPrice(double price);
	abstract void detail(String company_name,String car_name);
	abstract void accessories();
	
	//declaration and implementation of input method
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Company- ");
		company = scan.next();
		System.out.print("Car- ");
		car_name = scan.next();
		System.out.print("Rough Budget(in lakhs)- ");
		budget = scan.nextDouble();
	}
	
	//calling the methods in display method
	void display(CarFactory obj1) {
		obj1.getPrice(budget);
		System.out.println("\n---------------------------------------");
		obj1.detail(company, car_name);
		System.out.println("\n---------------------------------------");
		obj1.accessories();
		System.out.println("\n---------------------------------------");
	}
}

//-----------------------Small Cars---------------------------------//
class SmallCar extends CarFactory{
	String Ans;
	
	//method for getPrice
	public void getPrice(double price) {
		if(price > 2 && price < 5)
			Ans = "No";
		else
			Ans = "Yes";
	}
	
	//method for displaying car details
	public void detail(String company_name,String car_name) {
		System.out.println("Company- "+company_name);
		System.out.println("Name of Car- "+car_name);
		System.out.println("Color- Black/White/Orange/Red");
		System.out.println("Fuel- Petrol");
		System.out.println("Gears- Manual");
	}
	
	//method to display accessories of car
	public void accessories() {
		System.out.println("Types of Tyres- Alloy Wheels");
		System.out.println("Airbags- "+Ans);
		System.out.println("Back wiper- "+Ans);
		System.out.println("Side Mirror- two");
		System.out.println("Touch Screen Music Player- "+Ans);
	}
}

//-----------------------Sedan type---------------------------------//
class Sedan extends CarFactory{
	String Ans;
	
	//method for getPrice
	public void getPrice(double price) {
		if(price > 6 && price < 10)
			Ans = "No";
		else
			Ans = "Yes";
	}
	
	//method for displaying car details
	public void detail(String company_name,String car_name) {
		System.out.println("Company- "+company_name);
		System.out.println("Name of Car- "+car_name);
		System.out.println("Color- Black/White/Orange/Red");
		System.out.println("Fuel- Petrol/Diesel");
		System.out.println("Gears- Auto/Manual");
	}
	
	//method to display accessories of car
	public void accessories() {
		System.out.println("Types of Tyres- Alloy Wheels");
		System.out.println("Airbags- YES");
		System.out.println("Back wiper- YES");
		System.out.println("Side Mirror- two");
		System.out.println("Touch Screen Music Player- YES");
		System.out.println("Roof Window- "+Ans);
	}
}

//-----------------------Luxury Cars---------------------------------//
class Luxury extends CarFactory{
	String Ans;
	
	//method for getPrice
	public void getPrice(double price) {
		if(price > 10 && price < 14)
			Ans = "No";
		else
			Ans = "Yes";
	}
	
	//method for displaying car details
	public void detail(String company_name,String car_name) {
		System.out.println("Company- "+company_name);
		System.out.println("Name of Car- "+car_name);
		System.out.println("Color- Black/White/Orange/Red");
		System.out.println("Fuel- Diesel");
		System.out.println("Gears- Auto");
	}
	
	//method to display accessories of car
	public void accessories() {
		System.out.println("Types of Tyres- Alloy Wheels");
		System.out.println("Airbags- YES");
		System.out.println("Back wiper- YES");
		System.out.println("Side Mirror- two");
		System.out.println("Touch Screen Music Player- YES");
		System.out.println("Roof Window- YES");
		System.out.println("Automotive Garbage Cans- "+Ans);
		System.out.println("Automatic Air Freshner- "+Ans);
		System.out.println("Button Start- "+Ans);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ch;
		
		CarFactory obj;
		
		while(true) {
			
			System.out.println("Which Car Do you Want to See?- ");
			System.out.println("\n\t1.Small Car(2 Lakh - 10 Lakh)\n\t2.Sedan(6 Lakh - 14 Lakh)\n\t3.Luxury(10 Lakh - 55 lakh)\n\t4.Exit");
			ch = scan.nextInt();
			System.out.println();
			
			switch(ch) {
			
			case 1:
				obj = new SmallCar();
				obj.input();
				obj.display(obj);
				break;
				
			case 2:
				obj = new Sedan();
				obj.input();
				obj.display(obj);
				break;
				
			case 3:
				obj = new Luxury();
				obj.input();
				obj.display(obj);
				break;
				
			case 4:
				System.out.println("\n---------------------------------------");
				return;
				
			default:
				System.out.println("Invalid Choice!!");
				System.out.println("\n---------------------------------------");
				break;
				
			}
		}
	}
}
