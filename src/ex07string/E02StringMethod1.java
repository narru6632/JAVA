package ex07string;

public class E02StringMethod1
{
	public static void main(String[] args)
	{
		System.out.println("String 클래스의 주요 메소드1");
		
		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";
		
//		1] length()
		
		System.out.println("### 1 ###"); //띄어쓰기 포함한 길이
		System.out.println("str1의 길이 : "+str1.length());
		System.out.println("str2의 길이 : "+str2.length());
		
//		2] charA(인덱스) 인덱스 번호의 문자 출력
		
		System.out.println("### 2 ###");
		System.out.println("str의 두번째 문자 : "
				+str1.charAt(1));
		System.out.println("str의 두번째 문자 : "
				+str2.charAt(1));
		
//		3] compareTo() 두 문자열을 비교, 
//		아스키 기준으로 비교하여 앞이 크면 양수 반환, 뒤가 크면 음수반환
//		같으면 0을 반환함
		System.out.println("### 3 ###");
		String str3 = "A"; 
		String str4 = "B"; 
		System.out.println(str3.compareTo(str4)); // -1
		System.out.println(str4.compareTo(str3)); // +1
		System.out.println("ABC".compareTo("ABC")==0? // 0
				"문자열이 같다":"문자열이 다르다");
		
//		4] concat() 두 문자열을 연결, +와 같은 기능
		System.out.println("### 4 ###");
		System.out.println("JAVA".concat(" WORLD").concat(" Go"));
		System.out.println("JAVA"+"WORLD"+"GO");
		
//		5] contains() // 문자열에 특정 문자열이 포함되어 있으면 true반환
		System.out.println("### 5 ###");
		System.out.println(str1.contains("To"));
		System.out.println(str1.contains("to"));
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
