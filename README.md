# Video Poker Game
## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [How to Run](#how-to-run)
- [Files in the Repository](#files-in-the-repository)
---

## Overview
The Poker game is implemented using the provided templates for classes: `Card`, `Deck`, `Game`, `Player`, and `TestPoker`. The project allows players to bet between 1-5 tokens and win multiples of their bet based on the hand they achieve, following standard poker rules.

### Implementation Highlights
- Two versions of the game are included:
  1. One uses a randomly dealt hand.
  2. The other allows the user to specify the hand through command-line arguments for testing purposes.
- Test class `TestPoker` is included to ensure proper functionality of the game logic.

---

## Features
1. **Betting Mechanism**:
   - Players can bet between 1-5 tokens.
   - Winnings are calculated as a multiple of the bet amount based on the hand achieved.

2. **Hand Evaluation**:
   - Implements poker hand evaluation logic to determine the player's winnings.

3. **Random and Specified Hands**:
   - Supports testing via command-line arguments to specify the player's hand for debugging.

---

## How to Run

1. **Compile the Files**:
   ```bash
   javac *.java
## Run the Game
1. **For a random hand**:
   ```bash
   java Game
2. **For a specified hand (for testing purposes)**:
   ```bash
   java Game <hand>
  Replace <hand> with a space-separated list of card representations.

## Files in the Repository

1. `Card.java`: Represents a playing card.
2. `Deck.java`: Represents a deck of cards and handles shuffling and dealing.
3. `Game.java`: Main game logic.
4. `Player.java`: Represents a player, including their tokens and actions.
5. `TestPoker.java`: Test class for verifying the game logic.

   
