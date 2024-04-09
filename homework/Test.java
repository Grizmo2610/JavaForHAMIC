package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static ArrayList<Integer> readData(String pathname) {
		File file = new File(pathname);
		Scanner     input = null;
		try{
			input = new Scanner(file);
		}catch (FileNotFoundException e){
			System.out.println("File not found!");
		}

		ArrayList<Integer> data  = new ArrayList<>();
		if (input != null){
			while (input.hasNext()){
				data.add(input.nextInt());
			}
		}
		return data;
	}

	public static ArrayList<String > getResult(String pathname) {
		File file = new File(pathname);
		Scanner     input = null;
		try{
			input = new Scanner(file);
		}catch (FileNotFoundException e){
			System.out.println("File not found!");
		}

		ArrayList<String> data  = new ArrayList<>();
		if (input != null){
			while (input.hasNext()){
				data.add(input.nextLine());
			}
		}
		return data;
	}

	public static void check(ArrayList<Integer> data){
		String pathname = "data/watermelon/output.txt";
		ArrayList<String> result = getResult(pathname);


	}


	public static void check(){
		String pathname = "data/watermelon/input.txt";
		ArrayList<Integer> testCases = readData(pathname);


	}
	public static void main(String[] args)  {


	}
}
