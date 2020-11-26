package bj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class OldContoller {
	
	private final int SCOREFORAI = 16;

	Player player = new Player();
	Dealer dealer = new Dealer();
	Card card = new Card();
	BJFrame frame = new BJFrame();
	


	// Method to generate a random card and store it in card deck if not duplicate
	public Card drawNewCard() {
		Random rand = new Random();
		boolean cardValidation = false;

		String[] types = { "Hearts", "Clubs", "Spades", "Dimonds" };

		while (cardValidation == false) {
			Card randomCard = new Card();
			int randomType = rand.nextInt(3);
			String type = types[randomType];
			int cardNumber = rand.nextInt(12) + 1;
			int secondCardNumber = cardNumber;
			String name = null;

			if (cardNumber == 11) {
				name = "Jack of " + type;
				cardNumber = 10;
				secondCardNumber = cardNumber;
			} else if (cardNumber == 12) {
				name = "Queen of " + type;
				cardNumber = 10;
				secondCardNumber = cardNumber;
			} else if (cardNumber == 13) {
				name = "King of " + type;
				cardNumber = 10;
				secondCardNumber = cardNumber;
			} else if (cardNumber == 1) {
				name = "Ace of " + type;
				secondCardNumber = 11;
			} else {
				name = Integer.toString(cardNumber) + " of " + type;
			}
			
			randomCard.setName(name);
			randomCard.setValue(cardNumber);
			randomCard.setSecondValue(secondCardNumber);
			randomCard.setType(type);

			cardValidation = card.addCardToDeck(randomCard);

			if (cardValidation == true) {
				return randomCard;
			}
		}
		return null;
	}

	// Methods to draw player and dealer cards and store them in each hand
	public void drawPlayerHand() {
		player.addPlayerCard(drawNewCard());
	}

	public void drawDealerHand() {
		dealer.addDealerCard(drawNewCard());
	}

//Method to display the current cards in hand 
	public String showPlayerHand(int round) {
		
		String playerHand = player.getPlayerHand();
		String sumPlayerHand = Integer.toString(player.sumOfCardsPlayerHand(option));
		return playerHand + " = " + sumPlayerHand;
	}

	public String showDealerHand(boolean option) {
		String dealerHand = dealer.getDealerHand();
		String sumDealerHand = Integer.toString(dealer.sumOfCardsDealerHand(option));
		return dealerHand + " = " + sumDealerHand;
	}

//Summarizes the values of the cards in hand
	public int sumOfCardsPlayerHand(boolean option) {
		int sum = player.sumOfCardsPlayerHand(option);
		return sum;
	}

	public int sumOfCardsDealerHand(boolean option) {
		int sum = dealer.sumOfCardsDealerHand(option);
		return sum;
	}

//Method to determinate if the dealer will draw a new card or not. True = no, False = yes
	public boolean dealerAI(int score) {
		if (score >= 17) {
			return true;
		}
		return false;
	}
	
	public String typeSymbol(String type) {
		if(type.equals("Spades")){
			return "\u2660";
		}
		else if(type.equals("Dimonds")){
			return "\u2666";
		}
		else if(type.equals("Hearts")){
			return "\u2665";
		}
		else if(type.equals("Clubs")){
			return "\u2663";
		}
		return null;		
		
	}
	
	public void eventHandlers() {
		
		frame.getBtnStartNewGame().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});
		
	}

}
