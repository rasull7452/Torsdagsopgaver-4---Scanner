import java.util.ArrayList;

// 4.a
public class GameMenu{

	// 4.b
	private ArrayList<String> actions = new ArrayList<String>();

	// 4.c
	public GameMenu(ArrayList<String> gameMenuActions){

		// 4.d
		this.actions = gameMenuActions;

	}
	// 4.h
	public void displayMenu(){

		for(int i = 0; i < this.actions.size(); i++){

			System.out.println(this.actions.get(i));

		}
	}
}