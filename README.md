# 🎮 Connect 4 Game (Java Console Edition)

A sleek, lightweight, and interactive command-line implementation of the classic **Connect 4** game, built entirely in Java using Object-Oriented Programming (OOP) principles.

---

## 📝 Overview

Connect 4 is a timeless two-player game where strategy is key. Players take turns dropping colored discs into a vertically suspended grid. The objective is simple: be the first to form a horizontal, vertical, or diagonal line of four of your own discs.

This project is perfect for anyone looking to see clean, modular Java logic applied to a classic game loop!

---

## ✨ Features

* **👥 Local Multiplayer:** Classic Player vs. Player (PvP) action on a single machine.
* **🛠️ Robust Move Validation:** Prevents out-of-bounds inputs or trying to drop a disc into an already full column.
* **🔍 Real-Time Win Detection:** Instantly scans the board horizontally, vertically, and diagonally after every single move.
* **📊 Dynamic Board Rendering:** A clean, updating ASCII grid prints right in your terminal after every turn.
* **🤝 Smart Draw Condition:** Automatically recognizes and declares a draw if the board fills up with no winner.

---

## 🕹️ How to Play & Game Rules

1. The game is played on a **6x7 grid**.
2. **Player 1** uses the `X` disc, and **Player 2** uses the `O` disc.
3. On your turn, choose a column (**1 to 7**) to drop your disc.
4. The disc automatically falls to the **lowest available space** in that column.
5. **Winning Condition:** Connect **four (4)** of your discs in a row in any direction:

| Horizontal | Vertical | Diagonal |
| :---: | :---: | :---: |
| `X X X X` | `X`<br>`X`<br>`X`<br>`X` | `X`<br>  `X`<br>    `X`<br>      `X` |

6. If the entire board is filled without any player achieving a 4-in-a-row, the game ends in a **Draw**.

---

## 🛠️ Technologies Used

* **Language:** Java 11+
* **Paradigm:** Object-Oriented Programming (OOP) — separating concerns across clear classes (e.g., `Board`, `Player`, `GameEngine`).
* **Interface:** Command Line Interface (CLI)

---

## 🚀 Getting Started

### Prerequisites
Make sure you have the **Java Development Kit (JDK)** installed on your machine. You can check by running:
```bash
java -version
