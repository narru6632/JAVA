package ex07string;

public class E02StringMethod2
{
	public static void main(String[] args)
	{
		System.out.println("String클래스의 주요 메소드2");
		
		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";
		
		
		//6] codePointAt() // 문자열의 특정 인덱스 문자를 찾은 후 
						// 아스키코드(유니코드로 반환
		
		System.out.println("### 6 ###");
		System.out.println("str1 첫번째 문자의 아스키코드 : "+
				str1.codePointAt(0));
		System.out.println("str2 세번째 문자의 아스키코드 : "+
				str2.codePointAt(2));
		
		
		
		//7] endsWith() // 특정 문자열로 끝나면 true반환
		//8] startsWith() // 특정 문자열로 시작하면 false반환
		
		System.out.println("### 7,8 ###");
		System.out.println("www.daum.net".endsWith("net"));
		System.out.println("naver.com".startsWith("http"));
		
		
		//9] format() // 출력형식을 지정하여 특정 문자열의 시작인덱스를 반환한다
					//printf()와 사용법은 동일함, 주로 웹 애플리케이션 제작시 사용
		System.out.println("### 9 ###");
		System.out.printf("국어:%d,영어:%d,수학:%d\n",
				81, 92, 100);
		
		String formatStr = 
				String.format("국어:%d,영어:%d,수학:%d\n",
						81, 92, 100);
		System.out.println(formatStr);
		
		
		//10] indexOf() // 문자열에서 특정 문자열의 시작 인덱스를 반환
					//만약 존재하지 않으면 -1을 반환
				//인덱스는 항상 0부터 시작하므로 결과값이 -1 = 해당 문자열이 없다는 뜻
		
		System.out.println("### 10 ###");
		String email1 = "hong@daum.net";
//		String str1 = "Welcome to java";
		System.out.println(str1.indexOf("ava"));//12
		System.out.println(str1.indexOf("J"));//-1
		System.out.println((email1.indexOf("@")!=-1) ?
				"이메일형식맞음":"이메일형식아님");//-1
		
		
		
		
		
		
		
		
		
		
		
	}
}
