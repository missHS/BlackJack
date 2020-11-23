package bj;


import java.util.Random;

public class Controller {

	Player player = new Player();
	Dealer dealer = new Dealer();

	public int drawNewCard() {

		int[] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

		Random rand = new Random();

		int randomInt = rand.nextInt(12);

		int card = cards[randomInt];

		return card;
	}

	public void drawPlayerHand() {
		int card = drawNewCard();
		player.addPlayerCard(card);
	}

	public void drawDealerHand() {
		int card = drawNewCard();
		dealer.addDealerCard(card);
	}

	public String showPlayerHand() {
		String playerHand = player.getPlayerHand();
		String sumPlayerHand = Integer.toString(player.sumOfCardsPlayerHand());
		return playerHand+" = "+sumPlayerHand;
	}

	public String showDealerHand() {
		String dealerHand = dealer.getDealerHand();
		String sumDealerHand = Integer.toString(dealer.sumOfCardsDealerHand());
		return dealerHand+" = " + sumDealerHand;
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
