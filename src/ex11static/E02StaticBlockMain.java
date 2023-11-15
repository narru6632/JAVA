package ex11static;

public class E02StaticBlockMain
{
	//static 블럭
	
	
	//인스턴스 멤버
	int instanceVar;
	void instanceMethod() {}
	
	//정적멤버
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}
	
	//스태틱 블럭 정의
	static { 
		//블럭내에서 정적멤버변수에 접근할 수 있다
		staticVar = 1000;
		
		/*
		블럭내에서만 사용할 수 있는 변수로서, 
		블럭 내에서는 일반변수 생성가능
		*/
		int localVar;
		localVar = 1000;
		System.out.println("localVar="+localVar);
		
		//블럭내에선 인스턴스 멤버 접근 불가//
//		System.out.println("instanceVar="+instanceVar);
//		instanceMethod();
		
		//정적변수는 사용가능//
		System.out.println("staticVar="+staticVar);
		staticMethod();
		
		System.out.println("======static block 끝======");
	}
	
	
	public static void main(String[] args) {
		System.out.println("===메인메소드==");
//		System.out.println("localVar="+localVar);
		//static블럭 내에서 선언된 변수 = 지역변수 이므로
		//main에서는 사용 불가능
	}
	
	
	
	
}
