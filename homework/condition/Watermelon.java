package homework.condition;

import java.util.Scanner;

public class Watermelon {
	public static boolean solution(int w){
		if (w == 2){
			return false;
		} else return w % 2 == 0;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int w = input.nextInt();
		if (solution(w)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
