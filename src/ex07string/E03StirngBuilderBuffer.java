package ex07string;

public class E03StirngBuilderBuffer
{
	public static void main(String[] args)
	{
		
		//String 수정 시 id주소값(참조값)이 바뀌는가?
		// >> 수정을 가하는 순간 주소값이 바뀌기 때문에
		//수정할 예정이 있다면 StirngBuffer를 사용하는것이 좋다
		//(수정해도 주소값 안바뀜,버퍼크기만 변화)
		StringBuffer strBuf = new StringBuffer("AB");
		strBuf.append(25);
		strBuf.append("Y").append(true);
		System.out.println("strBuf="+strBuf);
		
		strBuf.insert(2, false);
		strBuf.insert(strBuf.length(),'Z');
		System.out.println("strBuf="+strBuf);
		
		System.out.println("String과 StringBuffer의 "+"참조값 비교");
		String str1 = "Java&JSP";
		String str2 = "Java&JSP"; // str1,str2 주소 동일
		if(str1==str2) 
			System.out.println("연결전:주소값동일");
		else 
			System.out.println("연결후:주소값다름");
		
		str1 = str1 + "&Spring";
		if(str1==str2) 
			System.out.println("연결전:주소값동일");
		else 
			System.out.println("연결후:주소값다름"); // str1수정되어 주소값 변경됨
		
		StringBuffer buf = new StringBuffer();
		System.out.println("buf="+buf); // StirngBuffer는 주소가 변형되지 않은채로 새 문자열을 
		System.out.println("저장된 문자열크기:"+buf.length());//받아 버퍼크기만 증가
		System.out.println("기본버퍼크기:"+buf.capacity());
		
		buf.append("Java 공부중..");
		System.out.println("buf="+buf);
		System.out.println("저장된 문자열크기:"+buf.length());
		System.out.println("기본버퍼크기:"+buf.capacity());
		
		buf.append("금일은 StirngBuffer 학습중..!!");
		System.out.println("buf="+buf);
		System.out.println("저장된 문자열크기:"+buf.length());
		System.out.println("기본버퍼크기:"+buf.capacity());
		
	}
}
