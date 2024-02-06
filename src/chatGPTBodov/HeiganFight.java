package chatGPTBodov;

import java.util.Scanner;

public class HeiganFight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double damagePerTurn = Double.parseDouble(scanner.nextLine());
        double playerHP = 18500;
        double heiganHP = 3000000;
        int playerRow = 7;
        int playerCol = 7;

        boolean isPlayerDead = false;
        boolean isHeiganDefeated = false;
        String lastSpell = "";

        while (true) {
            if (isPlayerDead || isHeiganDefeated) {
                break;
            }

            heiganHP -= damagePerTurn;
            isHeiganDefeated = heiganHP <= 0;

            if (isPlayerInDamageZone(playerRow, playerCol)) {
                if (!tryToMovePlayer(playerRow, playerCol, playerRow - 1, playerCol)) {
                    if (!tryToMovePlayer(playerRow, playerCol, playerRow, playerCol + 1)) {
                        if (!tryToMovePlayer(playerRow, playerCol, playerRow + 1, playerCol)) {
                            if (!tryToMovePlayer(playerRow, playerCol, playerRow, playerCol - 1)) {
                                isPlayerDead = true;
                                break;
                            }
                        }
                    }
                }
            }

            if (isPlayerInDamageZone(playerRow, playerCol)) {
                if (lastSpell.equals("Cloud")) {
                    playerHP -= 3500;
                    isPlayerDead = playerHP <= 0;
                } else if (lastSpell.equals("Eruption")) {
                    playerHP -= 6000;
                    isPlayerDead = playerHP <= 0;
                }
            }

            lastSpell = scanner.next();
            int spellRow = scanner.nextInt();
            int spellCol = scanner.nextInt();
            scanner.nextLine();

            if (isPlayerInDamageZone(spellRow, spellCol)) {
                if (!isPlayerInDamageZone(spellRow - 1, spellCol) && isInsideChamber(spellRow - 1, spellCol)) {
                    playerRow--;
                } else if (!isPlayerInDamageZone(spellRow, spellCol + 1) && isInsideChamber(spellRow, spellCol + 1)) {
                    playerCol++;
                } else if (!isPlayerInDamageZone(spellRow + 1, spellCol) && isInsideChamber(spellRow + 1, spellCol)) {
                    playerRow++;
                } else if (!isPlayerInDamageZone(spellRow, spellCol - 1) && isInsideChamber(spellRow, spellCol - 1)) {
                    playerCol--;
                } else {
                    playerHP -= 6000;
                    isPlayerDead = playerHP <= 0;
                }
            }
        }

        System.out.println(isHeiganDefeated ? "Heigan: Defeated!" : String.format("Heigan: %.2f", heiganHP));
        System.out.println(isPlayerDead ? String.format("Player: Killed by %s", lastSpell) : String.format("Player: %.2f", playerHP));
        System.out.println("Final position: " + playerRow + ", " + playerCol);
    }

    private static boolean isPlayerInDamageZone(int row, int col) {
        return (row >= 0 && row < 15 && col >= 0 && col < 15);
    }

    private static boolean isInsideChamber(int row, int col) {
        return (row >= 0 && row < 15 && col >= 0 && col < 15);
    }

    private static boolean tryToMovePlayer(int currentRow, int currentCol, int newRow, int newCol) {
        if (isInsideChamber(newRow, newCol) && !isPlayerInDamageZone(newRow, newCol)) {
            return true;
        } else {
            return false;
        }
    }
}

