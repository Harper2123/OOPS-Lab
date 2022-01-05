package practical5;
import java.util.Scanner;

class MyException{
	
	void arithmeticException() {
		
		Scanner sc = new Scanner(System.in);
		boolean valid;
		valid = false;
		while(!valid) {
			
			try {
				System.out.println("Enter two Numbers :: ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				double c = num1 / num2;
				System.out.println("Division is "+c);
				valid = true;
			}
			catch(Exception e) {
				
				System.out.println("\t\tCannot Divide by Zero \n\t\tEnter valid Denominator...\n");
			}
		}
	}
	
	void arrayOutOfBound(int [] arr) {
		
		Scanner sc = new Scanner(System.in);
		boolean valid;
		valid = false;
		while(!valid) {
			
			try {
				System.out.print("\nEnter the Index No. of Element which you want to print ::");
				int i = sc.nextInt();
				System.out.println(arr[i]+" is present at given index");
				valid = true;
			}
			catch(Exception e) {
				
				System.out.println("Invalid Index!! Try Again..\n");
			}
		}
	}
	
	void numberFormat() {
		
		Scanner sc = new Scanner(System.in);
		boolean valid;
		valid = false;
		while(!valid) {
			
			try {
				System.out.print("Enter first number:: ");
				String num1 = sc.next();
				System.out.print("Enter second number:: ");
				String num2 = sc.next();
				int a = Integer.parseInt(num1);
				int b = Integer.parseInt(num2);
				System.out.println("\nEntered Numbers are integers::"+a+" , "+b);
				valid = true;
			}
			catch(Exception e) {
				
				System.out.println("Entered Numbers are not integers \n\t Please Try Again\n");
			}
		}
	}
}

public class Main {
	
	public static void main(String[] args) {
		
		MyException e = new MyException();
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			
			System.out.println("\nEnter the exception to check for\n\t1.Arithmetic Exception\t\t2.Array Out of Bounds\n\t3.Number Format\t\t4.Exit");
			n = sc.nextInt();
			
			switch(n) {
			
			case 1:
				e.arithmeticException();
				System.out.println("=======================================================");
				break;
				
			case 2:
				int[] arr = {1,2,3,5,3,11,21};
				e.arrayOutOfBound(arr);
				System.out.println("=======================================================");
				break;
				
			case 3:
				e.numberFormat();
				System.out.println("=======================================================");
				break;
				
			case 4:
				n = 0;
				System.out.println("=======================================================");
				break;
				
			default:
				System.out.println("Invalid Input!!");
				System.out.println("=======================================================");
			}
		}while(n != 0);
	}
}
