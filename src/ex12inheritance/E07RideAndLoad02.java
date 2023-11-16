package ex12inheritance;

public class E07RideAndLoad02
{
	public static void main(String[] args)
	{
		//System.err.print >> 뻘건색으로 출력
		System.err.println("Child형 참조변수로 Child객체 참조");
		
		//자식클래스의 참조변수로 자식클래스 객체를 참조하는 일반적 방식
		DeChild child = new DeChild("율곡이이", 59, "00학번");
		
		//오버라이딩 처리된 메서드들(가림)
		child.exercise(); 
		child.sleep(); 
		child.printParent();
		//참조변수 상관없이 항상 자식쪽 메서드가 출력됨
		
		//자식이 확장한 메서드, 부모쪽엔 아예 없음
		child.study();
		//부모쪽 protected 메서드
		child.walk();
		//자식쪽에서 오버로딩한 메서드
		child.walk(25);
		
		DeChild.staticMethod();
		////////////////////////////////////////////////////////////
		System.err.println("Parent형 참조변수로 Child객체 참조");
		DeParent parent = new DeChild("퇴계이황", 35, "99학번");
		
		//오버라이딩 됐던 메서드들(가려짐)
		parent.exercise();
		parent.sleep();
		parent.printParent();
		//
		
		
		
		//부모쪽이 자식쪽 객체를 참조하더라도 부모클래스 영역을 벗어날 수 없기때문에
		//자식쪽 클래스를 호출할 수 없다.
		
		//자식이 확장한 메서드, 부모쪽엔 없음
//		parent.study();//없으니 에러, 자식메서드엔 접근 불가능
		
		//자식에게 오버라이딩 됐던 메서드
		parent.sleep();//가려진 상태라 자식이 오버라이딩한 상태로 출력됨
		
		//자식이 오버로딩한 메서드, paren.walk()와 별개
//		parent.walk(20);//부모가 자식 메서드에 접근 불가능
		
		
		
		//static메서드는 오버라이딩이 안되니 별도로 호출해줘야함
		DeParent.staticMethod();
		//static메서드이면서 Deparent로 마지막 호출했으니 Deparent상태로 출력
		
		
		
	}
}
