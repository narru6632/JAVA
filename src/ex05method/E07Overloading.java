package ex05method;

public class E07Overloading
{
	
	//메서드 오버로딩 : 동일한 이름의 메서드를 2개이상 호출하는것
	//매개변수로 함수를 구분한다
	static void person(int juminNum, int milNum) {
		System.out.println("군필자 이시군요");
		System.out.println("주민번호:" + juminNum);
		System.out.println("군번: "+milNum);
	}
	
		
	
	
	//리턴값 유무와 상관없이 
	//메서드명 + 매개변수가 같을 경우 같은 함수로 인식하기 때문에
	//아래의 두 함수는 같이 쓸 수 없다(반환값을 출력할지 아닐지 결정 불가능) 
	static void person(int juminNum) {
		System.out.println("미필자이거나 여성이시군요");
		System.out.println("주민번호"+juminNum);
	}
//	static int person(int juminNum) {
//		System.out.println("미필자이거나 여성이시군요");
//		System.out.println("주민번호"+juminNum);
//		return 1;
//	}
	
	public static void main(String[] args)
	{	//매개변수가 두개인 person메서드 호출
		person(12345, 7890123);
		System.out.println("==================================");
		//매개변수가 한개인 person메서드 호출
		person(987654);
	}
	
}
