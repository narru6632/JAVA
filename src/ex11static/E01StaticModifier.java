package ex11static;

/*
@static variable(정적변수)
static 키워드를 붙인 멤버변수
프로그램 시작되는 시점에 초기화 됨
main메서드 실행전에 이미 초기화 되니, main에서 별도 선언없이 변수사용가능

@접근방법
클래스내부 - 변수명으로 접근가능(일반적인 멤버변수와 동일)
클래스 외부 - 
1. 객체의 참조변수를 타고 호출(권장 x) 
     ㄴ이미 static영역에 존재하고있는데 또 힙 영역에 자리(객체)를 만드는게 비효율적(호출을 2번함)
2. 객체생성 하지않고 클래스명을 통해 접근한다(권장사항)

@static method
메서드 앞에 static을 붙이면 정적 메서드가 된다, 정적변수와 동일한 성질

*/
class MyStatic{
	//멤버변수 : 인스턴스형 멤버 변수는 반드시 클래스에 객체생성 후 
	//참조변수를 통해 접근해야 한다, 즉 일반적인 멤버변수는 객체를생성
	//하는 시점에 메모리에 로드된다(멤버변수는 method영역, 객체는 heap영역)
	int instanceVar;
	//정적멤버변수 : 객체 생성할 필요없이 바로 접근가능
	//java프로그램 시작시 이미 메모리(method영역)에 로드되어있음
	static int staticVar; // static변수

	
	//인스턴스형 멤버메서드 : 인스턴스형 메서드에서는 모든멤버 사용가능
	// 인스턴스형 멤버, 정적멤버 둘다 접근이 된다
	void instanceMethod() {
		System.out.println("instanceVar="+instanceVar);
		System.out.println("staticVar="+staticVar);
		staticMethod();
	}
	//정적 멤버 메서드 : 정적매서드 내부에서는 인스턴스형 멤버에 접근불가,
	//정적멤버에만 접근이 가능하다 
	static void staticMethod() {
//		System.out.println("instanceVar="+instanceVar);
		//ㄴ스태틱메서드는 인스턴스형 멤버를 접근 불가능하므로 에러발생
		System.out.println("staticVar="+staticVar);
//		instanceMethod();
	}
	
}

public class E01StaticModifier
{
	public static void main(String[] args)
	{
		MyStatic myStatic = new MyStatic();
		myStatic.instanceVar = 100; // 인스턴스 변수 >new를 통해 호출
		System.out.println("myStatic.instanceVar="+myStatic.instanceVar);
		
		MyStatic.staticVar = 200; // new가 불필요
		System.out.println("MyStatic.staticVar="+MyStatic.staticVar);
		
		/*
		정적 변수도 일반적인 멤버변수처럼 참조변수를 통해 접근가능 하지만
		java에선 권장되지 않는다.
		(그럴꺼면 static를 쓸 의미가 없음)
		*/
		myStatic.staticVar = 300; //굳이 참조변수로 static을 불러온 상황
		System.out.println("myStatic.staticvar"+myStatic.staticVar);
		
		///////////////////////////////////////////////////////
		
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		
		ms1.instanceVar = 100; //인스턴스 변수는 저장영역이 서로 다르므로
		ms2.instanceVar = 1000; // 값이 다르게 출력됨
		System.out.println("ms1.instanceVar="+ms1.instanceVar);//100
		System.out.println("ms2.instanceVar="+ms2.instanceVar);//1000
		
		ms1.staticVar = 800; // 스태틱 변수는 스태틱공간 딱 한군데에 저장이 되므로
		ms2.staticVar = 900; // 마지막값만 적용이됨
//		MyStatic.staticVar = 800; 괜히 위쪽처럼 참조변수로 static을 
//		MyStatic.staticVar = 900; 호출하지않고 이렇게 바로 호출하면 이해쉬움
		System.out.println("ms1.staticVar="+ms1.staticVar);//900
		System.out.println("ms2.staticVar="+ms2.staticVar);//900
		
		myStatic.instanceMethod();
		myStatic.staticMethod(); //스태틱을 참조변수를 통해 호출해 경고가뜸
		
//		MyStatic.instanceMethod(); // 스태틱 메서드는 인스턴스멤버에 접근불가능 - 에러
		MyStatic.staticMethod();
				
		
		
		
		
		
		}
}
