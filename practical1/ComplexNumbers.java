package practical1;
import java.util.*;

public class ComplexNumbers {
	
	float real,img;
	
	public ComplexNumbers() {
		real = 0;
		img = 0;
	}
	
	public ComplexNumbers(float a, float b) {
		real = a;
		img = b;
	}
	
	public void Display(ComplexNumbers C1, ComplexNumbers C2) {
		System.out.println("First Complex Number =("+C1.real+")+("+C1.img+")i");
		System.out.println("Second Complex Number =("+C2.real+")+("+C2.img+")i");
	}
	
	public void AddNumbers(ComplexNumbers C1, ComplexNumbers C2) {
		float real,img;
		real = (C1.real + C2.real);
		img = (C1.img + C2.img);
		System.out.println("Addition of Complex Numbers =("+real+")+("+img+")i");
	}
	
	public void SubNumbers(ComplexNumbers C1, ComplexNumbers C2) {
		float real,img;
		real = (C1.real - C2.real);
		img = (C1.img - C2.img);
		System.out.println("Subtraction of Complex Numbers =("+real+")+("+img+")i");
	}
	
	public void MultiNumbers(ComplexNumbers C1, ComplexNumbers C2) {
		float real,img;
		real = (C1.real * C2.real - C1.img * C2.img);
		img = (C1.real * C2.img + C1.img * C2.real);
		System.out.println("Multiplication of Complex Numbers =("+real+")+("+img+")i");
	}
	
	public void DivNumbers(ComplexNumbers C1, ComplexNumbers C2) {
		float real,img;
		real = (C1.real * C2.real + C1.img * C2.img) / (C2.real * C2.real + C2.img * C2.img);
		img = (C1.img * C2.real - C1.real * C2.img) / (C2.real * C2.real + C2.img * C2.img);
		System.out.println("Division of Complex Numbers =("+real+")+("+img+")i");
	}
}
