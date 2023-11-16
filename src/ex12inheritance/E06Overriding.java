package ex12inheritance;

/*
오버라이딩 : 클래스가 상속관계에 있을때 하위클래스에서 상위클래스의 멤버메서드와
완전히 동일한 모양으로 재정의 하는 것을 말함
오버로딩과 다른점은 매개변수의 갯수, 반환타입등이 완전히 똑같은 형태로 재정의 하는것
하위클래스에서 오버라이딩한 메서드는 상위클래스의 메서드를 가리게 되므로
항상 최하위 클래스에서 오버라이딩한 메서드가 호출된다
*/


class Speaker{//부모 클래스
	private int volumnRate;
	
	//volumnRate가 private이므로 setter메서드 정의
	public void setVolumn(int vol) {
		volumnRate = vol;
	}
	public void showState() {//상속관계에서 오버라이딩을 목적으로 정의한 메서드
		System.out.println("스피커의 볼륨크기 : "+volumnRate);
	}
}
class BaseSpeaker extends Speaker{//자식 클래스
	private int baseRate;
	//베이스 기능을 확장하고 설정을 위한 setter정의
	public void setBase(int bas){
		baseRate = bas;
	}
	@Override // 어노테이션 이라 부름, 오버라이딩된 메서드에 추가하여
//				컴파일러에게 알려주는 역할, 필수아니라 생략가능
	public void showState() {
		//super를 통해 부모클래스에 정의된 멤버메서드 호출,
//		특히 오버라이딩된 메서드를 호출할떄 super가 없으면 재귀호출이 되므로 주의
		super.showState();//<<"스피커의 볼륨크기 : +volumnRate 
		System.out.println("베이스의 볼륨크기 : "+baseRate);
		//재귀호출 = 함수 내부에서 함수가 자기 자신을 또다시 호출하는 행위
		//를 의미합니다. 자기가 자신을 계속해서 호출하므로, 끝없이 반복
	}
	
}

public class E06Overriding
{
	public static void main(String[] args)
	{
		BaseSpeaker baseSpeaker = new BaseSpeaker();
		baseSpeaker.setVolumn(30);
		baseSpeaker.setBase(20);
		baseSpeaker.showState();
		
		System.out.println();
		
		Speaker speaker = new BaseSpeaker();
		//부모클래스의 참조변수로 자식클래스의 객체를 참조하는 경우(상속이라 가능)
//		단, 부모 참조변수로 자식객체를 참조하면 접근범위가 부모객체로 제한된다
		speaker.setVolumn(10);
//		speaker.setBase(40); // 자식객체에 있는 멤버메서드이므로 접근 불가능
		
		//showState는 상속관계에서 오버라이딩한 메서드.
//		부모로 자식을 참조했을때 접근범위는 부모로 제한되지만
//		오버라이딩 당한 메서드가 있으며 항상 자식쪽이 출력된다
		speaker.showState(); //ctrl클릭시 부모 클래스로 가지만 결과는 오버라이딩된 자식의것
		
		
	}
}
