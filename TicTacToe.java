import java.util.Scanner;

public class TicTacToe {

    public static char[][] battlefield = new char[][]{{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
    public static String playerName1 = "";
    public static String playerName2 = "";
    public static char stone = '\u0000';
    public static boolean swappedStone = false;
    public static boolean swappedPlayer = false;
    public static int moveCounter = battlefield.length;

    public static void printLogo() {
        System.out.println("_  _  _   TIC");
        System.out.println("_  _  _    TAC");
        System.out.println("_  _  _     TOE");
    }

    static Scanner scn = new Scanner(System.in);

    public static void drawBattlefield() {
        for (int i = 0; i < battlefield.length; i++) {
            for (int j = 0; j < battlefield[i].length; j++) {
                System.out.printf("%3c", battlefield[i][j]);
            }
            System.out.println();
        }
    }

    public static void setPlayerName() {
        System.out.print("Set name for the 1st player: ");
        playerName1 = scn.nextLine();
        System.out.print("Set name for the 2st player: ");
        playerName2 = scn.nextLine();
    }

    public static String swapPlayers() {
        String name = (swappedPlayer == false) ? playerName1 : playerName2;
        swappedPlayer = !swappedPlayer;
        return name;
    }

    public static char swapStone() {
        stone = (swappedStone == false) ? 'X' : 'O';
        swappedStone = !swappedStone;
        return stone;
    }

    public static boolean isFieldOccupied(int x, int y) {
        return (battlefield[x][y] != '_') ? false : true;
    }

    public static void readMove() {
        System.out.print("your turn, " + swapPlayers() + "\n");
        do {
            System.out.print("print line number: ");
            int x = scn.nextInt();
            System.out.print("print column number: ");
            int y = scn.nextInt();
            battlefield[x - 1][y - 1] = swapStone();

            moveCounter--;
        } while (moveCounter > 0);

    }

    public static void printPlayer() {
        System.out.println();
    }

    public static void main(String[] args) {
        printLogo();
        setPlayerName();
        readMove();
        drawBattlefield();
        scn.close();
    }
}
