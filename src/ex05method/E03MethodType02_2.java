package ex05method;

import java.util.Scanner;

public class E03MethodType02_2
{

	static String getHakjum()
	{
		Scanner scanner = new Scanner(System.in);

		// 사용자로부터 국 영 수 점수를 입력받아 평균을 구한 후 학점을 출력하는
		// 메소드를 정의하라
		
		System.out.println("국어점수:");
		int kor = scanner.nextInt();
		System.out.println("영어점수:");
		int eng = scanner.nextInt();
		System.out.println("수학점수:");
		int math = scanner.nextInt();

		double avg = (kor + eng + math) / 3.0; //double형으로 만들려고 3.0으로 나눔
		String hakjum = "";
		int result = (int) avg / 10; // double형을 강제로 int형 변환(데이터손실=소수점)
		switch (result)
		{
		case 10:
		case 9:
			hakjum = "A학점";
			break;
		case 8:
			hakjum = "B학점";
			break;
		case 7:
			hakjum = "C학점";
			break;
		case 6:
			hakjum = "D학점";
			break;
		default:
			hakjum = "F학점";
			break;
		}
		return hakjum;
	}//method

	public static void main(String[] args)
	{


		System.out.println("당신의 학점은" + getHakjum() + " 입니다..");

		String h = getHakjum();
		System.out.printf("당신의 학점은 %s 입니다.", h);

	}// main

}
