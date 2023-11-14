package ex07string;

public class E02StringMethod4
{
	public static void main(String[] args)
	{
	/*
	시나리오] 주민등록번호를 이용하여 성별을 판단하는
	프로그램을 charAt()을 이용해서 작성하시오.
	190419-3000000 => 남자
	190419-4000000 => 여자
	*/
		System.out.println("#### 시나리오 #1 ####");
		String juminnum = "190419-3000000";
				//주민번호로 주어진 문자열의 8번째 문자가(index(7))
				//성별을 결정, 이때 문자를 비교해야 하므로
				//싱글 쿼테이션()을 사용함
		if (juminnum.charAt(7)=='1' || juminnum.charAt(7)=='3') {
			System.out.println("남성입니다");
		}
		else if (juminnum.charAt(7)=='2' || juminnum.charAt(7)=='4') {
			System.out.println("여성입니다");
		}
		else if (juminnum.charAt(7)=='5' || juminnum.charAt(7)=='6') {
			System.out.println("외국인입니다");
		}
		else {
			System.out.println("주민번호가 잘못되었습니다");
		}
	
	
	/*
	시나리오] 해당 문자열이 이메일 형식인지 검사하는
	프로그램을 contains()를 이용해서 작성하시오.
	hong@daum.net => 이메일형식임
	not@naver => 이메일형식이아님
	*/
	System.out.println("#### 시나리오 2 ####");
	String email1 = "hong@daum.net";
	String email2 = "hong@naver";
	
	// 이메일에 @와 .이 동시에 포함된 경우에만 이메일형식이라 볼 수 있다
	if(email1.contains("@") && email1.contains(".")) {
		System.out.println("이메일 형식입니다.");
	}
	else {
		System.out.println("이메일 형식이 아닙니다.");		
	}
	if(email2.contains("@") && email2.contains(".")) {
		System.out.println("이메일 형식입니다.");
	}
	else {
		System.out.println("이메일 형식이 아닙니다.");		
	}
	System.out.println();
		
		
		
		
	/*
	시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
	이용해서 작성하시오.
	*/	
	
	System.out.println("#### 시나리오 #3 ####");

	int index = juminnum.indexOf("-") +1;
	
	if (juminnum.charAt(index)=='1' || juminnum.charAt(index)=='3') {
		System.out.println("남성입니다");
	}
	else if (juminnum.charAt(index)=='2' || juminnum.charAt(index)=='4') {
		System.out.println("여성입니다");
	}
	else if (juminnum.charAt(index)=='5' || juminnum.charAt(index)=='6') {
		System.out.println("외국인입니다");
	}
	else {
		System.out.println("주민번호가 잘못되었습니다");
	}

	
	
	
	
	/*
	시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
	작성하시오. 
	파일명 : 2023.03.30.르세라핌.안티프레져.mp3
	*/
	System.out.println("### 시나리오 4 ###");
	//파일명은 중간에 .(닷)이 몇개든 들어갈 수 있으므로 뒤에서부터 //를 찾아야한다
	
	String filename = "2023.03.30. 르세라핌.안티프레져.mp3"; 
	int beginIndex = filename.lastIndexOf('.')+1;
	System.out.println("파일의 확장자는 : "
			+ filename.substring(beginIndex));	
	}
	
}
