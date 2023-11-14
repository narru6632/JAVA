package ex07string;

import java.util.Scanner;





public class QuValidatedld {
	
	static boolean idcheck(String inputId) {
		
		boolean check=true;
		
		if(inputId.length()>12 || inputId.length()<8) { //길이체크
			check = false;
		}
		else {
			for(int i=0;i<inputId.length();i++) {
				char idChar = inputId.charAt(i);
				if((idChar>='a'&&idChar<='z')||(idChar>='0'&&idChar<='9')) {
					check = true;
				}
				else {
					check = false;
					break;
				}
			}//for
		}//if
		return check;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		String name = scanner.next();
		System.out.println(name);
		
		
		
		if(idcheck(name)==true) {
		System.out.println("사용할 수 있는 아이디입니다.");
		}
		else {
			System.out.println("사용할 수 없습니다.");
		}
	}
}
