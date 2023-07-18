package power_with_modules;
/*
 * You are given A, B and C .
Calculate the value of (A ^ B) % C

	Input 1:
	
	A = 2 B = 3 C = 3
	
	Input 2:
	
	A = 5 B = 2 C = 4
	
	Example Output
	
	Output 1: 2
	
	Output 2: 1
 */

import java.util.Scanner;

public class Power_With_Modules {
	

	private static void power_with_modules(int a, int b, int c) {
		
		a=a%c;
		int result=1;
		for(int i=1;i<=b;i++)
		{
			result=(result*a)%c;
		}
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		power_with_modules(a,b,c);

	}


}
