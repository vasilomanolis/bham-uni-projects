
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * A class Chess.java with a single field variable chessBoard of appropriate
 * type which represents a chess board with a public String toString() method
 * which represents the initial board in the form displayed below (and any other
 * board accordingly). Furthermore the class includes an interactive way to play
 * a game of chess where one can enter moves of the type a2a4 from the command
 * line in order to move the figure from a2 to a4 on the chessboard. If the
 * input does not follow the pattern "[a-h][1-8][a-h][1-8]|q" an exception is to
 * be thrown that has then to be caught appropriately. On entering q the program
 * should terminate.
 * 
 * @author Vasileios Manolis
 * @version 28.11.2017
 *
 */
public class Chess {

	private String[][] chessBoard;

	private final String[] start1 = { " ROOK   ", " KNIGHT ", " BISHOP ", " QUEEN  ", " KING   ", " BISHOP ",
			" KNIGHT ", " ROOK   " };
	private final String[] start2 = { " PAWN   ", " PAWN   ", " PAWN   ", " PAWN   ", " PAWN   ", " PAWN   ",
			" PAWN   ", " PAWN   " };
	private final String[] start7 = { " rook   ", " knight ", " bishop ", " queen  ", " king   ", " bishop ",
			" knight ", " rook   " };
	private final String[] start8 = { " pawn   ", " pawn   ", " pawn   ", " pawn   ", " pawn   ", " pawn   ",
			" pawn   ", " pawn   " };

	private final String emptyLine = "   +--------+--------+--------+--------+--------+--------+--------+--------+";

	private final String abc = "         a        b        c        d        e        f        g        h   ";
	private final String emptyCell = "        ";

	public static final Pattern pattern = Pattern.compile("[a-h][1-8][a-h][1-8]|q");

	/**
	 * A constructor of a chess board
	 */
	public Chess() {

		this.chessBoard = new String[8][8];

		for (int rows = 0; rows < chessBoard.length; rows++) {
			for (int columns = 0; columns < chessBoard[rows].length; columns++) {
				chessBoard[rows][columns] = "        ";
			}
		}

		for (int columns = 0; columns < 8; columns++) {
			chessBoard[0][columns] = start7[columns];
		}

		for (int columns = 0; columns < 8; columns++) {
			chessBoard[1][columns] = start8[columns];
		}

		for (int columns = 0; columns < 8; columns++) {
			chessBoard[6][columns] = start2[columns];
		}

		for (int columns = 0; columns < 8; columns++) {
			chessBoard[7][columns] = start1[columns];
		}

	}

	/**
	 * A toString method that print a chess board
	 * 
	 * @return board a chess board
	 */
	public String toString() {

		int lineCounter = 8;
		int rowCounter = 8;
		String board = "";

		board += abc + "\n";

		board += emptyLine + "\n";

		for (int rows = 0; rows < chessBoard.length; rows++) {

			board += rowCounter + "  |";
			rowCounter--;

			for (int columns = 0; columns < chessBoard[rows].length; columns++) {

				if (columns == 7) {
					board += chessBoard[rows][columns] + "|  " + lineCounter;
					lineCounter--;
				} else {
					board += chessBoard[rows][columns] + "|";
				}

			}
			board += "\n" + emptyLine + "\n";

		}

		board += abc;

		return board;

	}

	/**
	 * An interactive way to play a game of chess where one can enter moves of the
	 * type a2a4 from the command line in order to move the figure from a2 to a4 on
	 * the chessboard. If the input does not follow the pattern
	 * "[a-h][1-8][a-h][1-8]|q" an exception is to be thrown that has then to be
	 * caught appropriately.
	 * 
	 * 
	 */
	public void interactiveChess() {

		Chess Chess1 = new Chess();
		System.out.println(Chess1);

		// Create a single shared Scanner for keyboard input

		// Program execution starts here

		// Prompt the user
		System.out.print("Enter your move in the format [a-h][1-8][a-h][1-8] e.g. e2e4 or q to quit:");

		// Create a Scanner
		Scanner scanner = new Scanner(System.in);
		// Read a line of text from the user.
		String input = "";

		// String input = scanner.nextLine();

		while (!input.equals("q")) {

			try {
				input = scanner.next(pattern);

				if (input.equals("q")) {
					break;
				} else {

					String digit1 = input.substring(0, 1);
					String digit2 = input.substring(1, 2);
					String digit3 = input.substring(2, 3);
					String digit4 = input.substring(3, 4);

					switch (digit1) {
					case "a":
						digit1 = "0";
						break;
					case "b":
						digit1 = "1";
						break;
					case "c":
						digit1 = "2";
						break;
					case "d":
						digit1 = "3";
						break;
					case "e":
						digit1 = "4";
						break;
					case "f":
						digit1 = "5";
						break;
					case "g":
						digit1 = "6";
						break;
					case "h":
						digit1 = "7";
						break;

					// default:System.out.println("Not appropriate format!");
					}

					switch (digit3) {
					case "a":
						digit3 = "0";
						break;
					case "b":
						digit3 = "1";
						break;
					case "c":
						digit3 = "2";
						break;
					case "d":
						digit3 = "3";
						break;
					case "e":
						digit3 = "4";
						break;
					case "f":
						digit3 = "5";
						break;
					case "g":
						digit3 = "6";
						break;
					case "h":
						digit3 = "7";
						break;

					// default:System.out.println("Not appropriate format!");
					}

					switch (digit2) {
					case "1":
						digit2 = "7";
						break;
					case "2":
						digit2 = "6";
						break;
					case "3":
						digit2 = "5";
						break;
					case "4":
						digit2 = "4";
						break;
					case "5":
						digit2 = "3";
						break;
					case "6":
						digit2 = "2";
						break;
					case "7":
						digit2 = "1";
						break;
					case "8":
						digit2 = "0";
						break;

					// default:System.out.println("Not appropriate format!");
					}

					switch (digit4) {
					case "1":
						digit4 = "7";
						break;
					case "2":
						digit4 = "6";
						break;
					case "3":
						digit4 = "5";
						break;
					case "4":
						digit4 = "4";
						break;
					case "5":
						digit4 = "3";
						break;
					case "6":
						digit4 = "2";
						break;
					case "7":
						digit4 = "1";
						break;
					case "8":
						digit4 = "0";
						break;

					// default:System.out.println("Not appropriate format!");
					}

					int result1 = Integer.parseInt(digit1);
					int result2 = Integer.parseInt(digit2);
					int result3 = Integer.parseInt(digit3);
					int result4 = Integer.parseInt(digit4);

					chessBoard[result4][result3] = chessBoard[result2][result1];
					chessBoard[result2][result1] = emptyCell;

					// Start: Calling the toString manually
					int lineCounter = 8;
					int rowCounter = 8;
					String board = "";

					board += abc + "\n";

					board += emptyLine + "\n";

					for (int rows = 0; rows < chessBoard.length; rows++) {

						board += rowCounter + "  |";
						rowCounter--;

						for (int columns = 0; columns < chessBoard[rows].length; columns++) {

							if (columns == 7) {
								board += chessBoard[rows][columns] + "|  " + lineCounter;
								lineCounter--;
							} else {
								board += chessBoard[rows][columns] + "|";
							}

						}
						board += "\n" + emptyLine + "\n";

					}

					board += abc;
					System.out.println(board);

					// End: Calling the toString manually

					System.out.print("Enter your move:");

				}
			} catch (InputMismatchException e) {

				System.out.println("Your move was wrong. Plese try again the right format:");

				System.out.print("Enter your move in the format [a-h][1-8][a-h][1-8] e.g. e2e4 or q to quit:");

				// Create a Scanner
				scanner = new Scanner(System.in);

			}
		} // end of game

		System.out.println("End of the game!");
		scanner.close();

		System.exit(0);

	}

	/**
	 * An example
	 * 
	 */
	public static void main(String[] args) {
		Chess Chess1 = new Chess();
		Chess1.interactiveChess();

	}
}
