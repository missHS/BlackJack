package bj;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.border.LineBorder;

public class Controller {
	private final int SCOREFORAI = 16;
	private int counter = 0;
	private int playerScore;
	private int playerScore2;
	private int dealerScore;
	private int dealerScore2;

	CardRegister cardRegister = new CardRegister();
	BJFrame frame = new BJFrame();

	public Controller(BJFrame frame, CardRegister cardRegister) {

		this.frame = frame;
		this.cardRegister = cardRegister;
		eventHandlers();
	}

	// Method to generate a random card and store it in card deck if not duplicate
	public Card drawNewCard() {
		Random rand = new Random();
		boolean cardValidation = false;

		// Array of symbols = Spades, Diamonds, Hearts, Clubs
		String[] types = { "\u2660", "\u2666", "\u2665", "\u2663" };

		while (cardValidation == false) {
			Card randomCard = new Card();
			int randomType = rand.nextInt(4);
			String type = types[randomType];
			int cardNumber = rand.nextInt(12) + 1;
			String name = null;
			String id = null;

			if (cardNumber == 11) {
				name = "J";
				cardNumber = 10;

				id = name + type;

			} else if (cardNumber == 12) {
				name = "Q";
				cardNumber = 10;

				id = name + type;
			} else if (cardNumber == 13) {
				name = "K";
				cardNumber = 10;

				id = name + type;
			} else if (cardNumber == 1) {
				name = "A";
				cardNumber = 11;
				id = name + type;
			} else {
				name = Integer.toString(cardNumber);
				id = name + type;
			}

			randomCard.setName(name);
			randomCard.setValue(cardNumber);
			randomCard.setType(type);
			randomCard.setId(id);

			cardValidation = cardRegister.addCardToDeck(randomCard);

			if (cardValidation == true) {
				return randomCard;
			}
		}
		return null;
	}

	public void drawPlayerCard() {
		cardRegister.addPlayerCard(drawNewCard());
	}

	public void drawDealerCard() {
		cardRegister.addDealerCard(drawNewCard());
	}

	public void showPlayerHand(int counter) {
		cardRegister.getPlayerHand(counter);
	}

//Method to determinate if the dealer will draw a new card or not. True = no, False = yes
	public int dealerAI(int score) {
		int sum = score;
		if (score > 21 && cardRegister.checkForAceDealer() == true) {
			sum = cardRegister.sumOfCardsDealerHand() - 10;
		}
		return sum;
	}

	public void resetGame() {
		frame.getP1Card1().setVisible(false);
		frame.getP1Card2().setVisible(false);
		frame.getP1Card3().setVisible(false);
		frame.getP1Card4().setVisible(false);
		frame.getP1Card5().setVisible(false);

		frame.getdCard1().setVisible(false);
		frame.getdCard2().setVisible(false);
		frame.getdCard3().setVisible(false);
		frame.getdCard4().setVisible(false);
		frame.getdCard5().setVisible(false);
		frame.getdType2().setVisible(false);
		frame.getdValue2().setVisible(false);

		cardRegister.resetCards();
		frame.getScoreBoardTextD().setText("");
		frame.getScoreBoardTextP().setText("");
		frame.getMessageText().setText("");

	}

	public void scoreTrackerDealer() {

		if (cardRegister.checkForAceDealer() == false) {
			dealerScore = cardRegister.sumOfCardsDealerHand();
			frame.getScoreBoardTextD().setText("Dealer score: " + dealerScore);
		} else if (cardRegister.checkForAceDealer() == true) {
			if (cardRegister.sumOfCardsDealerHand() > 21) {
				dealerScore = cardRegister.sumOfCardsDealerHand() - 10;
				frame.getScoreBoardTextD().setText("Dealer score: " + dealerScore);
			} else if (cardRegister.sumOfCardsDealerHand() == 21) {
				dealerScore = cardRegister.sumOfCardsDealerHand();
				frame.getScoreBoardTextD().setText("Dealer score: " + dealerScore);
			} else {
				dealerScore = cardRegister.sumOfCardsDealerHand();
				dealerScore2 = cardRegister.sumOfCardsDealerHand() - 10;
				frame.getScoreBoardTextD().setText("Dealer score: " + dealerScore + " / " + dealerScore2);
			}
		}
	}

	public void scoreTrackerPlayer() {
		if (cardRegister.checkForAcePlayer() == false) {
			playerScore = cardRegister.sumOfCardsPlayerHand();
			frame.getScoreBoardTextP().setText("Your score: " + playerScore);

		} else if (cardRegister.checkForAcePlayer() == true) {
			if (cardRegister.sumOfCardsPlayerHand() > 21) {
				playerScore = cardRegister.sumOfCardsPlayerHand() - 10;
				frame.getScoreBoardTextP().setText("Your score: " + playerScore);
			}

			else if (cardRegister.sumOfCardsPlayerHand() == 21) {
				playerScore = cardRegister.sumOfCardsPlayerHand();
				frame.getScoreBoardTextP().setText("Player score: " + playerScore);
			}

			else {
				playerScore = cardRegister.sumOfCardsPlayerHand();
				playerScore2 = cardRegister.sumOfCardsPlayerHand() - 10;
				frame.getScoreBoardTextP().setText("Your score: " + playerScore + " / " + playerScore2);
			}
		}
	}

	public void checkWinner() {
		if (cardRegister.sumOfCardsPlayerHand() > 21) {
			frame.getMessageText().setText("You loose..");

		} else if (cardRegister.sumOfCardsDealerHand() > 21 && cardRegister.sumOfCardsPlayerHand() <=21) {
			frame.getMessageText().setText("You win!!");

		} else if (cardRegister.sumOfCardsDealerHand() > 21 && cardRegister.sumOfCardsPlayerHand() <=21) {
			frame.getMessageText().setText("You win!!");

		}else if ((cardRegister.sumOfCardsPlayerHand() > cardRegister.sumOfCardsDealerHand()&&  cardRegister.sumOfCardsPlayerHand()<=21)) {
			frame.getMessageText().setText("You win!!");

		} else if (cardRegister.sumOfCardsDealerHand() == cardRegister.sumOfCardsPlayerHand()) {
			frame.getMessageText().setText("It's a draw");
		}
		else {
			frame.getMessageText().setText("Vad h�nde nu Helene?");
		}

	}

	public void playerTurn() {
		if (counter == 0) {
			frame.getP1Type1().setText(cardRegister.getPlayerHand(counter).getType());
			frame.getP1Value1().setText(cardRegister.getPlayerHand(counter).getName());
			frame.getdType1().setText(cardRegister.getDealerHand(counter).getType());
			frame.getdValue1().setText(cardRegister.getDealerHand(counter).getName());
			counter++; // c1
			frame.getP1Type2().setText(cardRegister.getPlayerHand(counter).getType());
			frame.getP1Value2().setText(cardRegister.getPlayerHand(counter).getName());
			counter++; // c2
			frame.getP1Card1().setVisible(true);
			frame.getP1Card2().setVisible(true);
			frame.getdCard1().setVisible(true);
			frame.getdCard2().setVisible(true);
			frame.getdCard2().setBackground(new Color(128, 0, 0));
			if (cardRegister.sumOfCardsPlayerHand() > 21 && cardRegister.checkForAcePlayer() == false) {
				checkWinner();
			} else if (cardRegister.sumOfCardsPlayerHand() > 21 && cardRegister.checkForAcePlayer() == true) {
				int sum = cardRegister.sumOfCardsPlayerHand() - 10;
				if (sum >= 21) {
					checkWinner();
				}

			}
		} else if (counter == 2) {
			frame.getP1Type3().setText(cardRegister.getPlayerHand(counter).getType());
			frame.getP1Value3().setText(cardRegister.getPlayerHand(counter).getName());
			frame.getP1Card3().setVisible(true);
			counter++;// c3
			if (cardRegister.sumOfCardsPlayerHand() > 21 && cardRegister.checkForAcePlayer() == false) {
				checkWinner();
			} else if (cardRegister.sumOfCardsPlayerHand() > 21 && cardRegister.checkForAcePlayer() == true) {
				int sum = cardRegister.sumOfCardsPlayerHand() - 10;
				if (sum > 21) {
					checkWinner();
				}

			}
		} else if (counter == 3) {
			frame.getP1Type4().setText(cardRegister.getPlayerHand(counter).getType());
			frame.getP1Value4().setText(cardRegister.getPlayerHand(counter).getName());
			frame.getP1Card4().setVisible(true);
			counter++;
			if (cardRegister.sumOfCardsPlayerHand() > 21 && cardRegister.checkForAcePlayer() == false) {
				checkWinner();
			} else if (cardRegister.sumOfCardsPlayerHand() > 21 && cardRegister.checkForAcePlayer() == true) {
				int sum = cardRegister.sumOfCardsPlayerHand() - 10;
				if (sum > 21) {

					checkWinner();
				}

			}
		} else if (counter == 4) {
			frame.getP1Type5().setText(cardRegister.getPlayerHand(counter).getType());
			frame.getP1Value5().setText(cardRegister.getPlayerHand(counter).getName());
			frame.getP1Card5().setVisible(true);
			counter++;
			checkWinner();

		}
		scoreTrackerPlayer();
	}

	public void dealerTurn() {
		counter = 1;
		frame.getdCard2().setBackground(new Color(255, 255, 255));
		frame.getdType2().setText(cardRegister.getDealerHand(counter).getType());
		frame.getdValue2().setText(cardRegister.getDealerHand(counter).getName());
		frame.getdType2().setVisible(true);
		frame.getdValue2().setVisible(true);
		counter++;
		scoreTrackerDealer();
		checkWinner();

		while (dealerAI(cardRegister.sumOfCardsDealerHand()) < 17) {
			if (counter == 2) {
				drawDealerCard();
				frame.getdType3().setText(cardRegister.getDealerHand(counter).getType());
				frame.getdValue3().setText(cardRegister.getDealerHand(counter).getName());
				frame.getdCard3().setVisible(true);
				counter++;
				checkWinner();
			} else if (counter == 3) {
				drawDealerCard();
				frame.getdType4().setText(cardRegister.getDealerHand(counter).getType());
				frame.getdValue4().setText(cardRegister.getDealerHand(counter).getName());
				frame.getdCard4().setVisible(true);
				counter++;
				checkWinner();

			} else if (counter == 4) {
				drawDealerCard();
				frame.getdType5().setText(cardRegister.getDealerHand(counter).getType());
				frame.getdValue5().setText(cardRegister.getDealerHand(counter).getName());
				frame.getdCard5().setVisible(true);
				counter++;
				checkWinner();

			}
		}
		scoreTrackerDealer();
	}

	public void eventHandlers() {

		frame.getBtnStartNewGame().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				resetGame();
				counter = 0;
				drawPlayerCard();
				drawPlayerCard();
				drawDealerCard();
				drawDealerCard();
				playerTurn();
			}
		});

		frame.getBtnHit().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				drawPlayerCard();
				playerTurn();
			}
		});

		frame.getBtnStop().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dealerTurn();
			}
		});

	}

}
