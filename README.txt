For Card.java
I used the 1-4 integers to encode the suit and the 1-13 integers to encode the rank
I made a card with suit s and value r
Created a method to compare cards so that they can be easily sorted
printed card object and used more methods that I needed to get rank of card and suit of the card as a String

For Deck.java
I made a 52 deck and shuffled the deck. Later I dealt the top card in the deck and returned a well ordered 

For Game.java
I used a constructor to setup and make sure all the types of cards are dealt with. The clubs, diamonds, hearts, spades,etc. The King,queen,etc.
Used a no argument constructor to actually play a normal game 
Used method public void play() to play the game. I checked the length of hand, finalized a hand, check, then update bankroll
Once you lose it prints Game over then you can play again if you want to

For Player.java
made the player choose what to do after his hand has been dealt
add the cards to his hand
keep the game going till the player loses or wins