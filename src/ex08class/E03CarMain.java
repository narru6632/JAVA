package ex08class;

class Car
{
	String carModel; // 멤버 변수, 차량 모델명/소유주
	Human owner; // 소유주를 표현한 멤버변수는 Human 타입으로 정의되었다

	/*	
	우리가 직접 작성한 클래스는 객체를 표현하기 위한 용도로 생성하지만
	JAVA에서는 하나의 자료형으로 사용된다, 즉 객체를 표현한 또 하나의 자료형을 생성
	하는것이 class를 작성하는 목적이 된다		
	*/
	
//	초기화 메서드 1 :  매개변수가 없는 형태로 항상 고정된 값으로만 객체를 초기화
//						확장성이 없는 형태이다
	void initialize()
	{
		carModel = "람보르기니";
		owner = new Human();
		owner.name = "스티브로져스";
		owner.age = 30;
		owner.energy = 10;
	}

//	초기화 메서드 2 : 위와 동일한 이름의 메서드로 오버로딩에 의해 정의한다.
//	초기화를 진행하는 역할은 동일하나 매개변수를 통해 다양한 값으로 초기화 할 수 있다.

	void initialize(String model, int year, String name, int age, int energy)
	{
		carModel = model;
		// 다른 객체가 멤버변수로 정의 되었으므로, 객체를 생성한 후 각각의
		// 멤버변수를 초기화 해야한다.
		owner = new Human();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}

// 객체의 현재 상태를 출력하는 메서드
	void showCarInfo()
	{
		System.out.println("[차량정보]");
		System.out.printf("모델명:%s\n", carModel);
		owner.showState();
	}
}// car class

public class E03CarMain
{
	public static void main(String[] args)
	{
		/*
		 * 자동화 객체 1 생성 : 매개변수가 없는 초기화 메서드를 호출하여 람보르기니로 초기화한다
		 */
		Car car1 = new Car();
		car1.initialize();
		car1.showCarInfo();
		/*
		 * 자동화 객체 2 생성 : 객체를 생성할때마다 멤버변수를 초기화해야 하므로 코드의 중복이 많아지게됨 << 코드의 낭비가 심함 / 비효율적 /
		 * 실무사용 X
		 */
		Car car2 = new Car();
		car2.carModel = "벤틀리";
		car2.owner = new Human();
		car2.owner.name = "토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		car2.showCarInfo();

		/*
		 * 자동화 객체 3 생성 : 매개변수가 있는 초기화 매서드를 사용하여 객체를 생성함 이 경우 매개변수를 통해 다양한 값을 전달 할 수 있으므로
		 * 여러형태의 객체 생성가능 해당파일에서는 가장 효율적
		 */
		Car car3 = new Car();
		car3.initialize("스포츠카", 2012, "성유겸", 8, 10);
		car3.showCarInfo();

		Car car4 = new Car();
//		car4.showCarInfo(); << 객체를 생성만 하고 초기화 하지 않아서 예외가 발생함,
//		객체는 초기화를 하고 사용해야 한다,.		
	}
}
