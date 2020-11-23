package bj;

import java.util.Random;

public class Controller {

	public int drawNewCard() {

		int[] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

		Random rand = new Random();

		int randomInt = rand.nextInt(12);

		int card = cards[randomInt];

		return card;
	}
	
	

}
