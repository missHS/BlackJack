package bj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CardRegister {

	private Map<String, Card> deckOfCards = new HashMap<String, Card>();
	private ArrayList<Card> playerHand = new ArrayList<Card>();
	private ArrayList<Card> dealerHand = new ArrayList<Card>();

	// Method to return false or true if card is added or if it's a duplicate
	public boolean addCardToDeck(Card card) {
		if (deckOfCards.containsKey(card.getId())) {
			return false;
		} else {
			deckOfCards.put(card.getId(), card);
			iterate();
			return true;
		}
	}
	
	public String iterate() {
		String key=null;
		for (Map.Entry<String, Card> entry : deckOfCards.entrySet()) {
		    key = key + entry.getKey();
		   		}
		return key;
	}

	public void addDealerCard(Card card) {
		dealerHand.add(card);
	}

	public Card getDealerHand(int card) {
		Card dealerCard = dealerHand.get(card);
		return dealerCard;
	}

	public int sumOfCardsDealerHand() {
		int sum = 0;
		for (Card temp : dealerHand) {
			sum = sum + temp.getValue();
		}
		return sum;
	}
	
	public boolean checkForAceDealer() {
		for (Card temp : dealerHand) {
			if (temp.getName().equals("A")) {
				return true;			}
		}
		return false;
	}
	
	public boolean checkForAcePlayer() {
		for (Card temp : playerHand) {
			if (temp.getName().equals("A")) {
				return true;			}
		}
		return false;
	}

	public void addPlayerCard(Card card) {
		playerHand.add(card);
	}

	public Card getPlayerHand(int card) {

		Card playerCard = playerHand.get(card);
		return playerCard;

	}

	public int sumOfCardsPlayerHand() {
		int sum = 0;

		for (Card temp : playerHand) {
			sum = sum + temp.getValue();

		}
		return sum;
	}

}
