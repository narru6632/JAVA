package ex12inheritance;
//다형성


//부모클래스
class Parent{
	int parentMember;
	void parentMethod() {
		System.out.println("부모의 메서드:parentMethod()");
	}
}

//자식클래스
class Child extends Parent{
	int childMember;
	void childMethod() {
		System.out.println("자식의 메서드:childMethod()");
	}
	@Override
	void parentMethod() {
		System.out.println("자식에서 Overriding한 메서드"
				+ "parentMethod()");
	}
	void parentMethod(int childMember) {
		this.childMember  = childMember;
		System.out.println("Overloading:자식에서 확장한 메서드" + "parentMethod(int childMember)");
		
	}
}


public class E11Polymorphism
{
	public static void main(String[] args)
	{
		System.out.println("[자식으로 자식객체 참조 - 동질화]");
		Child homeChild = new Child();
		homeChild.childMember = 10;
		homeChild.parentMember = 100;
		homeChild.childMethod();
		homeChild.parentMethod(1000);
		homeChild.parentMethod();
		
		System.out.println("[부모로 자식객체 참조 - 이질화]");
		Parent parent1 = homeChild;
		parent1.parentMember = 1;
//		parent1.childMember = 1;
		parent1.parentMethod();
		
		//부모 참조변수로 자식객체를 참조한 두번째 변수 생성
		Parent parent2 = homeChild;
		parent2.parentMember = 1;
		parent2.parentMethod();
		
//		부모로 자식에 접근하려면 강제형변환 해야한다
//		parent2를 child로 자식타입으로 형변환 후 멤버변수에 접근해야함
//		(Child)parent2.chileMember = 1; << 에러발생
		((Child)parent2).childMember = 1;
		((Child)parent2).childMethod();
		((Child)parent2).parentMethod();
		
//		자식타입으로 현변호나 이후에 해당 참조변수를 통해 자식멤버에 접근한다
//		위와 동일한 방법이다
		Child child2 = (Child)parent2; // int a = (int)3.14와 동일한 방식
		child2.childMember = 1;
		child2.childMethod();
		child2.parentMethod(1);
		
		/*
		java에서 생성한 모든 클래스는 직/간접적으로 Object클래스를 상속.
		따라서 모든 객체는 Object의 참조변수로 참조가 가능하다. 또한 Object크ㄹ래스에
		정의된 모든 메서드를 별도의 선언 없이 사용할 수 있다.
		*/
		System.out.println("[클래스의 끝판왕 Object]");
		Object object = new Child();
		((Parent)object).parentMethod();
		
		
		
	
	}
}
