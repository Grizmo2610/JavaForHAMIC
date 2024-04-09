package homework.array;

import java.util.Scanner;

public class EvenSum2 {
	public static int solve(){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		while (true){
			int value = input.nextInt();
			if (value == -1){
				break;
			}

			if (value % 2 == 0){
				sum += value;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(solve());
	}
}
