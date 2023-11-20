package ex15usefulclass;

//equals() 메소드
//인스턴스간의 내용비교 목적(==로 비교할 시 단순한 참조값의 비교만 이루어짐)
//참조값이 아닌 실제 내용의 비교를 위해 사용하는 메서드
//String같은 기본클래스는 오버라이딩 없이 비교가능
//새로 정의한 클래스의 인스턴스를 비교할 때는 오버라이딩 하는 것을 권장


class IntNumber{
	int num;
	public IntNumber(int num) {
		this.num = num;
	}
	
	public boolean myEquals(IntNumber numObj) {
		//매개변수로 받은 객체와 멤버변수의 값을 비교
		if(this.num==numObj.num) {
			return true;
		}
		else {
			return false;
		}
	}
}


public class E04Object2MyEquals
{
	public static void main(String[] args)
	{
		//String과 같은 기본클래스는 오버라이딩 없이 비교
		String str1 = new String("Java개발자"); 
		String str2 = "Java개발자"; //주소는 다르나 값이 같은 String 인스턴스 2개 생성
		if(str1.equals(str2)) {
			System.out.println("같은 문자열 입니다."); //값이 같으므로 이쪽 
		}
		else {
			System.out.println("다른 문자열 입니다.");
		}
		
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		if(num1.myEquals(num2)) {
			System.out.println("num1과 num2는 동일한 정수");
		}
		else {
			System.out.println("num1과 num2는 다른 정수");
		}
		
		if(num1.myEquals(num3)) {
			System.out.println("num1과 num3은 동일한 정수");
		}
		else {
			System.out.println("num1과 num3은 다른 정수");
		}
		
		
		
		
		
		
		
		
	}
}
