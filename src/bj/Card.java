package bj;

import java.util.HashMap;
import java.util.Map;

public class Card {

	private String name;
	private int value;
	private Map<String, Card> deckOfCards = new HashMap<String, Card>();

	//Method to return false or true if card is added or if it's a duplicate
	public boolean addCardToDeck(Card card) {
		if (deckOfCards.containsKey(card.getName())) {
			return false;
		} else {
			deckOfCards.put(card.getName(), card);
			return true;
		}
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
