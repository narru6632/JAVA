package ex05method;

import java.util.Scanner;

public class QuCircleCalculator {

	//원의 지름을 인수로 전달하면 넓이와 둘레를 계산하여 반환하는
	//메서드를 각각 정의 하고 이를 호출하는 main 메서드를 정의하라
	static double circleRound(double radius) {
		double round = 3.14*radius*2;
		return round;
	}
	
	static double circleArea(double radius) {
		double area = 3.14*radius*radius; 
		return area;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하시오 : ");
		double r = scanner.nextDouble();
		System.out.printf("원의 둘레(%2.1f) : %2.2f\n",r,circleRound(r));
		System.out.printf("원의 넓이(%2.1f) : %2.3f",r,circleArea(r));
		scanner.close();
	}
	
	
}
