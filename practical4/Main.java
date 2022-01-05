package practical4;
import java.util.*;

interface vehicle{
	void gear_change(int a);
	void speed_up();
	void apply_brakes();
	void display();
}

class bicycle implements vehicle{
	
	int gear,speed;
	
	//default constructor for Bicycle
	bicycle(){
		System.out.println("\tBicycle started successfully\tSpeed 10km/h and gear 1\n");
		gear = 1;
		speed = 10;
	}
	
	public void gear_change(int gearex) {
		
		if(gearex < 8 && gearex > 0) {
			gear = gearex;
			System.out.println("\tGear changed successfully \n\t Current Gear is "+gear);
		}
		else
			System.out.println("Gear is out of Range");
	}
	
	public void speed_up() {
		
		if((speed + 5) < 50) {
			speed = speed + 5;
			System.out.println("\n\tBicycle speed increased \n\t current speed is "+speed);
		}
		else
			System.out.println("Speed cannot be Increased above 50 km/h\n");
	}
	
	public void apply_brakes() {
		
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("1. Decrease Speed\n2. Stop Bicycle\n");
		x = sc.nextInt();
		
		if(x == 1) {
			if((speed - 5) > 0) {
				speed = speed - 5;
				System.out.println("Speed Reduced\n\t Current speed is "+speed);
			}
			else {
				speed = 0;
				gear = 0;
				System.out.println("Bicycle stopped successfully\n");
			}
		}
		
		else if(x == 2) {
			speed = 0;
			gear = 0;
			System.out.println("Bicycle stopped successfully\n");
		}
		
		else
			System.out.println("\nInvalid Input");
	}
	
	public void display() {
		System.out.println("Your Bicycle Speed is "+speed+" km/h and gear is "+gear);
	}
}

class car implements vehicle{
	
	int gear,speed;
	
	//default constructor for Car
	car(){
		System.out.println("\tCar started successfully\tSpeed 10km/h and gear 1\n");
		gear = 1;
		speed = 10;
	}
	
	public void gear_change(int gearex) {
		
		if(gearex < 8 && gearex > 0) {
			this.gear = gearex;
			System.out.println("\tGear changed successfully \n\t Current Gear is "+gear);
		}
		else
			System.out.println("Gear is out of Range");
	}
	
	public void speed_up() {
		
		if((speed + 20) < 150) {
			speed = speed + 20;
			System.out.println("\n\tCar's speed increased \n\t current speed is "+speed);
		}
		else
			System.out.println("Speed cannot be Increased above 150 km/h\n");
	}
	
	public void apply_brakes() {
		
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("1. Decrease Speed\n2. Stop Car\n");
		x = sc.nextInt();
		
		if(x == 1) {
			if((speed - 20) > 0) {
				speed = speed - 20;
				System.out.println("Speed Reduced\n\t Current speed is "+speed);
			}
			else {
				speed = 0;
				gear = 0;
				System.out.println("Car stopped successfully\n");
			}
		}
		
		else if(x == 2) {
			speed = 0;
			gear = 0;
			System.out.println("Car stopped successfully\n");
		}
		
		else
			System.out.println("\nInvalid Input");
	}
	
	public void display() {
		System.out.println("Your Car Speed is "+speed+" km/h and gear is "+gear);
	}
}

class bike implements vehicle{
	
	int gear,speed;
	
	//default constructor for Bike
	bike(){
		System.out.println("\tBike started successfully\tSpeed 10km/h and gear 1\n");
		gear = 1;
		speed = 10;
	}
	
	public void gear_change(int gearex) {
		
		if(gearex < 6 && gearex > 0) {
			gear = gearex;
			System.out.println("\tGear changed successfully \n\t Current Gear is "+gear);
		}
		else
			System.out.println("Gear is out of Range");
	}
	
	public void speed_up() {
		
		if((speed + 10) < 100) {
			speed = speed + 10;
			System.out.println("\n\tBike speed increased \n\t current speed is "+speed);
		}
		else
			System.out.println("Speed cannot be Increased above 100 km/h\n");
	}
	
	public void apply_brakes() {
		
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("1. Decrease Speed\n2. Stop Bike\n");
		x = sc.nextInt();
		
		if(x == 1) {
			if((speed - 10) > 0) {
				speed = speed - 10;
				System.out.println("Speed Reduced\n\t Current speed is "+speed);
			}
			else {
				speed = 0;
				gear = 0;
				System.out.println("Bike stopped successfully\n");
			}
		}
		
		else if(x == 2) {
			speed = 0;
			gear = 0;
			System.out.println("Bike stopped successfully\n");
		}
		
		else
			System.out.println("\nInvalid Input");
	}
	
	public void display() {
		System.out.println("Your Bike Speed is "+speed+" km/h and gear is "+gear);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		vehicle v = null; //vehicle interface reference created
		System.out.println("======================================================");
		int y; //to choose vehicles
		bb: //label for do while loop
			do {
				System.out.print(" Select vehicle \n\t1.Bicycle \n\t2.Car \n\t3.Bike \n\t4.Exit \nChoice: ");
				y = sc.nextInt();
				
				System.out.println("===================================================");
				
				if(y == 1)
					v = new bicycle();
				else if(y == 2)
					v = new car();
				else if(y == 3)
					v = new bike();
				else if(y == 4)
					break bb; //breaking label
				else
					System.out.println("Invalid Input");
				System.out.println("====================================================");
				
				if(0 < y && y < 4) {
					aa: //label for inner do while loop
						do {
							System.out.print("\tPress 1. Speed up \n\tPress 2. Change gear \n\tPress 3. Apply Brakes \n\tPress 4. Display Vehicle Status \n\tPress 5. Change vehicle/Exit \nChoice: ");
							int z = sc.nextInt();
							System.out.println("=============================================");
							
							switch(z) {
							
							case 1:
								v.speed_up();
								System.out.println("===========================================");
								break;
								
							case 2:
								System.out.print("Which gear do you want? ");
								int a = sc.nextInt();
								v.gear_change(a);
								System.out.println("===========================================");
								break;
								
							case 3:
								v.apply_brakes();
								System.out.println("===========================================");
								break;
								
							case 4:
								v.display();
								System.out.println("===========================================");
								break;
								
							case 5:
								break aa; //breaking label
								
							default:
								System.out.println("Invalid Input");
							}
						}while(true);
				}
			}while(y != 4);
	}
}
