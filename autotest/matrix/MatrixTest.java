package autotest.matrix;

import java.io.FileNotFoundException;
/**
 * DON'T TOUCH OR CHANGE ANYTHING IN THIS FILE!
 */
public class MatrixTest {
	public static void test(MatrixExercise exercise) throws FileNotFoundException {
		System.out.println("____________TESTING " + exercise.getClass().getSimpleName() + "____________");
		exercise.test();
		System.out.println("__________________________________________");
	}

	public static void main(String[] args) throws FileNotFoundException {
		test(new Exercise01());
		test(new Exercise02());
		test(new Exercise03());
		test(new Exercise04());
	}
}
