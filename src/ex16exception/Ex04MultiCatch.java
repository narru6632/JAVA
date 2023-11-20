package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
예외처리를 할때 필요에 따라 여러개의 catch블럭을 사용

*/

public class Ex04MultiCatch
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[3];
		try
		{
			for (int i = 0; i < array.length; i++)
			{
				System.out.print("array[" + i + "]에 저장할 숫자입력:");
				array[i] = Integer.parseInt(scanner.nextLine());
			}

			System.out.println("배열에 저장된 두 숫자나누기:" + array[0] / array[1]);

			System.out.println("나이를 입력하세요");
			int age = scanner.nextInt();
			System.out.println("당신의 나이는" + age);

			array[3] = age; // << 인덱스는 2번까지만 있으므로 인덱스 초과에러 
		}

		catch (InputMismatchException e)
		{
			System.out.println("숫자로만 입력해야 합니다.");
		} catch (ArithmeticException e)
		{
			System.out.println("산술연산이 불가능 합니다 합니다.");
		} catch (NumberFormatException e)
		{
			System.out.println("숫자형태의 문자만 입력가능합니다.");
		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열의 인덱스를 초과하였습니다.");
		}
		catch(Exception e) { 
			//     ㄴ 모든 예외클래스의 부모이므로 catch절의 마지막에 기술해야함, 위로가면 에러
			System.out.println("예외가 발생하였습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace(); // 위에 기술한 에러 외의 것들을 캐치해줌
		}
		
		//앞에서 예외가 발생했어도 예외처리를 했으니 프로그램이 끝까지 실행됨
		//에러가 생겨도 프로그램이 이어지도록 하는게 예외처리의 목적이다
		System.out.println("===프로그램 끝===");
	}
}
