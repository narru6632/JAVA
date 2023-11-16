package ex12inheritance;

/*
상속관계에서 오버로딩 vs 오버라이딩

오버로딩 : 메서드명은 같으나 매개변수가 달라 서로 다른 메서드,
			상속받은 하위클래스에도 전부 포함됨
			
오버라이딩 : 상위클래스의 메서드를 아예 가려버리므로 참조변수의 타입에 영향x
*/
class A{
	public void rideMethod() {
		System.out.println("A의 rideMethod");
	}
	public void loadMethod() {
		System.out.println("A의 loadMethod");
	}
}

class B extends A{
	//public B() {super();} // 디폴트생성자 생략된 상태
	
	
	@Override
	public void rideMethod() {//상위클래스에 정의된 메서드와 이름,매개변수,리턴값전부 동일
		System.out.println("B의 rideMethod"); //오버라이딩된 메서드
	}
	public void loadMethod(int num) {//상위클래스에 정의된 매서드와 매개변수 다름
		System.out.println("B의 loadMethod"); // 오버로드된 메서드
	}
}

class C extends B{
	@Override
	public void rideMethod() {//위와 동일
		System.out.println("C의 rideMethod");
	}
	public void loadMethod(double num) {//위와동일
		System.out.println("C의 loadMethod");
	}
}

public class E07RideAndLoad01
{
	public static void main(String[] args)
	{
		A ref1 = new C();
		B ref2 = new C();
		C ref3 = new C();
		
		System.out.println("오버라이딩 처리된 메소드");
		ref1.rideMethod(); //0 //참조변수에 상관없이 전부 최하위에 오버라이딩된
		ref2.rideMethod(); //0 //메서드가 가림
		ref3.rideMethod(); //0
		
		System.out.println("오버로딩 처리된 메소드");
		//C타입, 최하위클래스라 상속받은 AB전부 접근가능
		ref3.loadMethod(); 
		ref3.loadMethod(1); 
		ref3.loadMethod(1.1); 
		
		//B타입, 하위클래스인 C클래스에 접근불가능
		ref2.loadMethod(); 
		ref2.loadMethod(1);
//		ref2.loadMethod(1.1);// 매개변수가 double형 << C타입
		
		//A타입, 하위클래스인 B,C클래스에 접근 불가능
		ref1.loadMethod(); 
//		ref1.loadMethod(1); //매개변수가 int형 << B타입
//		ref1.loadMethod(1.1); //매개변수가 double형 << C타입
		
		
		
		/////////////////////////////////////////////////////////
		/////////다운캐스팅/////////////
		
		//부모 참조변수로 자식 객체를 참조할 수 있다.
		//좌측변수는 부모, 우측객체는 자식이므로 모두 가능
		A refNum1 = new B();
		A refNum2 = new C();
		B refNum3 = new C();
		
		C refAddr1 = new C();  // 좌 우측 모두 동일한 타입이므로 참조가능
		B refAddr2 = refAddr1; // B타입->C타입 : 참조가능
		A refAddr3 = refAddr1; // A타입->C타입 : 참조가능
		
		/*
		참조변수 refId1이 (하위)C객체를 참조하고 있지만, 
		참조만 할뿐 원래는 A타입(상위)클래스 이므로
		자식으로 부모를 참고하는 것은 불가능 하기에 아래 2문장은 에러발생함
		*/
		A refId1 = new C(); //A->C : 참조가능
//		B refId2 = refId1; // B->A : 에러발생
//		C refId3 = refId1; // B->A : 에러발생
		
//		같은 원리로
		//int a = 10.0; //은 에러가난다, 10.0=double형 이므로 하위타입인 int가 참조불가능 
		double b = 0; //은 받아들여서 b=0.0이 된다, double이 0=int형보다 상위타입이므로 참조가 되는것
//		   ㄴ이것이 자동형변환 원리
		int c = (int)3.14; //이렇게 강제형변환(다운캐스팅)을 해줘야 
						//하위타입(클래스)가 상위타입(클래스)를 참조가능
		
		////다운캐스팅////
		//상속관계일때만 사용가능, 상위클래스를 하위클래스로 강제로 바꾸는것
		//기존 강제형변환처럼 (강제로 바꿀 클래스)를 앞에 써주면 된다
		B refId2 = (B)refId1;
		C refId3 = (C)refId1;
	}
}
