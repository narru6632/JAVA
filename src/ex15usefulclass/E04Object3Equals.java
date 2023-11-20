package ex15usefulclass;

class MyClass
{
	int data;

	public MyClass(int data)
	{
		this.data = data;
	}

	@Override
	public String toString()
	{
		return "data=" + String.valueOf(data);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof MyClass)
		{
			MyClass mc = (MyClass) obj;
			if (mc.data == this.data)
			{
				System.out.println("MyClass-멤버동일함");
				;
				return true;
			} else
			{
				System.out.println("MyClass-멤버다름");
				return false;

			} // if2
		} else
		{
			System.out.println("MyClass 객체아님");
			return false;
		} // if1
	}
}

public class E04Object3Equals
{
	public static void main(String[] args)
	{
		
		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(10);
		
		System.out.println("[두 객체를 비교연산자를 통해 비교]");
		if(mc1==mc2) {
			System.out.println("인스턴스 참조값(주소값)이 같다");
		}
		else {
			System.out.println("인스턴스 참조값(주소값)이 다르다");//[0]
		}
		
		System.out.println("[두 객체를 equals()메소드로 비교]");
		System.out.println(mc1.equals(mc2) ? "같다" : "다르다");//[같다]
		
		System.out.println("[두 객체를 toString()메소드 호출]");
		System.out.println("mc.toString()=>"+mc1.toString());
		System.out.println("mc2=>"+mc2);
	}

}
