package bj;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		Controller controller = new Controller();
		Scanner input = new Scanner(System.in);
		
		
		controller.drawPlayerHand();
		controller.drawPlayerHand();
		
		System.out.println(controller.showPlayerHand());
		
		while(controller.sumOfCardsPlayerHand()<21)	{	
		System.out.println("Would you like a new card? Y/N");
		String selection = input.nextLine().toUpperCase();
		
		if (selection.equals("Y")) {
			controller.drawPlayerHand();
			System.out.println(controller.showPlayerHand());			
		}
		}
		
		 
		
		
		
		
	}

}
