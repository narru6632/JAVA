package ex18lambda;
//람다식
//인터페이스와 클래스를 활용한 일반적 오버라이딩

//추상클래스를 아래에 있는 인터페이스로 변경 가능
//abstract class ISchool1
//{
//	abstract void studyLambda(String str);
//}

interface ISchool1{
	void studyLambda(String str);
}
//인터페이스에는 추상메서드만 정의 가능, 그리고 자동으로 public abstract가 붙는다(생략되어있음)
class Student1 implements ISchool1{
	@Override
	public void studyLambda(String str) {
		System.out.println(str+"을(를) 공부합니다");
	}
}

public class Ex01NormalClass
{
	public static void main(String[] args)
	{
		ISchool1 sch = new Student1();
		sch.studyLambda("람다식");
	}
}
