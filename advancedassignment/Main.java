package advancedassignment;

import java.util.Random;
import java.util.Scanner;

public class Main {

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

	public static int computer(){
		Random random = new Random();
		return random.nextInt(3);
	}

	public static int result(int computer, int player){
		if (computer == player){
			return 0;
		} else if (player == 0 && computer == 1){
			return -1;
		}else if (player == 0 && computer == 2){
			return 1;
		} else if (player == 1 && computer == 0){
			return 1;
		}else if (player == 1 && computer == 2){
			return -1;
		}else if (player == 2 && computer == 0){
			return -1;
		}
		return 1;

	}

	public static String display(int i){
		if (i == 0){
			return "Rock";
		} else if (i == 1){
			return "Paper";
		}
		return "Scissors";
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
		Scanner input = new Scanner(System.in);
		int player = player();
		int computer = computer();

		displayResult(computer, player);
		input.close();
	}
}
