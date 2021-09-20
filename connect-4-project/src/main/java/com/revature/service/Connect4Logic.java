package com.revature.service;

public class Connect4Logic {

    // Places the corresponding color's character into the specified slot and returns the configuration string
    public static String place(String boardConfig, int slot, char color){
        do {
            slot = slot + 9;                                        // Moves down one position on the board if possible
        } while (boardConfig.charAt(slot) == 'O');
        slot -= 9;
        boardConfig = boardConfig.substring(0, slot) + color + boardConfig.substring(slot + 1);
        return boardConfig;

    }

    // Checks if the given slot is a valid placement for a chip
    public static boolean placeable(String boardConfig, int slot){
        if (slot < 1 || slot > 7)
            return false;
        return boardConfig.charAt(slot + 9) == 'O';
    }

    // Returns a boolean value to tell if the last turn has won the game
    public static boolean winCheck(String boardConfig, int slot){
        do {
            slot = slot + 9;                                        // Moves down one position on the board if possible
        } while (boardConfig.charAt(slot) == 'O');

        char color = boardConfig.charAt(slot);

        if (
            lineCheck(boardConfig, slot, 1, color) ||   // Horizontal
            lineCheck(boardConfig, slot, 10, color) ||  // First diagonal
            lineCheck(boardConfig, slot, 9, color) ||   // Vertical
            lineCheck(boardConfig, slot, 8, color)      // Second diagonal
        )
            return true;
        return false;
    }

    // Checks if any 4 chips of the same color can be found in the given direction at the given position
    public static boolean lineCheck(String boardConfig, int position, int coefficient, char color){
        for (int i = 0; i < 3; i++){
            position += coefficient;                                 // Move one position in the specified direction
            if (boardConfig.charAt(position) != color){
                position -= coefficient * (i + 2);                   // Move to the original position and move backward
                while (i < 3){
                    if (boardConfig.charAt(position) != color)
                        return false;
                    position -= coefficient;
                    i++;
                }
            }
        }
        return true;
    }

}
