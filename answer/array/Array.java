package answer.array;

public class Array {
	/**
	 * Exercise 01: Given an array nums. We define a running sum of an
	 * array as runningSum[i] = sum(nums[0]…nums[i]).
	 *
	 * @param nums input array
	 * @return running sum of nums
	 */
	public static int[] runningSum(int[] nums) {
		for (int i = 1; i < nums.length; i++){
			nums[i] += nums[i - 1];
		}
		return nums;
	}

	/**
	 * Given a zero-based permutation nums (0-indexed), build an array ans
	 * of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length
	 * and return it.
	 * <p>
	 * A zero-based permutation nums is an array of distinct integers from 0 to
	 * nums.length - 1 (inclusive).
	 *
	 * @param nums input array
	 * @return Array from Permutation
	 */
	public static int[] buildArray(int[] nums){
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++){
			ans[i] = nums[nums[i]];
		}
		return ans;
	}

	/**
	 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
	 * <p>
	 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
	 * @param nums input array
	 * @param n one half of the array length
	 * @return shuffled array
	 */
	public static int[] shuffle(int[] nums, int n) {
		int[] result = new int[nums.length];
		int index = 0;
		for (int i = 0; i < n; i++){
			result[index] = nums[i];
			index++;
			result[index] = nums[n + i];
			index++;
		}
		return result;
	}

	/**
	 * Given a sorted array of distinct integers and a target value,
	 * return the index if the target is found. If not, return the index
	 * where it would be if it were inserted in order.
	 *
	 * <p>
	 * Can you write an algorithm within only 1 loop?
	 *
	 * @param nums input array
	 * @param target target number need to find
	 * @return insert position
	 */
	public static int searchInsert(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int mid = end / 2;
		while (start <= end) {
			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
			mid = start + (end - start) / 2;
		}
		return start;
	}


	/**
	 * You are given a large integer represented as an integer array digits,
	 * where each digits[i] is the ith digit of the integer. The digits are
	 * ordered from most significant to least significant in left-to-right order.
	 * The large integer does not contain any leading 0's.
	 *
	 * @param digits digit array
	 * @return new digit array
	 */
	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--){
			if (digits[i] < 9){
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}
}


