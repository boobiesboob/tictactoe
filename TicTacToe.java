import java.util.Scanner;

public class TicTacToe {

    public static char[][] battlefield = new char[][]{{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
    public static String playerName1 = "";
    public static String playerName2 = "";
    public static int player = 1;
    public static int x;
    public static int y;

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
        System.out.println("Set name for the 1st player: ");
        playerName1 = scn.nextLine();
        System.out.println("Set name for the 2st player: ");
        playerName2 = scn.nextLine();
    }
    public static void printPlayer() {
        System.out.println();
    }

    public static void main(String[] args) {
        drawBattlefield();



        scn.close();
    }
}
