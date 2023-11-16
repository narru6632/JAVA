package ex12inheritance;

class Box
{
	public void boxWrap()
	{
		System.out.println("Box로 포장합니다");
	}
}

class PaperBox extends Box
{
	public void paperWrap()
	{
		System.out.println("PaperBox로 포장합니다");
	}
}

class GoldPaperBox extends PaperBox
{
	public void goldWrap()
	{
		System.out.println("GoldPaperBox로 포장합니다");
	}
}

public class E09InstanceOf
{
	/*
	 * static void wrapBox(Box b) {} static void wrapBox(PaperBox) {} static void
	 * wrapBox(GoldPaperBox) {}
	 */

// instanceof 연산자
//	 확인할놈 instanceof(형변환목적지)
//	형변환이 가능한지 확인 후, 가능하면 true를 반환한다
//	       ㄴ(클래스간에 상속관계가 있을때 형변환이 가능함)

	// 구조
	// 최상위 클래스인 Box로 받은다음 최하위 클래스부터 형변한 여부를 확인함
	static void wrapBox(Box b)
	{
		if (b instanceof GoldPaperBox)
		{ // GoldPaperBox로 형변환되는가(다운캐스팅)
			((GoldPaperBox) b).goldWrap(); // 가능시 PaperBox/Box도 당연히 가능
		} else if (b instanceof PaperBox)
		{ // PaperBox로 형변환되는가(다운캐스팅)
			((PaperBox) b).paperWrap(); // 가능시 Box도 당연히 가능
		} else if (b instanceof Box)
		{ // 본인 클래스이므로 당연히 가능
			b.boxWrap();
		}
	}

	public static void main(String[] args)
	{
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);

		String str = new String("나는누구?");
				
//		wrapBox(str); 상속관계가 아닌 놈이 낄수있는 메서드가 아니므로 에러발생

	}
}
