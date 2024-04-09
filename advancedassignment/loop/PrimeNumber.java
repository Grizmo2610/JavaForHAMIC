package advancedassignment.loop;

public class PrimeNumber {
	public static boolean isPrime(int number){
		if (number < 2 || (number % 2 == 0) && number > 2){
			return false;
		}
		for (int i = 3; i <= Math.sqrt(number); i+=2){
			if (number % i == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

	}
}
