package advancedassignment.operator;

import java.util.Scanner;

public class CalculatorProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.print("Input first number a: ");
		double a = input.nextDouble();

		System.out.print("Input second number: ");
		double b = input.nextDouble();

		input.close();


		System.out.println("_________________RESULT_________________");

		System.out.println("1. " + a + " + " + b + " = " + (a + b));

		System.out.println("2. " + a + " - " + b + " = " + (a - b));

		System.out.println("3. " + a + " × " + b + " = " + (a * b));

		System.out.println("4. " + a + " ÷ " + b + " = " + (a / b));

		System.out.println("5. " + a + " mod " + b + " = " + (a % b));

		System.out.println("6. " + a + "^2 - " + b + "^2 = " + (a * a - b * b));

		System.out.println("7. " + a + " × (" + b + " + " + a + ") - " + b + " = " + (a * (b + a) - b));

		System.out.println("8. " + a + "^2 + " + b + "^2 = " + (a * a + b * b));

		System.out.println("9. " + a + " ÷ (" + b + " + 1) + " + b + " = " + (a / (b + 1) + b));

		System.out.println("10. " + a + " × " + b + " + " + a + " + " + b + " = " + (a * b + a + b));

		System.out.println("11. " + a + "^2 + " + a + "b + " + b + "^2 = " + (a * a + a * b + b * b));

		System.out.println("12. " + a + " × " + a + " + " + b + " × " + b + " = " + (a * a + b * b));

		System.out.println("13. " + a + " ÷ (" + b + " - 1) + " + b + " = " + (a / (b - 1) + b));

		System.out.println("14. " + a + "^2 + 2" + a + "b + " + b + "^2 = " + (a * a + 2 * a * b + b * b));

		System.out.println("15. (" + a + " + " + b + ") ÷ (" + a + " - " + b + ") = " + ((a + b) / (a - b)));

		System.out.println("16. (" + a + "^2 + 2" + a + "b + " + b + "^2) ÷ (" + a + " + " + b + ") = "
				                   + ((a * a + 2 * a * b + b * b) / (a + b)));

		System.out.println("17. " + a + "^3 - " + b + "^3 = " + (a * a * a - b * b * b));

		System.out.println("18. (" + a + " + " + b + ")^2 = " + Math.pow(a + b, 2));

		System.out.println("19. (" + a + "^2 + " + b + "^2) mod " + b + "^3 = " + ((a * a + b * b) % Math.pow(b, 3)));

		System.out.println("20. " + a + " × (" + b + " - " + a + ") + " + b + " = " + (a * (b - a) + b));
	}
}
