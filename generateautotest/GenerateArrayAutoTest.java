package generateautotest;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;


public class GenerateArrayAutoTest {
	static Random random = new Random();
	public static int[] randomArray(int size){
		int[] array = new int[size];
		for (int i = 0; i < size; i++){
			array[i] = random.nextInt(size * 2) - size;
		}
		return array;
	}

	public static int[] randomArray(int size, int start, int end){
		int[] array = new int[size];
		for (int i = 0; i < size; i++){
			array[i] = random.nextInt(end + start - 1) + start;
		}
		return array;
	}

	public static int[] randomArray(int size, boolean positive){
		int[] array = new int[size];
		for (int i = 0; i < size; i++){
			if (positive){
				array[i] = random.nextInt(size);
			}else {
				array[i] = random.nextInt(size * 2) - size;
			}

		}
		return array;
	}

	public static void write(String filePath, String content){
		content = content.trim();
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

			writer.write(content);

			writer.close();

			System.out.println("Nội dung đã được ghi vào file thành công.");
		} catch (IOException e) {
			System.out.println("Đã xảy ra lỗi khi ghi vào file: " + e.getMessage());
		}
	}

	public static String ArrayToString(int[] array){
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < array.length; i++){
			result.append(array[i]);
			if (i < array.length - 1){
				result.append(" ");
			}
		}
		return result.toString();
	}

	public static void write(int exercise, String input, String output){
		String path = "src/autotest/array/data/exercise0";
		String inputPath = path + exercise + "/input.txt";
		String outputPath= path + exercise + "/output.txt";
		write(inputPath, input);
		write(outputPath, output);
	}

	public static int[] runningSum(int[] nums) {
		for (int i = 1; i < nums.length; i++){
			nums[i] += nums[i - 1];
		}
		return nums;
	}

	public static void runningSumGenerateTest(int sample){
		StringBuilder input  = new StringBuilder();
		StringBuilder output = new StringBuilder();
		for(int i = 1; i <= sample; i++){
			int size = 5 * i;
			int[] array = randomArray(size);
			input.append(ArrayToString(array)).append("\n");
			int[] result = runningSum(array);
			output.append(ArrayToString(result)).append("\n");
		}
		write(1, input.toString(), output.toString());
	}

	public static int[] buildArray(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < result.length; i++){
			result[i] = nums[nums[i]];
		}
		return result;
	}

	public static void buildArrayGenerateTest(int sample){
		StringBuilder input  = new StringBuilder();
		StringBuilder output = new StringBuilder();
		for(int i = 1; i <= sample; i++){
			int size = 5 * i;
			int[] array = randomArray(size, true);
			input.append(ArrayToString(array)).append("\n");
			int[] result = buildArray(array);
			output.append(ArrayToString(result)).append("\n");
		}
		write(2, input.toString(), output.toString());
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] result = new int[nums.length];
		int index = 0;
		for (int i = 0; i < n; i++){
			result[index++] = nums[i];
			result[index++] = nums[n + i];
		}
		return result;
	}

	public static void shuffleGenerateTest(int sample){
		StringBuilder input  = new StringBuilder();
		StringBuilder output = new StringBuilder();
		for(int i = 0; i < sample; i++){
			int size = (5 * i) * 2;
			int[] array = randomArray(size);
			input.append(ArrayToString(array)).append("\n");
			int[] result = shuffle(array, size / 2);
			output.append(ArrayToString(result)).append("\n");
		}
		write(3, input.toString(), output.toString());
	}

	public static int searchInsert(int[] nums, int target) {
		if (target < nums[0]){
			return 0;
		}

		for (int i = 0; i < nums.length; i++){
			if (nums[i] == target){
				return i;
			}
		}
		return nums.length - 1;
	}

	public static void searchInsertGenerateTest(int sample){
		StringBuilder input  = new StringBuilder();
		StringBuilder output = new StringBuilder();
		for(int i = 1; i <= sample; i++){
			int size = 5 * i;
			int target = random.nextInt(size + 1) + 1;
			int[] array = randomArray(size);
			Arrays.sort(array);
			int result = searchInsert(array, target);
			input.append(ArrayToString(array)).append(",").append(target).append("\n");
			output.append(result).append("\n");
		}
		write(4, input.toString(), output.toString());
	}

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}

	public static void plusOneGenerateTest(int sample){
		StringBuilder input  = new StringBuilder();
		StringBuilder output = new StringBuilder();
		for(int i = 1; i <= sample; i++){
			int size = 5 * i * 10;
			int[] array = randomArray(size, 1, 9);
			input.append(ArrayToString(array)).append("\n");
			int[] result = plusOne(array);
			output.append(ArrayToString(result)).append("\n");
		}
		write(5, input.toString(), output.toString());
	}

	public static void main(String[] args) {
		int sample = 200;
		runningSumGenerateTest(sample);
		buildArrayGenerateTest(sample);
		shuffleGenerateTest(sample);
		searchInsertGenerateTest(sample);
		plusOneGenerateTest(sample);
	}
}
