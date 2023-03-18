package OOPS.Interface;

public class GamingRunner {

	public static void main(String[] args) {
		GamingConsole game = new ChessGame();
		game.down();
		game.up();
		game.left();
		game.right();

	}

}
