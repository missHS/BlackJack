package bj;

import java.util.Random;

public class Controller {
	Player player = new Player();
	Dealer dealer = new Dealer();
	Card card = new Card();

	public Card drawNewCard() {
		Random rand = new Random();
		boolean cardValidation = false;	

		String[] types = { "Hearts", "Clubs", "Spades", "Dimonds" };

		while (cardValidation == false) {
			Card randomCard = new Card();
			int randomType = rand.nextInt(3);
			String type = types[randomType];
			int cardNumber = rand.nextInt(12) + 1;
			String name = null;

			if (cardNumber == 11) {
				name = "Jack of " + type;
				cardNumber = 10;
			} else if (cardNumber == 12) {
				name = "Queen of " + type;
				cardNumber = 10;
			} else if (cardNumber == 13) {
				name = "King of " + type;
				cardNumber = 10;
			} else if (cardNumber == 1) {
				name = "Ace of " + type;
			} else {
				name = Integer.toString(cardNumber) + " of " + type;
			}
			randomCard.setName(name);
			randomCard.setValue(cardNumber);

			cardValidation = card.addCardToDeck(randomCard);

			if (cardValidation == true) {
				return randomCard;			}
		}
		return null;
		}

	public void drawPlayerHand() {		
		
		player.addPlayerCard(drawNewCard());
	}

	public void drawDealerHand() {		
	dealer.addDealerCard(drawNewCard());
	 }

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

	public int sumOfCardsPlayerHand() {
		int sum = player.sumOfCardsPlayerHand();
		return sum;
	}

	public int sumOfCardsDealerHand() {
		int sum = dealer.sumOfCardsDealerHand();
		return sum;
	}

}
