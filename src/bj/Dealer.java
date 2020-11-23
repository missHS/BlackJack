package bj;

import java.util.ArrayList;

public class Dealer {
	
	
	private ArrayList<Integer> dealerHand = new ArrayList<Integer>();
	
	public void addDealerCard(int card) {
		dealerHand.add(card);
	}
	
	public String getDealerHand() {
		String hand = null;
		for (int temp : dealerHand) {
			hand = hand + " " + Integer.toString(temp);
		}
		hand = hand.replace("null ", "");
		return hand;
	}
	
	public int sumOfCardsDealerHand() {
		int sum = 0;

		for (int temp : dealerHand) {
			sum = sum + temp;
		}

		return sum;
	}

}
