package bj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Controller controller = new Controller();
		Scanner input = new Scanner(System.in);

		// Starts game by drawing cards and displaying them
		controller.drawPlayerHand();
		controller.drawPlayerHand();
		controller.drawDealerHand();
		controller.drawDealerHand();

		System.out.println("This is your hand: " + controller.showPlayerHand());
		System.out.println("This is the dealer hand: " + controller.showDealerHand());		

		// As long as no one has 21 or more, the game continues
		while (controller.sumOfCardsPlayerHand() < 21 && controller.sumOfCardsDealerHand() < 21) {
			System.out.println("Would you like a new card? Y/N");
			System.out.println("\b2660");
			System.out.println("\u0004");
			String selection = input.nextLine().toUpperCase();

			if (selection.equals("Y")) {
				controller.drawPlayerHand();
				System.out.println("This is your hand: " + controller.showPlayerHand());
				boolean dealerChoice = controller.dealerAI(controller.sumOfCardsDealerHand());
				// Checks whether dealer draws new card or not
				if (dealerChoice == false) {
					controller.drawDealerHand();
					System.out.println("This is the dealer hand: " + controller.showDealerHand());
				} else if (dealerChoice == true) {
					System.out.println("The dealer does not take a new card");
					System.out.println("This is the dealer hand: " + controller.showDealerHand());
				}

			} else if (selection.equals("N")) {
				boolean dealerChoice = controller.dealerAI(controller.sumOfCardsDealerHand());
				// Checks whether dealer draws new card or not
				if (dealerChoice == false) {
					controller.drawDealerHand();
					System.out.println("This is your hand: " + controller.showPlayerHand());
					System.out.println("This is the dealer hand: " + controller.showDealerHand());
					
				} else if (dealerChoice == true) {
					System.out.println("The dealer does not take a new card");
					System.out.println("This is your hand: " + controller.showPlayerHand());
					System.out.println("This is the dealer hand: " + controller.showDealerHand());
					
					// No one takes any more cards although 21 is not reached = the game ends
					break;
				}
			} else {
				System.out.println("Would you like a new card? Y/N");
			}
		}

		if (controller.sumOfCardsPlayerHand() > 21) {
			System.out.println("You loose..");
		} else if (controller.sumOfCardsDealerHand() > 21 && controller.sumOfCardsPlayerHand() < 21) {
			System.out.println("You win!");
		} else if (controller.sumOfCardsPlayerHand() == 21) {
			System.out.println("Black Jack!");
		} else if (controller.sumOfCardsPlayerHand() < controller.sumOfCardsDealerHand()) {
			System.out.println("You loose..");
		} else if (controller.sumOfCardsDealerHand() < controller.sumOfCardsPlayerHand()) {
			System.out.println("You win!");
		}

		input.close();
	}

}
