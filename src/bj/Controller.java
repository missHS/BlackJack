package bj;

import java.util.ArrayList;
import java.util.Random;

public class Controller {

	private ArrayList<Integer> cardHand = new ArrayList<Integer>();

	public int drawNewCard() {

		int[] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

		Random rand = new Random();

		int randomInt = rand.nextInt(12);

		int card = cards[randomInt];

		return card;
	}

	public void drawPlayerHand() {
		int card = drawNewCard();
		cardHand.add(card);

	}

	public String showPlayerHand() {
		String hand = null;
		for (int temp : cardHand) {
			hand = hand + " " + Integer.toString(temp);
		}

		hand = hand.replace("null ", "");
		return hand;
	}

	public int sumOfCardsPlayerHand() {
		int sum = 0;

		for (int temp : cardHand) {
			sum = sum + temp;
		}

		return sum;
	}

}
