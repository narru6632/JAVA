package ex05method;

import java.util.Scanner;

public class QuTemperature {

//	섭씨 - Celsius / 화씨 - Fahrenheit 
//	섭씨를 화씨로 바꾸는 함수 만들고
//	화씨를 섭씨로 바꾸는 함수 만들기

	static double CelsiusTrans(double temf) { // 화씨->섭씨
		double cel = (temf - 32) / 1.8;
		return cel;
	}

	static double FahrenTrans(double temf) { // 섭씨->화씨
		double fah = 1.8 * temf + 32;
		return fah;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("=========온도변환기 메뉴========");
			System.out.println("1. 화씨를 섭씨로 변환");
			System.out.println("2. 섭씨를 화씨로 변환");
			System.out.println("원하는 번호를 입력해 주세요 : ");
			int menu = scanner.nextInt();
			if (menu == 1) {
				System.out.println("변형할 화씨 온도를 입력해 주세요 : ");
				double t = scanner.nextDouble();
				System.out.printf("화씨 %3.2f도는 섭씨 %3.2f도 입니다.", t, CelsiusTrans(t));
				break;
			} else if (menu == 2) {
				System.out.println("변형할 섭씨 온도를 입력해 주세요 : ");
				double t = scanner.nextDouble();
				System.out.printf("섭씨 %3.2f도는 화씨 %3.2f도 입니다.", t, FahrenTrans(t));
				break;
			} else {
				System.out.println("잘못된 번호입니다.");
			}
		}
		scanner.close();

	}

}
