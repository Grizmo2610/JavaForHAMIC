package advancedassignment.conditions;

import java.util.Scanner;

public class TriangleChecking {
	public static boolean isTriangle(int a, int b, int c){
		return a + b > c && a + c > b && b + c > a;
	}

	public static boolean isRightTriangle(int a, int b, int c){
		return a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b;
	}

	public static boolean isEquilateral (int a, int b, int c){
		return a == b && b == c;
	}

	public static boolean isIsosceles(int a, int b, int c){
		return a == b || b == c || a == c;
	}

	public static boolean isAcute(int a, int b, int c){
		return a * a + b * b < c * c || b * b + c * c < a * a || a * a + c * c < b * b;
	}

	public static boolean isObtuse (int a, int b, int c){
		return a * a + b * b > c * c || b * b + c * c > a * a || a * a + c * c > b * b;
	}

	public static void triangleChecking(int a, int b, int c){
		if (isTriangle(a, b, c)){
			if (isEquilateral(a, b, c)){
				System.out.printf("%d, %d, %d is a Equilateral triangle", a, b, c);
			} else if (isIsosceles(a , b , c)){
				if (isRightTriangle(a, b, c)){
					System.out.printf("%d, %d, %d is a Isosceles right triangle", a, b, c);
				}else if (isAcute(a, b, c)){
					System.out.printf("%d, %d, %d is a Isosceles acute triangle", a, b, c);
				}else if (isObtuse(a, b, c)){
					System.out.printf("%d, %d, %d is a Isosceles obtuse triangle", a, b, c);
				}
			} else if (isRightTriangle(a , b , c)){
				System.out.printf("%d, %d, %d is a right triangle", a, b, c);
			} else if (isObtuse(a, b, c)){
				System.out.printf("%d, %d, %d is a obtuse triangle", a, b, c);
			} else if (isAcute(a, b, c)){
				System.out.printf("%d, %d, %d is a acute triangle", a, b, c);
			}
		}else{
			System.out.printf("%d, %d, %d is not a triangle", a, b, c);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input length of first edge: ");
		int a = input.nextInt();
		System.out.print("Input length of second edge: ");
		int b = input.nextInt();
		System.out.print("Input length of third edge: ");
		int c = input.nextInt();

		input.close();

		triangleChecking(a, b, c);
	}
}
