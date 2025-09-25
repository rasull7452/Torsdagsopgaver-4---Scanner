import java.util.Random;
import java.util.Scanner;  

// 3.a

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
    System.out.println(rnd_number);
        makeAGuess();
    }

    private static void makeAGuess(){

        Scanner scanner = new Scanner(System.in);


        if(scanner.hasNextDouble() == true){
            double input = scanner.nextDouble();
            if(input == rnd_number){

                System.out.println("You guessed " + rnd_number + " which is correct");

            }else if(input < rnd_number){

                System.out.println("Your guess was too low, try going higher");
                makeAGuess();

            }else if(input > rnd_number){

                System.out.println("Your guess was too high, try going lower");
                makeAGuess();

            }
        } else{

                System.out.println("You may only type a number");
                makeAGuess();

            }
	// Create a Scanner object   	 
        // use hasNextDouble to check if input is numeric, 
        // if so...
	// Read user input
        // Compare it with the random number
        // Let the user know the result of the comparison
        // Let the user try again by calling this method recursively
        // Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively
    }
}