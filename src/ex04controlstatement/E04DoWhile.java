package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhile
{
	public static void main(String[] args) throws IOException
	{
		
		// 1~10까지 더하는 수열을 do while로 구현
		int sum = 0;
		int i = 1;
		do
		{
			sum += i;
			i++;
		} while (i <= 10);
		System.out.println("1~10까지의 누적합:" + sum);

		
		
		
//		1~1000까지의 정수중 4의 배수이거나 7의 배수인 수의 합 구하기
//		 do while 사용
		int total = 0;
		int j = 1;
		do
		{
			if (j % 4 == 0 || j % 7 == 0)
			{
				total += j;
			}
			j++;
		} while (j <= 1000);
		System.out.println("1~1000사이 4or7의 배수합:" + total);

		
		//평균내어 학점매기기 do while
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg;
		int exitCode;
		do
		{
			System.out.println("국어점수:");
			kor = scanner.nextInt();
			System.out.println("영어점수:");
			eng = scanner.nextInt();
			System.out.println("수학점수:");
			math = scanner.nextInt();

			avg = (kor + eng + math) / (3 * 10);
			switch (avg)
			{
			case 10: case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
			}

			System.out.println("종료하려면 x(X)키를 입력하세요.");
			System.out.println("계속하려면 아무키나 입력하세요.");
			exitCode = System.in.read();
			
		} while (!(exitCode=='x' || exitCode=='X'));

	}
}
