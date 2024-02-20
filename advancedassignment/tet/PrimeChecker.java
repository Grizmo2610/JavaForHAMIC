package advancedassignment.tet;

import java.util.Scanner;
/**
 * Exercise 04: Prime Checker
 *
 * @version 1.0
 * @author Hoang Tu
 */
public class PrimeChecker {
	public static boolean isPrime(int number){
		if (number == 2){
			return true;
		} else if (number < 2 || number % 2 == 0){
			return false;
		}
		for (int i = 3; i < Math.sqrt(number) + 1; i+=2){
			if (number % i == 0){
				return false;
			}
		}
		return true;
	}

	public static void solution(int number){
		if(isPrime(number)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		solution(number);
		input.close();
	}
}
