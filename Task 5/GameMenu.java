import java.util.ArrayList;
import java.util.Scanner;


public class GameMenu{


	private ArrayList<String> actions = new ArrayList<String>();


	public GameMenu(ArrayList<String> gameMenuActions){


		this.actions = gameMenuActions;

	}

	public void displayMenu(){

		for(int i = 0; i < this.actions.size(); i++){

			System.out.println(this.actions.get(i));

		}
	}

	// 5.a & 5.c
	public String promptUser(){

		// 5.b
		Scanner scanner = new Scanner(System.in);

		displayMenu();
		System.out.println("Type a number to choose an action");
		String choice = scanner.nextLine();

		return choice;


	}
}