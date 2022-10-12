package userinterface;

import javax.swing.JFrame;

public class GameWindow extends JFrame {

	public static final int SCREEN_WIDTH = 600;
	private GameScreen gameScreen;

	public GameWindow() {
		super("Java T-Rex game");
		setSize(SCREEN_WIDTH, 400);
		setLocation(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		gameScreen = new GameScreen();
		addKeyListener(gameScreen);
		add(gameScreen);
	}

	public void startGame() {
		setVisible(true);
		gameScreen.startGame();
	}

	public static void main(String args[]) {
		(new GameWindow()).startGame();
	}
}
