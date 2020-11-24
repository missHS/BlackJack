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
			/*deckOfCards.entrySet().forEach(entry -> {
				System.out.println(entry.getKey());
			});*/
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
