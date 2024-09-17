# Connect4Game
Introduction
This is a simple Connect 4 game developed in Java. Connect 4 is a two-player game where players take turns dropping discs into a grid. The objective is to be the first to connect four discs in a row, either horizontally, vertically, or diagonally.
===========================================================================================================================================================================
Features
Two-player game mode (Player vs Player).
Console-based interface for simplicity.
Validates each move to ensure no invalid entries.
Checks for game-winning conditions after each move.
Displays the current game board after each turn.
===========================================================================================================================================================================
How to Play
The game starts with an empty 6x7 board.
Player 1 uses the X disc, and Player 2 uses the O disc.
Players take turns choosing a column (1-7) to drop their disc.
The disc will occupy the lowest available space in the selected column.
The first player to connect four discs in a row (horizontally, vertically, or diagonally) wins.
If all spots are filled and no player has four connected discs, the game is a draw.
===========================================================================================================================================================================
Game Rules
Players take turns to drop their discs into one of the seven columns.
The disc will always fall to the lowest available row in the chosen column.
The first player to form a horizontal, vertical, or diagonal line of four discs wins the game.
The game ends in a draw if all columns are filled and no player has achieved a winning connection.
===========================================================================================================================================================================
Technologies Used
Java: The main programming language used for game logic and board rendering.
Object-Oriented Programming (OOP): To structure the game logic using classes and objects.
