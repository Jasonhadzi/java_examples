import java.util.Scanner;

public class Main {

	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 50;
		int helpingnumber =50;
		
		boolean quit = false;
		
		System.out.println("Guess a number from 1-100");
		
		while(!quit) {
			
		
		System.out.println("Is it bigger (0) than " + number +" or smaller (1)?");
		System.out.println("Helping number: " + helpingnumber);
		System.out.println("\nEnter action, if we found it press 2");
		int action = scanner.nextInt();
		scanner.nextLine();
		

	if(action == 0) {
			
		 helpingnumber /=  2;
		if(helpingnumber == 0) {
			
			helpingnumber = 1;
			
		}
		number =  number + helpingnumber;
			
			
		} 
	
	else if(action == 1) {
			
		helpingnumber /=  2;
		if(helpingnumber == 0) {
			
			helpingnumber = 1;
			
		}
		number =  number - helpingnumber;
		} 
	
	else if (action == 2) {
			
			quit = true;
		}
		
	}
	
	
	
	}
	
	
	
	
	

}
