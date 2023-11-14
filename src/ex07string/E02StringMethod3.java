package ex07string;

public class E02StringMethod3
{
	public static void main(String[] args)
	{
		
		System.out.println("String 클래스의 주요 메소드3");
		
		String str1 = "Welcome to java";
		
		// 11] lastIndexOf() indexOf와 동일하지만 뒤에서부터 확인함
		
		System.out.println("### 11 ###");
		System.out.println(str1.lastIndexOf("ava"));//12
		System.out.println(str1.lastIndexOf("J"));//-1
		System.out.println("indexOf : "+str1.indexOf("a"));//12
		
		
		// 12] replace 특정 문자열을 찾아서 지정된 문자열로 변환함, 없어도 에러발생 x
		
		System.out.println("### 12 ###");
		System.out.println("J를 G로 변경하기");
		System.out.println(str1.replace("J","G"));
		System.out.println("java를 Korea로 변경하기");
		System.out.println(str1.replace("java","Korea"));
		
		
		// 13] split() 문자열을 구분자를 통해 분리해서 String타입의 배열로 반환함
			// 해당 구분자가 없는 경우에는 크기가 1인 배열로 반환함
		
		System.out.println("### 13 ###");
		String phoneNumber = "010-1234-5678";
		String[] phoneArr = phoneNumber.split("-");
		for(int i=0; i<phoneArr.length; i++) {
			System.out.printf("phoneArr[%d]=%s\n", i, phoneArr[i]);
		}
		phoneArr = phoneNumber.split("%");
		for(int i=0; i<phoneArr.length; i++) {
			System.out.printf("phoneArr[%d]=%s\n",
					i, phoneArr[i]);
		}
		
		// 14] substring()
		
		System.out.println("### 14 ###");
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
		
		
		
		
	}
}
