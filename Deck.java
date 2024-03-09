package cards;
import java.util.*;
import java.io.*;

class Deck {
	ArrayList<Card> cards = new ArrayList<Card>();

	// Constructor for creating a deck
	// this constructor has to have the same name as the class
	public Deck() {
		createDeck();
	}
	// This will create the deck everytime the object deck is created, without
	// explicitly writing it

	// To create the Deck
	public void createDeck() {
		String[] values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] suit = { "Spades", "Diamonds", "Clubs", "Hearts" };

		for (String s : suit) {
			for (String v : values) {
				cards.add(new Card(s, v));
			}
		}
	}

	// To randomize the deck
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}

	// To print the deck
	public void printDeck() {
		for (Card card : cards) {
			System.out.println(card);
		}
	}

	// sameCard(): If the cards drawn belong to the same suit or not. (true or
	// false)
	// compareCard(): If the cards have the same value
	// dealCard(): Randomly deal 5 cards after shuffling
	// findCard(): We enter suit and value and if match, return index, we have to
	// output the index of this card from the shuffled deck
	// identifyCard(): Select random card and tell if its a face or a number card.

	// sameCard()
	public boolean sameCard() {
		System.out.println(cards.get(0));
		System.out.println(cards.get(1));
		if (cards.get(0).getSuit().equals(cards.get(1).getSuit())) {
			return true;
		} else {
			return false;
		}
	}

	// compareCard()
	public boolean compareCard() {
		System.out.println(cards.get(0));
		System.out.println(cards.get(1));
		if (cards.get(0).getValue().equals(cards.get(1).getValue())) {
			return true;
		} else {
			return false;
		}
	}

	// dealCard()
	public void dealCard() {
		for (int i = 0; i < 5; i++) {
			System.out.println(cards.get(i));
		}
	}

	// findCard()
	public void findCard() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Suit:");
		String s = scan.nextLine();
		System.out.println("Enter the Value:");
		String v = scan.nextLine();

		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i).getSuit().equals(s) && cards.get(i).getValue().equals(v)) {
				System.out.println("Found Match!!");
				System.out.println("At index: " + i);
				return; // Exit the method after finding the first match
			}
		}
		System.out.println("No Match Found :(");
	}

	// identifyCard()
	public void identifyCard() {
		String rand_val = cards.get(0).getValue();
		if (rand_val.equals("A") || rand_val.equals("J") || rand_val.equals("Q") || rand_val.equals("K")) {
			System.out.println("The random card is a Face Card.");
			System.out.println(cards.get(0));
		} else {
			System.out.println("The random card is a Number Card.");
			System.out.println(cards.get(0));
		}
	}

}