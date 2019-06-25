import java.util.Scanner;

public class Lab4_ {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	char answer = 'y';
	
	//Takes user integer input, uses three for loops to print the lists of numbers, squares and cubes
	do {
		
		System.out.println("Enter an integer:");
		
		int integer = input.nextInt();
		
		System.out.println("Numbers:");
		
		for(int i = 1; i <= integer; i++) {
			System.out.println(i);
		}
		
		System.out.println("Squares:");
		
		for(int i = 1; i <= integer; i++) {
			System.out.println(i * i);
		}
		
		System.out.println("Cubes:");
		
		for(int i = 1; i <= integer; i++) {
			System.out.println(i * i * i);
		}
		
		System.out.println("Would you like to continue? (y/n)");
		
		answer = input.next().charAt(0);
		
	} while(answer == 'y' || answer == 'Y');
	//Will only continue if user enters y or Y

	input.close();
	
	}

//nearHundred solution
public boolean nearHundred(int n) {
	  if(Math.abs(100-n) <= 10 || Math.abs(200-n) <= 10){
	    return true;}
	  else{
	    return false;}
	  }
}
