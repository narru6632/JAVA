package ex11static;

/*
싱글톤 디자인 패턴
클래스를 설계하는 디자인 패턴의 하나로써 하나의 인스턴스 즉
하나의 메모리를 생성해 이를 공유해서 사용하고자 할 떄 쓰는 패턴

작성방법
	1. 생성자의 접근지정자를 private로 선언한다
	2. 클래스 외부에서는 생성자에 접근할 수 없으므로 new를 통해 객체생성은 할 수 없다
	3. 클래스 내부에 정적메서드로 해당 클래스의 참조값을 반환하도록 정의한다
	 	주로 getInstance()메서드로 작성한다.
	4. 위 방법을 통해 객체를 사용하면 메모리에 딱 하나의 객체만 만들어지게 된다
*/

//일반적 클래스의 정의
class NoSingleTone{
	int instVar;
	//생성자는 대부분 public선언 
	//            ㄴ클래스 외부에서 new로 객체생성을 위함
	public NoSingleTone() {}
}

class SingleTone{
	int shareVar;
	
	//프로그램이 시작될때 static변수는 미리 메서드영역에 로딩되어 
	//사용할 준비를 마치게된다.
	private static SingleTone single = new SingleTone();
	
	/*
	 생성자를 private으로 선언하면 클래스 외부에서는 호출할 수 없으므로
	 new를 통해 객체를 생성할 수 없게 된다.
	 */
	private SingleTone() { // default 생성자의 private화	
	}
	
	/*
	 정적메서드로 선언된 getInstance()를 통해 해당 객체(참조값)를 외부로
	 반환한다. 이런 함수를 "유틸리티 메서드"라고 한다,
	 */
	public static SingleTone getInstance() {
		return single;
	}
	
	//멤버변수 출력용 멤버메서드
	void print() {
		System.out.println(String.format("shareVar=%d", shareVar));
	}
}

public class E03SingleToneDesignPattern
{
	public static void main(String[] args)
	{
		NoSingleTone nst1 = new NoSingleTone();
		nst1.instVar = 100;
		System.out.println("nst1="+nst1); // 일반적방식의 객체 생성이라
												
		NoSingleTone nst2 = new NoSingleTone();//객체 생성시 마다 새로운 참조값(주소)를
		nst1.instVar = 200;
		System.out.println("nst2="+nst2);//할당받는 인스턴스가 된다
		
		
		
		
//		SingleTone st1 = new SingleTone(); private이므로 객체생성 불가
		//static 메서드 이므로 클래스 명으로 직접 호출하자
		SingleTone st2 = SingleTone.getInstance();
		st2.shareVar = 100;
		st2.print();
		
		SingleTone st3 = SingleTone.getInstance();
		st3.shareVar = 200;
		st3.print();
		//
		
		System.out.println(String.format("st2의주소:%s",st2));
		System.out.println(String.format("st3의주소:%s",st3));
		
		System.out.println(String.format("st2의 shareVar:%d",st2.shareVar));
		System.out.println(String.format("st3의 shareVar:%d",st3.shareVar));
		
		
	}

}
