package homework.leetcode;
import java.util.HashMap;
public class RomanToInteger {
	public int romanToInt(String s) {
		HashMap<Character, Integer> mean = new HashMap<>();
		mean.put('I', 1);
		mean.put('V', 5);
		mean.put('X', 10);
		mean.put('L', 50);
		mean.put('C', 100);
		mean.put('D', 500);
		mean.put('M', 1000);

		HashMap<Character, Character> linked = new HashMap<>();
		linked.put('V', 'I');
		linked.put('X', 'I');
		linked.put('L', 'X');
		linked.put('C', 'X');
		linked.put('D', 'C');
		linked.put('M', 'C');

		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			ans += mean.get(s.charAt(i));
			if (i > 0) {
				if (linked.containsKey(s.charAt(i))) {
					if (s.charAt(i - 1) == linked.get(s.charAt(i))) {
						ans -= 2 * mean.get(linked.get(s.charAt(i)));
					}
				}
			}
		}
		return ans;
	}
}
