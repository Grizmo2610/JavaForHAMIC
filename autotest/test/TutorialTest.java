package autotest.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TutorialTest {
	/*
	* Trong file này là file để chạy test xem đã cài đặt đúng hay chưa.
	* Nếu như chương trình chạy thành công và không báo lỗi, có nghĩa
	* các bạn có thể bắt đầu tính giờ làm bài.
	*
	* */
	public static void main(String[] args) {
		Scanner input;
		try{
			File file = new File("src/autotest/test/test.txt");
			input = new Scanner(file);
			while (input.hasNextLine()){
				System.out.println(input.nextLine());
			}
			System.out.println("Right setting");
			System.out.println("You can starting code from now!");
		}catch (FileNotFoundException e){
			System.out.println("Watch Auto test tutorial");
		}
	}
}
