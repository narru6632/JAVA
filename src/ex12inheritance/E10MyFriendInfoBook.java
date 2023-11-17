package ex12inheritance;

import java.util.Scanner;

class Friend
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
	public void showBasicInfo()
	{
	}
}

class HighFriend extends Friend
{// 하위클래스
	String nickname;

	public HighFriend(String name, String phone, String addr, String nickname)
	{
		super(name, phone, addr);// 상위클래스의 내용을 불러온다음
		this.nickname = nickname;// 멤버변수의 확장
	}

	@Override
	public void showAllData()
	{
		System.out.println("===고딩친구(전체정보)===");
		super.showAllData();
		System.out.println("별명 : " + nickname);
	}

	@Override
	public void showBasicInfo()
	{// 추상메서드를 오버라이딩해 원하는대로 사용
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
/////////////////////////1차작성///////////////////////	

public class E10MyFriendInfoBook
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
		FriendInfoHandler handler = new FriendInfoHandler(100);

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

class FriendInfoHandler
{
//	Friend 클래스는 상위클래스이므로 해당 타입으로 객체를 생성하면
	// 멤버클래스를 저장가능
	private Friend[] myFriends;
	//친구정보를 저장할 객체를 생성 한 후 배열에 저장할때 이넥스로 사용할
	//멤버변수로 생성자에서 0으로 초기화한다
	private int numOfFriends;

	//생성자 : 객체배열의 크기를 인수로 받은 후 초기화
	public FriendInfoHandler(int num)
	{

		myFriends = new Friend[num];
		numOfFriends = 0;
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
			myFriends[numOfFriends++] = high;
		} else if (choice == 2)
		{ // 대딩(2)선택시
			System.out.println("전공");
			iMajor = scan.nextLine();
			// 객체생성과 동시에 참조값을 추가
			myFriends[numOfFriends++] = new UnivFriend(iName, iPhone, iAddr, iMajor);
		}

		// 실행할 문장 없을지 메서드를 메모리에서 소멸되고 호출한 지점으로 돌아감
		System.out.println("친구정보 입력이 완료되었습니다.");

	}// addFriend
	/*
		친구정보를 출력하기 위한 멤버 메서드
		1.친구정보를 추가할때 high 또는 univ객체를 배열에 저장한다
		2.이떄 객체는 Friend로 자동형변환(업캐스팅)되어 저장
		3.정보출력시 배열에 입력된 객체수만큼 반복하여 각 원소를 통해 정보(멤버변수에 저장된 값)을 출력한다
		4.출력을 위한 멤버메서드는 상송ㄱ관계에서 오버라이딩 처리되어 있으므로
		참조변수의 영향을 받지않고 항상 자식객체에 오버라이딩되어 정의한 멤버메서드가 출려고딤
		5.즉 저장된 객체는 friend 타입이지만 오버라이딩을 통해 별도의 형변환이 필요하지않다, 항상 원하는 정보 출력가능
		*/
	
	//친구의 전체정보 출력
	public void showAllData() {
		for(int i=0; i<numOfFriends;i++) {
			myFriends[i].showAllData();
		}
		System.out.println("==전체정보가 출력되었습니다.==");
	}
	
	//친구의 간략정보 출력
	public void showSimpleData() {
		for(int i=0; i<numOfFriends; i++) {
			myFriends[i].showBasicInfo();
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
		
//		정보검색을 위한 반복문
//		반복문은 length만큼 반복하는것이 일반적이나
//		정보가 없는 인덱스는 0이 아닌 null 이기 때문에 배열.length를
//		사용하지 못하고 정보의 갯수를 지정한 nuofFriends 변수를 사용
		for(int i=0; i<numOfFriends; i++) {
			
//			배열의 각 인덱스에 저장된 객체의 참조값을 통해 멤버변수에 접근
//			검색을 위해 입력한 이름과 비교해서 일치하는 경우에만 정보출력
//			compare to()대신 equals()사용해도 무방
			if(searchName.compareTo(myFriends[i].name)==0) {
//				if(searchName.equals(myFriends[i].name)) {
				myFriends[i].showAllData();
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
		for(int i=0; i<numOfFriends;i++) {
			//입력된 이름과 같은지 비교
			if(deleteName.compareTo(myFriends[i].name)==0) {
				//객체배열에서 삭제 = null로 바꾸기
				myFriends[i] = null;
				//삭제된 원소의 인덱스 저장
				deleteIndex = i;
				//전체카운터 1 차감
				numOfFriends--;
				break;
			}
		}
		
		//검색 안되어 삭제하지 않았다면 -1 유지
		if(deleteIndex==-1) {
			System.out.println("==삭제된 데이터가 없습니다==");
		}
		else {
			
			//객체배열에서 검색된 원소를 삭제한 후 뒤에있는 원소들을 한칸씩 땡겨온다
//			numOFFriends는 앞에서 1 차감되므로 마지막 원소는 검색이나 출력에서 무된다
			for(int i=deleteIndex; i<numOfFriends;i++) {
				myFriends[i] = myFriends[i+1];
			}
			System.out.println("==데이터("+deleteIndex+"번)가 삭제되었습니다==");
		}
	}//deleteInfo
}





