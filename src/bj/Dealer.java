package bj;

import java.util.ArrayList;

public class Dealer {
	
	
	private ArrayList<Card> dealerHand = new ArrayList<Card>();
	
	public void addDealerCard(Card card) {
		dealerHand.add(card);
	}
	
	public String getDealerHand() {
		String hand = null;
		for (Card temp : dealerHand) {
			hand = hand + " " + temp.getName();
		}
		hand = hand.replace("null ", "");
		return hand;
	}
	
	public int sumOfCardsDealerHand() {
		int sum = 0;

		for (Card temp : dealerHand) {
			sum = sum + temp.getValue();
		}

		return sum;
	}

}
