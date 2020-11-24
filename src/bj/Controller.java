package bj;

import java.util.Random;

public class Controller {

	Player player = new Player();
	Dealer dealer = new Dealer();
	Card card = new Card();

	


	public void drawPlayerHand() {		
		player.addPlayerCard(card.drawNewCard());
	}

	public void drawDealerHand() {
	dealer.addDealerCard(card.drawNewCard());
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
