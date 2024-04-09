package advancedassignment.conditions;

import java.util.Scanner;

public class GrabCalculator {
	public static double calculator (int minPrice, int price , double distance){
		if (distance <= 2){
			return  minPrice;
		}
		return  price * distance;
	}

	public static int formatPrice(double price){
		return ((int) (price / 1000)) * 1000;
	}

	public static double price(double distance, int service, double time){
		double price = 0;
		if (service == 0){
			price = calculator(12500,4300,distance);
		} else if (service == 1){
			price = calculator(29000,10000,distance);
		} else if (service == 2){
			price = calculator(34000,13000,distance);
		} else if (service == 3){
			if (time < 7 || time > 20){
				System.out.println("The service is not operational at the moment.");
			}else{
				price = calculator(16000 , 5000 , distance);
			}
		} else {
			price = calculator(16000,5000,distance);
		}

		if ((11 <= time && time <= 13.5) || (17 <= time && time <= 20)){
			price += 5000;
		} else if(time >= 22 || time <= 5){
			price += 10000;
		}

		return price;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input distance: ");
		double distance = input.nextDouble();
		System.out.print("Input time: ");
		double time = input.nextDouble();
		System.out.print("Input service: ");
		int service = input.nextInt();

		int price = formatPrice(price(distance, service, time));
		System.out.println("Price: " + price);
	}
}
