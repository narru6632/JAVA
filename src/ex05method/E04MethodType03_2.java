package ex05method;

import java.util.Scanner;

public class E04MethodType03_2
{

	/*
	 * 사용자로부터 2~9 사이의 숫자중 2개를 입력받아 그에 해당하는 구구단을 출력하는 메서드를 작성하시오
	 * 
	 * @무조건 첫번째 입력받는 수가 작아야 한다.
	 * 
	 * @메서드명 : inputGugudan(int sNum,int eNum)
	 */

	static void inputGugudan(int sNum, int eNum)
	{
		//for문 구구단 만들기
		for(int s = sNum; s<=eNum; s++) {
			System.out.printf(" %2d 단 : ",s);
			for(int q=1; q<=9; q++) {
				System.out.printf("%-2d*%2d = %-2d    ",s,q,(s*q));
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단 시작값:");
		int s = scanner.nextInt();
		System.out.println("구구단 종료값:");
		int e = scanner.nextInt();
		inputGugudan(s,e);
	}

}
