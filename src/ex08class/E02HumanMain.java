package ex08class;

import java.util.Iterator;

public class E02HumanMain
{
	//Human클래스를 별도의 파일로 작성한 상태에서
//	동일한 패키지에 정의되었다면 컴파일러는 해당 클래스를 찾아 즉시 
//	객체(인스턴스)화 할 수 있다.
//	만약 다른 패키지에 선언된 클래스라면 반드시 import선언을 해야한다
	public static void main(String[] args)
	{
		Human human = new Human();
		
		human.name = "마이클";
		human.age = 28;
		human.energy = 4;

		human.showState();
		human.eating();
		human.walking();
		human.thinking();
		human.showState();
		
		for (int i = 1; i < 29; i++)
		{
			 human.walking();
		}
		human.showState();
		
		for (int i =1 ; i <=20; i++)
		{
			human.eating();
		}
		human.showState();
	}
}
