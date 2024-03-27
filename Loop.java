import java.util.Scanner;

public class Loop {
	public static String helper(int number){
		if (number < 10){
			return "0"+number;
		}return number+"";
	}

	public static void printMultiplicationTable(){
		for (int i = 1; i < 10; i++){
			System.out.println("Multiplication Table " + helper(i));
			for (int j = 1; j < 10; j++){
				System.out.println(helper(i) + "*" + helper(j) + "=" + helper(i*j));
			}
		}
	}

	public static void printFactor(int number){
		if (number < 0){
			number = - number;
		}
		while (number % 2 == 0){
			System.out.print(number);
			number /= 2;
			if (number != 1){
				System.out.print(" ");
			}
		}
		int div = 3;
		while (number > 1 && number >= div){
			while (number % div == 0){
				System.out.print(div);
				number/= div;
				if(number != 1){
					System.out.print(" ");
				}
			}
			div += 2;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		printMultiplicationTable();
		System.out.println();

		System.out.print("Input number: ");
		int number = input.nextInt();
		System.out.println("Factor: ");
		printFactor(number);
	}


}
