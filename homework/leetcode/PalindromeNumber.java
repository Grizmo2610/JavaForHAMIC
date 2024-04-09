package homework.leetcode;

public class PalindromeNumber {
	public static int reverseNumber(int n) {
		if (n < 10) {
			return n;
		} else {
			int reversed = 0;
			while (n > 0) {
				reversed = reversed * 10 + n % 10;
				n = n / 10;
			}
			return reversed;
		}
	}

	public boolean isPalindrome(int x) {
		if (x < 0){
			return false;
		}
		return reverseNumber(x) == x;
	}
}
