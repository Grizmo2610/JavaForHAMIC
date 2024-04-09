package answer.array;

import java.io.FileNotFoundException;

public class ArrayTest {
	public static void test(Exercise exercise) throws FileNotFoundException {
		System.out.println("____________TESTING " + exercise.getClass().getSimpleName() + "____________");
		exercise.test();
		System.out.println("__________________________________________");
	}

	public static void main(String[] args) throws FileNotFoundException {
		test(new Exercise01());
		test(new Exercise02());
		test(new Exercise03());
		test(new Exercise04());
		test(new Exercise05());
	}
}
