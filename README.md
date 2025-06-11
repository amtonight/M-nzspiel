
# Coin Game (Java)

A simple console-based game in Java where a human plays against the computer. The goal of the game is **not** to take the last coin.

## 🧠 Rules

- The game starts with a user-defined number of coins.
- Human and computer take turns removing 1 to 3 coins.
- The player who takes the **last coin loses**.

The computer uses a basic strategy to win: it tries to leave a multiple of 4 coins for the human player after each turn.

## ▶️ How to Run

1. Compile the program:
   ```bash
   javac Muenzspiel.java
   ```

2. Start the game:
   ```bash
   java Muenzspiel
   ```

3. Follow the console instructions and enter 1 to 3 coins when it's your turn.

## 💡 Features

- Console-based interactive game
- Human vs. computer logic
- Basic “winning strategy” implemented using `m % 4`
- Good exercise for learning control flow, methods, input handling, and algorithms in Java

## 🛠️ Technologies

- Java (Standard Library)
- `Scanner` for user input

## 📁 File Overview

- `Muenzspiel.java` – Main class containing the game logic

## ✍️ Author

Samir Aouad – developed as part of a vocational training program in software development.
