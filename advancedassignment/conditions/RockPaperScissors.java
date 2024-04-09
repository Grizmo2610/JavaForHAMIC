package advancedassignment.conditions;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static String display(int i){
		if (i == 0){
			return "Rock";
		} else if (i == 1){
			return "Paper";
		}
		return "Scissors";
	}

	public static int computer(){
		Random random = new Random();
		return random.nextInt(3);
	}

	public static int player(){
		Scanner input = new Scanner(System.in);
		System.out.println("""
Please choose one from the following list:
0 - Rock
1 - Paper
2 - Scissors""");
		System.out.print("Player choose: ");
		return input.nextInt();
	}

	public static int result(int computer, int player){
		if (player == computer){
			return 0;
		}

		int result = player - computer;
		if (result == 2){
			return -1;
		} else if (result == -2){
			return 1;
		}return result;
	}


	public static void displayResult(int computer, int player){
		System.out.println("____________RESULT____________");
		System.out.println("Player choose: " + display(player));
		System.out.println("Computer choose: " + display(computer));
		int result = result(computer, player);
		if (result == 0){
			System.out.println("Draw!");
		} else if (result == 1){
			System.out.println("Player win!");
		}else{
			System.out.println("Computer win");
		}
	}

	public static void main(String[] args) {
		int computer = computer(), player = player();
		displayResult(computer, player);
	}
}
