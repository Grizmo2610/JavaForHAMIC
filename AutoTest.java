import homework.condition.Watermelon;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AutoTest {
	public static ArrayList<Integer> readData(String pathname) 
	
	
	throws FileNotFoundException {
		File file = new File(pathname);
		Scanner     input = new Scanner(file);
		ArrayList<Integer> data  = new ArrayList<>();
		while (input.hasNext()){
			data.add(input.nextInt());
		}

		return data;


	}

	public static void writeData(String pathname, ArrayList<Integer> data){
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathname))) {
			for (int i = 0; i < data.size(); i++){
				if (Watermelon.solution(data.get(i))){
					writer.write("Yes");
				}else{
					writer.write("No");
				}

				if (i < data.size() - 1){
					writer.newLine();
				}
			}

		} catch (IOException e) {
			System.out.println("File not found!");
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		String input = "data/condition/watermelon/input.txt";
		String output = "data/condition/watermelon/output.txt";
		writeData(output, readData(input));
	}
}
