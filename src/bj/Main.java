package bj;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		Controller controller = new Controller();
		Scanner input = new Scanner(System.in);
		
		
		controller.drawPlayerHand();
		controller.drawPlayerHand();
		controller.drawDealerHand();
		controller.drawDealerHand();
		
		System.out.println("This is the dealer hand: " + controller.showDealerHand());
		System.out.println("This is your hand: " + controller.showPlayerHand());
		
		
		while(controller.sumOfCardsPlayerHand()<21 && controller.sumOfCardsDealerHand()<21)	{	
		System.out.println("Would you like a new card? Y/N");
		String selection = input.nextLine().toUpperCase();
		
		if (selection.equals("Y")) {
			controller.drawPlayerHand();
			controller.drawDealerHand();
			System.out.println("This is the dealer hand: " + controller.showDealerHand());
			System.out.println("This is your hand: " + controller.showPlayerHand());	
					}
		}
		
		if(controller.sumOfCardsPlayerHand()>21) {
			System.out.println("you loose");
			
		}
		else if(controller.sumOfCardsDealerHand()>21 && controller.sumOfCardsPlayerHand()<21)  {
			System.out.println("you win!");
		}
		
		else if(controller.sumOfCardsPlayerHand()==21) {
			System.out.println("Black Jack");
		}
		
		else if(controller.sumOfCardsPlayerHand()<controller.sumOfCardsDealerHand()) {
			System.out.println("you loose!");
		}
		else if(controller.sumOfCardsDealerHand()<controller.sumOfCardsPlayerHand()) {
			System.out.println("you win!");
		}
			
		else {
			System.out.println("Vad hände nu helene?");
		}
		 
		
		
		
		
	}

}
