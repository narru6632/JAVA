package ex18lambda;


//인터페이스 정의(부모클래스로 사용)
interface ISchool2{
	void studyLambda(String str);
}
//익명클래스(람다식)를 통해 구현하므로 impletents는 필요하지않다
//즉 상속을 위한 클래스 생속이 필요하지 않다

public class Ex02AnonymousClass
{
	public static void main(String[] args)
	{
		ISchool2 sch = new ISchool2() {
			@Override
			public void studyLambda(String str) {
				System.out.println(str+"을 공부하기 위해 익명클래스를 만들어요");
			}
		};
		sch.studyLambda("람다식");
	}

}
