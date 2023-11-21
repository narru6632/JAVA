package ex17collection;
//ex12 / E10MyFriendInfoBook.java << 배열로 만들었던걸 가져와서 list형으로 수정

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

abstract class Friend
{// 상위클래스
	/*
	 * VO(Value Object) 친구를 표현한 최상위 클래스, 해당프로그램에선 Friend클래스를 객체생성 하지않는다. 기본정보를 저장하고
	 * 상속할 목적으로만 정의된 클래스 이런 클래스를 VO(Value Object)라고 한다
	 */

	// 멤버변수 이름 전화번호 주소
	String name;
	String phone;
	String addr;

	// 인수생성자 : 멤버변수 초기화
	// 굳이 직접 입력안해도 멤버변수 선언한 이후
	// 우클로 생성가능
	public Friend(String name, String phone, String addr)
	{
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}

	public void showAllData()
	{
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phone);
		System.out.println("주소:" + addr);
	}

	// 추상메서드->실행부가 없는 메서드->오버라이딩용으로 제작
	abstract public void showBasicInfo();
}

class HighFriend extends Friend
{// 하위클래스
	String nickname;

	public HighFriend(String name, String phone, String addr, String nickname)
	{
		super(name, phone, addr);// 상위클래스의 내용을 불러온다음
		this.nickname = nickname;// 멤버변수의 확장
	}

	@Override //추상메서드 상속이 아니므로 오버라이딩은 선택사항
	public void showAllData()
	{
		System.out.println("===고딩친구(전체정보)===");
		super.showAllData();
		System.out.println("별명 : " + nickname);
	}

	@Override
	public void showBasicInfo()
	{// 추상메서드를 오버라이딩(추상메서드 상속이라 필수)해 원하는대로 사용
		System.out.println("===고딩친구===");
		System.out.println("별명 : " + nickname);
		System.out.println("전번 : " + phone);
	}
}

class UnivFriend extends Friend
{
	String major;

	public UnivFriend(String name, String phone, String addr, String major)
	{
		super(name, phone, addr);
		this.major = major;
	}

	@Override
	public void showAllData()
	{
		System.out.println("===대딩친구(전체정보)===");
		super.showAllData();// 상위클래스의 내용을 불러온다음
		System.out.println("전공 : " + major);// 멤버변수확장
	}

	@Override
	public void showBasicInfo()
	{// 추상변수 불러다 오버라이딩
		System.out.println("===대딩친구===");
		System.out.println("이름 : " + name);
		System.out.println("전번 : " + phone);
	}

}
///////////////////////// 추가 작성 시작 ///////////////////////	

//해당 프로그램에서 기능을 담당하는 클래스를 핸들러 혹은 매니저 클래스라고 한다

class FriendInfoHandler{
//	//멤버변수	
//	private Friend[] lists;
//	private int numOfFriends;
	
//	기존 객체배열에 저장하던 방식을 List컬렉션으로 변경한다
//	우리는 배열과 동일한 특성을 가지고있는 ArrayList<E>롤 객체를 생성해
//	해당 컬렉션에는 Friend타입의 객체를 저장할 것이므로 상속관계가 있는
//	객체는 모두 저장할 수 있다
//	또한 List컬렉션은 인덱스가 존재하긴 하나, 자동 인덱싱을 지원하므로
//	인덱스 저장을 위한 변수는 필요하지 않다
	
	private ArrayList<Friend> lists;
	
	//생성자 - List컬렉션 초기화
	public FriendInfoHandler() {
		
		lists = new ArrayList<Friend>();
	}
	
	//친구정보를 추가하기 위한 멤버메서드
		public void addFriend(int choice)
		{
			//기본정보를 먼저 입력받는다
			Scanner scan = new Scanner(System.in);
			String iName, iPhone, iAddr, iNickname, iMajor;
			System.out.println("이름:");
			iName = scan.nextLine();
			System.out.println("전화번호:");
			iPhone = scan.nextLine();
			System.out.println("주소:");
			iAddr = scan.nextLine();

			if (choice == 1) // menu서 받아옴
			{
				System.out.println("별명"); // 고딩(1)선택시
				iNickname = scan.nextLine();// 객체생성후 참조변수에 저장
				HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
				// 참조값을 객체배열에 추가, 0번 인덱스부터
				lists.add(high);
			} else if (choice == 2)
			{ // 대딩(2)선택시
				System.out.println("전공");
				iMajor = scan.nextLine();
				// 객체생성과 동시에 참조값을 추가
				lists.add(new UnivFriend(iName, iPhone, iAddr, iMajor));
			}

			// 실행할 문장 없을지 메서드를 메모리에서 소멸되고 호출한 지점으로 돌아감
			System.out.println("친구정보 입력이 완료되었습니다.");

		}// addFriend
	
		
		
		//친구의 전체정보 출력
		//일반 for문을 통해 접근할때는 인덱스를 이용한다
		//인덱스를 통한 접근을 할때는 get()메서드를 사용한다
		public void showAllData() {
			for(int i=0; i<lists.size();i++) {
				lists.get(i).showAllData();
			}
			System.out.println("==전체정보가 출력되었습니다.==");
		}
		
		
		//친구의 간략정보 출력
		//확장된 for문을 통해 접근할 때에는 인덱스가 필요하지 않고
		//단순히  컬렉션에 저장된 객체의 갯수만큼 자동으로 반복하게된다. 
		//즉 fr이라는 참조변수에 0번 인덱스의 객체부터 마지막까지의 객체가 대입되게 된다
		public void showSimpleData() {
			for(Friend fr : lists) {
				fr.showBasicInfo();
			}
			System.out.println("==간략정보가 출력되었습니다==");
		}
		
		
		//주소록검색
		
		public void searchInfo() {
			//검색한 정보가 존재하는지 확인하는 변수
			boolean isFind = false;
			Scanner scan = new Scanner(System.in);
			System.out.println("검색할 이름을 입력하세요: ");
			String searchName = scan.nextLine();
			
			//Iterator를 통한 검색기능 구현
			//1. 컬렉션을 통해 이터레이터 객체를 생성합니다
			Iterator<Friend> itr = lists.iterator();
			//2. 원소(객체)가 있는지 확인
			while(itr.hasNext()) {
			//3. 있다면 next()를 통해 객체의 참조값을 추출한다.
				/*
				하지만 next 를 두번 호출하면 그 다음 객체로 넘어가버리게 되므로
				while루프 내에서 한번만 호출해야 정상적으로 출력된다
				*/
				Friend fr = itr.next();
				if(searchName.compareTo(fr.name)==0) {
					fr.showAllData();
					System.out.println("**귀하가 요청하는 정보를 찾았습니다**");
					isFind = true;
				}
			}
			//검색하는 정보가 없을 시
			if(isFind == false)
				System.out.println("***찾는 정보가 없습니다***");
		}//end of searchInfo
		
		
		//주소록 삭제
		public void deleteInfo() {
			Scanner scan = new Scanner(System.in);
			System.out.println("삭제할 이름을 입력하세요:");
			String deleteName = scan.nextLine();
			/*
			배열의 원소 중 삭제된 원소의 인덱스값을 저장하기 위한 변수
			원소를 삭제한 후 빈자리를 채워넣을 떄 사용
			배열의 인덱스는 0부터 시작이므로 -1로 초기화
			
			*/
			int deleteIndex = -1;
			
			//삭제할 객체를 찾기위해 저장된 데이터 개수만큼 반복
			for(Friend fr : lists) {
				//입력된 이름과 같은지 비교
				if(deleteName.compareTo(fr.name)==0) {
					//객체배열에서 삭제 = null로 바꾸기
					lists.remove(fr);
					//삭제된 원소의 인덱스 저장
					deleteIndex = 1;
					//전체카운터 1 차감
					break;
				}
			}
			
			//검색 안되어 삭제하지 않았다면 -1 유지
			if(deleteIndex == -1) {
				System.out.println("==삭제된 데이터가 없습니다==");
			}
			else {
				System.out.println("==데이터가 삭제되었습니다==");
			}
		}//deleteInfo
		
}
public class Ex07MyFriendInfoBook
{
	// 매개변수가 없고 반환 타입도 없는 메서드
	// ㄴ 프로그램에서 메뉴를 출력하느 ㄴ용도로 사용
	// main()\메서드에서 직접호출하기 위해선 해당 메서드도 static으로 선언해야함
	public static void menuShow()
	{
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

	// 메인메서드는 프로그램의 시작점이므로 복잡한 로직의 구성보다는
//	프로그램의 전반적인 흐름에 대해서만 기술하는것이 좋다, 따라서 선택한
//	메뉴에 따라 핸들러클래스의 메서드만 호출하는 형태로 구현되어있다
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		FriendInfoHandler handler = new FriendInfoHandler();

		while (true)
		{
			menuShow();

			int choice = scan.nextInt();
			switch (choice)
			{
			case 1:
			case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램종료");
				return;
			}// switch
		} // while
	}// main
}// class






