import java.util.Scanner;

// 2.a
public class Main{

	// 2.b
	public static void main(String[] args){

		System.out.println("Please type your name");

		// 2.c
		Scanner scanner = new Scanner(System.in);

		// 2.d
		String name = scanner.nextLine();

		// 2.e
		System.out.println("Hello " + name + " Please type your age");

		// 2.g
		int age = scanner.nextInt();

		System.out.println("You are " + age + " years old");

		// 2.h

		int retirement = 67 - age;

		System.out.println("You have " + retirement + " years until retirement");

	}

}