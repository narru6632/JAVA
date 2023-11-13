package ex05method;

public class E06LocalVariable
{
	public static void main(String[] args)
	{
		boolean scope = true;
		
//		int num =9; main지역에서 num 선언시 더 좁은 지역인 if문에서는 선언불가
		if(scope) {
			int num = 1;
			num++;
			System.out.println("첫번째 if문 지역:"+num);
		}
		else {
			int num = 5;//if와 else블럭은 서로 다른지역이므로 동일한 이름의 변수 선언 가능
			System.out.println("첫번째 if문의 else지역:"+num);
		}
		int num = 100;//if와 else의 num은 지역블럭을 벗어나는 순간 소멸하므로 재 선언 가능
		System.out.println("main메소드 지역"+num);
		
		simpleFunc();
		
		System.out.println("main메소드 끝");
	}
	static void simpleFunc() {
		int num = 1000;
		System.out.println("simple메소드지역:"+num);
		
	}
}
