package ex07string;

public class E01StringBasic
{
	public static void main(String[] args)
	{
		int num1 = 10, num2 = 20;
		String numResult = (num1==num2)?"데이터가같다":"데이터가다르다";
		System.out.println("비교결과:"+numResult);
		
		//String클래스의 객체 생성 방법1
		// new를 이용한다, new를 이용해 문자열 객체 (인스턴스)를 생성하여
		// 동일한 문자열도 항상 새로운 메모리를 할당하게 된다(서로 다른 참조값=주소 생성)
	
		
		String str1 = new String("Hello JAVA");
		String str2 = new String("Hello JAVA");
		
		
		
		// 아래 str1, st2는 String객체의 참조 주소값을 비교하게 됨
		
		if(str1==str2) {
			System.out.println("str1과 str2는 참조주소 같음");
		}
		else {
			System.out.println("str1과 str2는 참조주소 다름");
		}
		
		//Object라는 클래스에서 상속받은 메서드 equals
		//주소값이 아닌 실제 저장된 문자열(데이터값)을 비교하는 메서드
		
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 동일하다");
		}
		else {
			System.out.println("두 문자열은 다르다");
		}
		
		//String클래스의 객체 생성 방법1
				// ""를 이용한다, ""를 이용해 문자열을 생성하면
				// 기존에 동일한 내용의 문자열이 있을 시 주소값을 동일하게 할당함
		
		
		
		String str3 = "자바개발자"; 
		String str4 = "자바개발자";
		
		System.out.println("equlas()메소드로 문자열비교:"+ 
				str3.equals(str4));
				
		
		if(str3==str4) { //""로 생성시 데이터값이 같으면 같은주소
			System.out.println("주소가 같다"); // 따라서 주소가 같다고 표기됨
		}
		else {
			System.out.println("주소가 다르다");
		}
		
		System.out.println("the end..!!");
	}
}
