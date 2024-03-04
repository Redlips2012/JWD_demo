package training.util;

import java.util.Scanner;

public class ValidateUtils {
	public int inputInteger(String message) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println(message);
			String input = scanner.nextLine();
			if (input.trim().length() == 0) {
				System.err.println("Khong duoc de trong");
				continue;
			}
			if (input.matches("^\\d+$")) {
				return Integer.parseInt(input);
			}
			System.out.println("Ky tu khong hop le, chi co the nhap so");

		}
	}
	public Long inputLong(String message) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println(message);
			String input = scanner.nextLine();
			if (input.trim().length() == 0) {
				System.err.println("Khong duoc de trong");
				continue;
			}
			if (input.matches("^\\d+$")) {
				return Long.parseLong(input);
			}
			System.out.println("Ky tu khong hop le, chi co the nhap so");
			
		}
	}
}
