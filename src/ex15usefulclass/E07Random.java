package ex15usefulclass;

import java.util.Random;

public class E07Random
{
	/*
	Random클래스는 객체생성시 전달되는 Seed(씨앗)을 기반으로 난수를 생성
	만약 동일한 Seed를 사용하면 항상 같은 패턴의 난수가 생성됨(=가짜난수)
	*/
	public static void main(String[] args)
	{
		System.out.println("#가짜난수 : 같은 패턴의 난수만 생성됨");
		Random random1 = new Random(32);
		for(int i=0; i<10; i++) {
			System.out.print(random1.nextInt(100)+ " ");
		}
		
		//nextInt(N) = 0~N-1까지의 난수생성
		System.out.println("\n#난수생성 1 : 씨드없음");
		Random random2 = new Random();
		for(int i=0; i<10; i++) {
			System.out.print(random2.nextInt(100)+ " ");
		}
		
		//씨드부여 = setSeed()메서드 사용
		System.out.println("\n#난수생성 2 : 변화하는 시간으로 씨드지정");
		Random random3 = new Random();
		//씨드에 현재시간을 밀리세컨즈 단위로 반환하는 메서드를 사용하면 편리
		// ㄴ시간은 계쏙흘러가므로 항상 새로운 Seed 생성가능
		random3.setSeed(System.currentTimeMillis());
		for(int i=0; i<10; i++) {
			System.out.print(random3.nextInt(100)+ " ");
		}
		
		
		//nextInt()에 인수가 없는 경우 음수,양수가 혼용된 난수가 생성됨. 
		System.out.println("\n#난수생성 3 : nextInt() 인수없음");
		Random random4 = new Random();
		for(int i=0; i<10; i++) {
			System.out.print(random4.nextInt()+ " ");
		}
		
		
		
		
	}
}