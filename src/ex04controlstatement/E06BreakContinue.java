package ex04controlstatement;

public class E06BreakContinue
{
	public static void main(String[] args)
	{
		
//		while(true) {
//			break;
//			//break이후로 있는 문장은 에러발생(unreachable code) 실행될 수 없는 문장
//		}
		int i=0;
		
//		while(i==0) {
//			System.out.println("가나다");
//			continue;
//		} //반복문이 끝나지 않아 무한히 반복되는 문장
		

//		 break와 continue를 사용할땐 항상 조건문과 같이 사용해야 한다,
//		그렇지 않으면 하위 코드가 쓰레기 코드(unreachable code가) 되기 십상이기 때문
		
		while(true) {
			i++;
			System.out.printf("[i가 %d일때]\n",i);

			System.out.println("continue이전 출력문");
			if(i%2==0) continue;
			System.out.println("continue이전 출력문");

			System.out.println("break이전 출력문");
			if(i==3) break;
			System.out.println("break이전 출력문");
		}
		
		for(int x=1; x<=5; x++) {
			System.out.println("x="+x);
			for(int y=1; y<=5; y++) {
				System.out.println("y="+y);
				if(y==3) break;
			}
		}
		
		
		
		
	}
}
