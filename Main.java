package cards;

import java.util.*;
class Main {
	public static void main(String[] args) {
		// Creating an object for Deck()
		Deck deck = new Deck();
		Scanner scan = new Scanner(System.in);
		int choice;

		do {
			// Menu for Actions
			System.out.println("\n*** Menu ***");
			System.out.println("1. Print deck.");
			System.out.println("2. Shuffle deck.");
			System.out.println("3. Check if first 2 elements have the same suit.");
			System.out.println("4. Check if first 2 elements have the same value.");
			System.out.println("5. Deal 5 cards.");
			System.out.println("6. Search for a card.");
			System.out.println("7. Identify a random card.");
			System.out.println("0. Exit.");

			System.out.print("Enter your choice: ");
			choice = scan.nextInt();

			switch (choice) {
				case 1:
					// Printing the deck
					System.out.println("******Deck before shuffle******");
					// deck.createDeck(); 
					// not needed anymore as we created a constructor for it in Deck.java file
					deck.printDeck();
					break;
				case 2:
					// Shuffling and Printing the deck
					System.out.println("******Deck after shuffle******");
					deck.shuffleDeck();
					deck.printDeck();
					break;
				case 3:
					// Shuffling again (to randomize the selection) and checking for the 1st 2
					// elements for same suit
					System.out.println("******Checking if 1st & 2nd elements have same Suit******");
					deck.shuffleDeck();
					boolean sameSuit = deck.sameCard();
					System.out.println("Same suit? " + sameSuit);
					break;
				case 4:
					// Shuffling again (to randomize the selection) and checking for the 1st 2
					// elements for same value
					System.out.println("******Checking if 1st & 2nd elements have same Value******");
					deck.shuffleDeck();
					boolean sameValue = deck.compareCard();
					System.out.println("Same value? " + sameValue);
					break;
				case 5:
					// Shuffling the deck again and dealing 5 cards
					System.out.println("******Dealt 5 cards******");
					deck.shuffleDeck();
					deck.dealCard();
					break;
				case 6:
					// Searching for a card with user input
					System.out.println("******Searching for a card with User Input******");
					deck.shuffleDeck();
					deck.findCard();
					break;
				case 7:
					// Selecting a random card from shuffled deck and identifying it
					System.out.println("******Identify Random Card******");
					deck.shuffleDeck();
					deck.identifyCard();
					break;
				case 0:
					System.out.println("Exiting program!");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 0);
	}
}
