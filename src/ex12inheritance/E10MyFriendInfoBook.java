package ex12inheritance;

import java.util.Scanner;

class Friend{//상위클래스
	/*VO(Value Object)
	  친구를 표현한 최상위 클래스, 해당프로그램에선 Friend클래스를 객체생성
	  하지않는다. 기본정보를 저장하고 상속할 목적으로만 정의된 클래스
	  이런 클래스를 VO(Value Object)라고 한다
	 */
	
	//멤버변수 이름 전화번호 주소
	String name;
	String phone;
	String addr;
	
	//인수생성자 : 멤버변수 초기화
	//굳이 직접 입력안해도 멤버변수 선언한 이후
	//우클로 생성가능
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	public void showAllData() {
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+phone);
		System.out.println("주소:"+addr);
	}
	
	//추상메서드->실행부가 없는 메서드->오버라이딩용으로 제작
	public void showBasicInfo() {}
}

class HighFriend extends Friend{//하위클래스
	String nickname;
	
	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);//상위클래스의 내용을 불러온다음
		this.nickname = nickname;//멤버변수의 확장
	}
	
	@Override
	public void showAllData() {
		System.out.println("===고딩친구(전체정보)===");
		super.showAllData();
		System.out.println("별명 : "+nickname);
	}
	@Override
	public void showBasicInfo() {//추상메서드를 오버라이딩해 원하는대로 사용
		System.out.println("===고딩친구===");
		System.out.println("별명 : "+nickname);
		System.out.println("전번 : "+phone);		
	}
}

class UnivFriend extends Friend{
	String major;
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	@Override
	public void showAllData() {
		System.out.println("===대딩친구(전체정보)===");
		super.showAllData();//상위클래스의 내용을 불러온다음
		System.out.println("전공 : "+major);//멤버변수확장
	}
	@Override
	public void showBasicInfo() {//추상변수 불러다 오버라이딩
		System.out.println("===대딩친구===");
		System.out.println("이름 : "+name);
		System.out.println("전번 : "+phone);		
	}
	
	
}
/////////////////////////1차작성///////////////////////	

public class E10MyFriendInfoBook
{
	public static void menuShow() {
		System.out.println("###### 메뉴를 입력하세요 ######");
		System.out.print("1.고딩친구입력");
		System.out.println("2.대딩친구입력");
		System.out.print("3.전체정보출력");
		System.out.println("4.간략정보출력");
		System.out.print("5.검색");
		System.out.print("6.삭제");
		System.out.println("7.프로그램종료");
		System.out.print("메뉴선택>>>>");
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		FriendInfoHandler handler = new FriendInfoHandler(100);
		
		while(ture) {
			menushow();
			
			int choice = scan.nextInt();
			switch(choice) {
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 4:
				handler.showAlldata();
				break;
			case 5:
				handler.showSimpleData();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램종료");
				return;
			}//switch
		}//while
	}//main
}//class
