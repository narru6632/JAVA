package quiz;

public class QuUpgradeGuGu {
	public static void main(String[] args) {
		// 2~9까지 1~9승 출력하기
		for (int i = 2; i <= 9; i++) {// 숫자 2~9
			System.out.printf("%d * 1 = %d \n",i,i);
			for (int j = 2; j <= 9; j++)//제곱수 1~9 
			{	
				int gugu = i;
				System.out.printf("%d", i);
				for (int k = 2; k<= j; k++) {//연산
					gugu *= i;
					System.out.printf(" * %d",i);
				}
				System.out.printf(" = %d\n",gugu);//결과출력
			}

		}
	}

}
