package com.bridgelab.deckofcards;

public class Uc3_PlayerSequence {
	
	public void playerCardSequence () {
		int i,j = 1;
		int player = 2;
			for (i = 1; i <= player; i++) {
	            System.out.println("Card" + j++ + " received by player" + i);
	        }
	}

	public static void main(String[] args) {
		

		Uc3_PlayerSequence game = new Uc3_PlayerSequence();
		game.playerCardSequence ();
	}

}
