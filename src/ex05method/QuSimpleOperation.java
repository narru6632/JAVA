package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {
	// 두개의 정수( 100,77 )을 받아 사칙연산의 결과를 출력하는 메소드/메인메서드
	static void arithmetic(int num1, int num2) {
		int big, small = 0;
		if (num1 >= num2) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}
		int sum = big + small;
		int imsub = big - small;
		int product = big * small;
		int quotient = big / small;
		int mod = big % small;
		System.out.println("덧셈결과 -> " + sum);
		System.out.println("뺄셈결과 -> " + imsub);
		System.out.println("곱셈결과 -> " + product);
		System.out.println("나누기결과 -> " + quotient);
		System.out.println("나머지 -> " + mod);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사칙연산을 할 숫자를 입력해주세요 : ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		arithmetic(n1, n2);
		scanner.close();
	}
}
