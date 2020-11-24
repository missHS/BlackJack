package bj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Card {

	private String name;
	private int value;

	private Map<String, Card> deckOfCards = new HashMap<String, Card>();

	public Card(String name, int value) {
		this.value = value;
		this.name = name;

	}
	
	public Card() {
			}

	public boolean addCardToDeck(Card card) {
		if (deckOfCards.containsKey(card.getName())) {
			return false;
		} else {
			deckOfCards.put(card.getName(), card);
		deckOfCards.entrySet().forEach(entry->{
			System.out.println(entry.getKey());
		});		
			return true;
		}

	}
	
	public Card drawNewCard() {
		Random rand = new Random();
		boolean test = false;

		String[] types = { "Hearts", "Clubs", "Spades", "Dimonds" };

		while (test == false) {
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
			Card card = new Card(name, cardNumber);


			test = card.addCardToDeck(card);

			if (test == true) {
				return card;
			}
		}

		return null;

	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
