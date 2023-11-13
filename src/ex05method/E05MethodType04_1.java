package ex05method;

import java.util.Scanner;

public class E05MethodType04_1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int sumOfAge = getTotalAge(3);
		System.out.println("세명의 나이의 합은?"+sumOfAge);
		System.out.println("나이를 구할 인원수를 입력해 주세요");
		int q = scanner.nextInt();
		int sumOfAge2 = getTotalAge(q);
		
		System.out.printf("%-2d명 의 나이의 합은?"+sumOfAge2,q);
		
		
		
	}
	static int getTotalAge(int personCnt) {
		//3명의 나이를 입력받아 그 나이의 합을 반환하는 메서드
		
		Scanner scanner = new Scanner(System.in);
		int sumAge = 0;
		
		for(int i=1; i<=personCnt; i++) {
			System.out.println(i+"번째 사람의 나이:");
			int age = scanner.nextInt();
			sumAge += age;
		}
		return sumAge;
		
	}
	
	
	
	

}
