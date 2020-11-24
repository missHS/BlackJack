package bj;

import java.util.ArrayList;

public class Player {

	private ArrayList<Card> playerHand = new ArrayList<Card>();

	public void addPlayerCard(Card card) {
		playerHand.add(card);
	}

	public String getPlayerHand() {
		String hand = null;
		for (Card temp : playerHand) {
			hand = hand + " " + temp.getName() + ", ";
		}
		hand = hand.replace("null ", "");
		return hand;
	}

	public int sumOfCardsPlayerHand() {
		int sum = 0;
		for (Card temp : playerHand) {
			sum = sum + temp.getValue();
		}
		return sum;
	}
}
