package cards;
import java.util.*;

public class Card {
	// Creating an encapulsated class

	private String suit;
	private String value;

	public Card(String suit, String value) {
		// Constructor: a method of the same class which initializes when the object is
		// created
		this.suit = suit;
		this.value = value;
	}

	// Getter and setters for Suit and Value
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	// this returns the value and suit
	public String toString() {
		return "\n" + value + " of " + suit;
	}

}