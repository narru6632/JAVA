package ex04controlstatement;

import java.io.IOException;

public class QuNumberYN
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("하나의 문자를 입력하세요 : ");
		int num = System.in.read();
		System.out.print(num<=57&&num>=48 ? "숫자입니다":"문자입니다");
	}
}