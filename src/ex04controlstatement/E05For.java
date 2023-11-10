package ex04controlstatement;

public class E05For
{
	public static void main(String[] args)
	{
		
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("i="+i);
		}
		
		//1~100까지의 합을 구하는 for문
		int sum = 0;
		for(int j=1; j<=100; j++) {
			sum += j;
		}
		System.out.println("1~100까지의 합: "+sum);
		
		
		//1~10까지의 정수중 2의 배수의 합을 구하는 for문
		int total = 0;
		for(int i=0; i<=10; i+=2) {
			if (i%2==0)
			{
				total += i;
			}
		}
		// 2의 배수 방법 2
		System.out.println("1~10사이 2의 배수의 합(방법2) : "+total);
		
		total = 0;
		for(int i=0; i<=10; i+=2) {
			total+= i;
		}
		
		
		
		//for(;;) => 무한루프
		int a = 1;
		for(;;) {
			System.out.println("나는 for문으로 만든 무한루프입니다."+a);
			a++;
			if(a==100) break;//탈출조건
		}
		
		for(int j=0; j<=5; j++); // for문의 끝에 k를 붙여버리면 반복문을 없는것으로 취급
		{
			System.out.println("어랏 나는 누구? 여기 어디?");//for와 상관없는 문장이되어
		}													//1번만 출력됨, j도 사용 불가능
		
//		System.out.println("위 for문에서 선언한 변수 j="+j); //j는 for문의 지역변수이므로 소멸되어 사용불가능
		System.out.println("위 main함수 지역에서 선언한 변수 total="+total);
		
		int i = 0;
		for( ; i<=5; i++) {
			System.out.println("for문 안에서의 i값="+i);
		}
		System.out.println("for문 밖에서의 i값="+i);
		
		System.out.println("================연습문제1=================");
			
		//연습문제 for문 구구단 만들기
		for(int s=2; s<=9; s++) {
			System.out.printf(" %d 단 : ",s);
			for(int q=1; q<=9; q++) {
				System.out.printf("%-2d*%2d = %-2d    ",s,q,(s*q));
			}
			System.out.println();
		}
		
		System.out.println("================연습문제2=================");
		
		//연습문제 구구단 열로 출력
		for(int s=2; s<=9; s++) {
			System.out.printf(" %d 단       |",s);
		}
		for(int s=1; s<=9; s++) {
			for(int q=2; q<=9; q++) {
				System.out.printf("%2d *%2d  = %2d|",q,s,s*q);
			}
			System.out.println("");
		}
		
		
		
		System.out.println("================연습문제3=================");
		
		/*		
		0 0 0 1
		0 0 1 0
		0 1 0 0 
		1 0 0 0
		*/
		for(int x = 1; x<5; x++) {
			for(int y = 1; y<5; y++) {
				if(x+y==5) {
					System.out.print(1+"  ");
				}
				else {
					System.out.print(0+"  ");
				}
			}
			System.out.println();
		}
	}//main
}//class
