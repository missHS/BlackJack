package bj;

import java.util.Random;

public class Controller {
	private final int SCOREFORAI = 16;

	Player player = new Player();
	Dealer dealer = new Dealer();
	Card card = new Card();

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
	public String showPlayerHand() {
		String playerHand = player.getPlayerHand();
		String sumPlayerHand = Integer.toString(player.sumOfCardsPlayerHand());
		return playerHand + " = " + sumPlayerHand;
	}

	public String showDealerHand() {
		String dealerHand = dealer.getDealerHand();
		String sumDealerHand = Integer.toString(dealer.sumOfCardsDealerHand());
		return dealerHand + " = " + sumDealerHand;
	}

//Sumarises the values of the cards in hand
	public int sumOfCardsPlayerHand() {
		int sum = player.sumOfCardsPlayerHand();
		return sum;
	}

	public int sumOfCardsDealerHand() {
		int sum = dealer.sumOfCardsDealerHand();
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

}
