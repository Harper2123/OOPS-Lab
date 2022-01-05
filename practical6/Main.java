package practical6;
import java.util.Objects;
import java.util.Scanner;

class Number{
	
	//============================ Array Method ============================//
	
	public static <E> void arr() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:: ");
		int n = sc.nextInt();
		
		Object[] arr = new Object[n];
		
		System.out.print("Enter Array Elements:: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.next();
		}
		
		System.out.print("Entered Array is:: ");
		for(Object element : arr) {
			System.out.printf("'%s'", element);
		}
		
		System.out.println();
	}
	
	//============================ Palindrome Method ============================//
	
	public static <T> void Palindrome(T s) {
		String s1 = (String)s; //converting s into string data type
		s1 = s1.toLowerCase(); //converting into lowercase letter
		StringBuffer sb = new StringBuffer(s1); //creating stringbuffer
		
		String ss = new String(sb.reverse()); //reversing stringbuffer and converting into string
		
		if(Objects.equals(s1, ss))
			System.out.println(s+" is a Palindrome");
		else
			System.out.println(s+" is not a Palindrome");
	}
	
	//============================ Even Odd Method ============================//
	
	public static <T> void evenodd(T a) {
		if((int)a % 2 == 0)
			System.out.println(a+" is Even number");
		else
			System.out.println(a+" is Odd number");
	}
	
	//============================ Prime Method ============================//
	
	public static <T> void prime(T a) {
		
		if((int)a == 1)
			System.out.println(a+" is not Prime Number");
		
		else if((int)a == 2)
			System.out.println(a+" is a Prime Number");
		
		else if((int)a % 2 == 0 && (int)a > 2)
			System.out.println(a+" is not Prime Number");
		
		else {
			double b = Math.sqrt((int)a) + 1;
			int temp = 0;
			
			for(int i=3; i<b; i=i+2) {
				if((int)a % i == 0)
					temp = 1;
			}
			
			if(temp == 1)
				System.out.println(a+" is not Prime Number");
			else
				System.out.println(a+" is Prime Number");
		}
	}
	
	//============================ Check Function Method ============================//
	
	public static <T> void checkfun(T s) {
		
		try {
			int b = Integer.parseInt((String) s);
			System.out.println("We can perform Palindrome, int Array, check Prime, Even Odd function");
		}
		
		catch(NumberFormatException e) {
			System.out.println("We can perform Palindrome, String Array");
		}
	}
}

public class Main {
	
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		
		aa:
			while(true) {
				System.out.println("\n\t====Menu Bar====\n\n\t1.String\n\t2.Integer\n\t3.Integer array\n\t4.String Array\n\t5.Check Function\n\t6.Exit");
				int c = sc.nextInt();
				
				switch(c) {
				
				case 1:
					System.out.print("Enter the string :: ");
					s = sc.next();
					Number.Palindrome(s);
					System.out.println("==========================================");
					break;
					
				case 2:
					System.out.print("Enter the integer :: ");
					s = sc.next();
					Number.Palindrome(s);
					Number.evenodd(Integer.parseInt(s));
					Number.prime(Integer.parseInt(s));
					System.out.println("==========================================");
					break;
					
				case 3:
					
				case 4:
					Number.arr();
					System.out.println("==========================================");
					break;
					
				case 5:
					System.out.print("Enter the string :: ");
					String ss = sc.next();
					Number.checkfun(ss);
					System.out.println("==========================================");
					break;
					
				case 6:
					System.out.println("==========================================");
					break aa;
					
				default:
					System.out.println("Invalid Input");
					System.out.println("==========================================");
				}
			}
	}
}
