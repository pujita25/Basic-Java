package OOPS.Interface;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Go forward");
	}

	@Override
	public void down() {
		System.out.println("Go backwards");
	}

	@Override
	public void left() {
		System.out.println("Go left");
	}

	@Override
	public void right() {
		System.out.println("Go right");
	}

}
