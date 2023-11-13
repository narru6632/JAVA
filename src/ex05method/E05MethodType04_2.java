package ex05method;

import java.util.Scanner;

public class E05MethodType04_2
{
	/*
	 * 여러개의 숫자를 입력 받은 후 최대값을 구하는 메소드를 정의하라. 단, 숫자의 갯수는 매개변수로 전달받고, 각 숫자값은 scanner클래스
	 * 를 통해 입력받는다 입력받은 숫자중 최대값을 찾아서 반환 하도록 정의하라
	 */
	public static void main(String[] args)
	{
		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값1:" + maxValue1);

		int maxValue2 = returnMaxNumber(6);
		System.out.println("최대값2:" + maxValue2);
//		ㄴSystem.out.println("최대값2:" + returnMaxNumber(6));로 대체가능
	}// main

	static int returnMaxNumber(int numberCnt)
	{

		Scanner scanner = new Scanner(System.in);
		int maxVal = 0;
		for (int i = 1; i <= numberCnt; i++)
		{
			System.out.println("정수를 입력하세요:");
			int inputNum = scanner.nextInt();
			maxVal = inputNum;//일단 최대값을 1번째수로 맞춰준다
				if (maxVal < inputNum)//그래야 앞으로 비교가 가능
				{
					maxVal = inputNum;
				}
			
		}//for
		return maxVal;
	}// method

}
