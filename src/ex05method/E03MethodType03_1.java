package ex05method;

import java.util.Scanner;

public class E03MethodType03_1
{
	/*
	 * 시나리오> 사용자가 입력한 2개의 시작값과 끝값 사이에 있는 수를 모두 더하여 출력하는 프로그램을 작성하시오 ex) 시작값 : 5 종료값
	 * : 9 결과 : 5+6+7+8+9 = ???
	 */

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("시작값:");
		int s = scanner.nextInt();
		System.out.println("종료값:");
		int e = scanner.nextInt();
//		반환값이 없는 메서드이므로 단독으로 호출만 한다
//		앞에서 입력받은 2개의 정수를 인수(Argument)로 전달한다
		
		myWantSum(s, e); // s,e = 인자(인수값으로 넘겨주는 매개변수)
		scanner.close(); // 스캐너 닫아주기, 반복문에선 닫지 않는게 좋다

	}// main

	static void myWantSum(int startNum, int endNum)//매개변수만 있고 반환값은 없는 메서드
	{
		int sum = 0;

		for (int i = startNum; i <= endNum; i++)//입력받은 구간의 합을 구하는 프로그램
		{
			sum += i;
		}
		System.out.printf("%d~%d까지의 합은:%d", startNum, endNum, sum);
	}// myWantSum

}
