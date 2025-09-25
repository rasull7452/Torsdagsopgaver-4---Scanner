import java.util.ArrayList;

// 4.e
public class Main{

	public static void main(String[] args){

		// 4.f
		ArrayList<String> actions = new ArrayList<String>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		// 4.g
		GameMenu g = new GameMenu(actions);
		// System.out.print(actions.get(2)); // expected output: "Pause game"

		// 4.i
		g.displayMenu();
	}

}
