package homework.leetcode;

public class AddStrings {
	public String addStrings(String num1, String num2) {
		String m = "";
		int n = num1.length() - 1, p = num2.length() - 1;
		int r = 0;
		while (n >= 0 && p >= 0){ // n >= 0 p < 0
			int n1 = num1.charAt(n) - 48;
			int n2 = num2.charAt(p) - 48;
			int s = (n1 + n2 + r) % 10;
			r  = (n1 + n2 + r) / 10;
			m = s + m;
			n--;
			p--;
		}

		while (n >= 0){
			int n1 = num1.charAt(n) - 48;
			int s = (n1 + r) % 10;
			r = (n1 + r) / 10;
			m = s + m;
			n--;
		}

		while (p >= 0){
			int n2 = num2.charAt(p) - 48;
			int s = (n2 + r) % 10;
			r = (n2 + r) / 10;
			m = s + m;
			p--;
		}

		if (r > 0){
			m = r + m;
		}
		return m;
	}
}
