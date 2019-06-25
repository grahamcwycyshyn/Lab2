import java.util.Scanner;

public class Lab2 {
public static void main(String[] args) {
	
	System.out.println("Welcome to Grand Circus' Room Detail Generator!");
	
	char answer = 'y';
		
	Scanner input = new Scanner(System.in);
	
	//defines length, width and height; performs calculations while answer = y
	do{System.out.println("Enter Length:");
		
		double length = input.nextDouble();
		
		System.out.println("Enter Width:");
		
		double width = input.nextDouble();
		
		System.out.println("Enter Height:");
		
		double height = input.nextDouble();
		
		System.out.println("Area: " + length * width);
		
		System.out.println("Perimiter: " + 2 * (length + width));
		
		System.out.println("Volume: " + length * width * height);
		
		System.out.println("Continue? (y/n):");
		
		answer = input.next().charAt(0);}
		
		while(answer == 'y' || answer == 'Y');
	}
}


