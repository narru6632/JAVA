package ex12inheritance;

/*
문제4) QuRingMake.java
다음 Point클래스를 이용하여 다음 문제를 해결하시오. 
해당 문제는 상속(Inheritance)을 통해 구현하는것이 아니라 

@@@구성(Composition)@@@관계를 이용하여 해결한다. 
Point 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자. 
그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.

그래프 상에 원을 표현하기 위해선 중심점과 반지름이 필요하다. 
링을 표현하기 위해선 원 2개가 필요하다.
*/

///점을 표현한 클래스
class Point
{
	int xDot, yDot;

	public Point(int x, int y)
	{
		xDot = x;
		yDot = y;
	}

	public void showPointInfo()
	{
		System.out.println("[x좌표:" + xDot + ", y좌표" + yDot + "]");
	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle
{
	// 멤버변수
	int radian;// 반지름
	Point center;

	public Circle(int radian, int x, int y)// 반지름 초기화
	{
		// 상속관계가 아니므로 super가 필요하겠지만, 구성관계이므로 point형
		// 객체 생성이 필요하다. 매개변수 x,y를 통해 생성하면 된다
		this.radian = radian;
		center = new Point(x, y);
	}

	// 생성자

	public void ShowCircleInfo()
	{
		center.showPointInfo();
		System.out.println("반지름:" + this.radian);
	}
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring
{
	// 멤버변수
	Circle innerCircle;// 안쪽의 원
	Circle outerCircle;// 바깥쪽의 원
	// 생성자(링은 2개의 원으로 구성되므로 총 6개의 인수가 필요하다)

	public Ring(int inX, int inY, int inR, int outX, int outY, int outR)
	{
		innerCircle = new Circle(inR, inX, inY);
		outerCircle = new Circle(outR, outX, outY);
	}

	// 멤버메서드 - 링의 변수 출력
	public void showRingInfo()
	{
		System.out.println("안쪽 원의 정보 : ");
		innerCircle.ShowCircleInfo();
		System.out.println("바깥쪽 원의 정보 : ");
		outerCircle.ShowCircleInfo();

	}
}

public class QuRingMake
{
	public static void main(String[] args)
	{
		Ring c = new Ring(1, 1, 3, 2, 2, 9);
		c.showRingInfo();
	}
}
