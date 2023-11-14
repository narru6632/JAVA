package ex07string;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputId = scanner.next();
		for(int i=0;i<inputId.length();i++) {
			char idChar = inputId.charAt(i);
			System.out.println(idChar);
		}
	}
}
