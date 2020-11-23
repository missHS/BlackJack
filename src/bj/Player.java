package bj;

import java.util.ArrayList;

public class Player {
	
	private ArrayList<Integer> playerHand = new ArrayList<Integer>();


	public void addPlayerCard(int card) {
		playerHand.add(card);
	}
	
	public String getPlayerHand() {
		String hand = null;
		for (int temp : playerHand) {
			hand = hand + " " + Integer.toString(temp);
		}

		hand = hand.replace("null ", "");
		return hand;
	}
	
	public int sumOfCardsPlayerHand() {
		int sum = 0;

		for (int temp : playerHand) {
			sum = sum + temp;
		}

		return sum;
	}
}
