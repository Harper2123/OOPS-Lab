package practical1;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		float num1,num2;
		ComplexNumbers cal = new ComplexNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Complex Number in a+bi format: ");
		System.out.print("Enter real part of First Number: a: ");
		num1 = sc.nextFloat();
		System.out.print("Enter imaginary part of First Number: b: ");
		num2 = sc.nextFloat();
		ComplexNumbers Com1 = new ComplexNumbers(num1, num2);
		
		System.out.print("Enter real part of Second Number: a: ");
		num1 = sc.nextFloat();
		System.out.print("Enter imaginary part of Second Number: b: ");
		num2 = sc.nextFloat();
		ComplexNumbers Com2 = new ComplexNumbers(num1, num2);
		sc.close();
		
		System.out.print("\n");
		cal.Display(Com1, Com2);
		System.out.print("\n");
		cal.AddNumbers(Com1, Com2); //adding two complex numbers
		cal.SubNumbers(Com1, Com2); //subtracting two complex numbers
		cal.MultiNumbers(Com1, Com2); //multiplying two complex numbers
		cal.DivNumbers(Com1, Com2); //dividing two complex numbers
		
	}
}
