package ex06array;

import java.util.Random;

public class E01OneDimArray02
{
	public static void main(String[] args)
	{
		double rndNumber = Math.random();
		//난수구하기 1 Math.random()
		//0~1사이의 실수를 구하는 명령어, 정수형태를 원하면 *10 / *100을 해주면 된다
		System.out.println("생성된난수[실수]:" + rndNumber);
		int intNumber = (int)(Math.random()*100);
		System.out.println("생성된난수[실수]:" + intNumber);
		
		Random random = new Random();//난수구하기 2랜덤클래스 사용, nexInt()로 호출
		System.out.println("생성된난수[실수]:" + random.nextInt());
		System.out.println("====================================");
		
		System.out.println("1~45사이의 난수생성:"+
					(int)((Math.random()*100)%45)+1);
		System.out.println("====================================");
		
		System.out.println("크기가 6인 배열에 난수 입력");
		int[] lottoNum = new int[6];
		for(int i=0; i<lottoNum.length; i++) { //0.xxxx형태의 난수에 100을 곱한 후 45로 나눠주면 
			lottoNum[i] = (int)((Math.random()*100)%45) + 1;//나머지는0~44가 된다 1을 더해주면 난수생성
		}	//아직 중복체크. 올림차순 정렬 필요
		for(int i=0; i<lottoNum.length; i++) {
			System.out.printf("%d ", lottoNum[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
