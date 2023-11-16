package ex12inheritance;

/*
Has-A관계 - 상속보다 구성관계로 표현하기 적합함
X Has a Y -> X가 Y를 소유한다 / 끊어지기 쉬운 관계이므로 상속이 부적합함

구성관계 = 클래스의 멤버로 다른 객체를 사용하는것
*/
class Gun
{
	int bullet;

	public Gun(int bNum)
	{
		bullet = bNum;
	}

	public void shutGun()
	{
		System.out.println("탕!");
		bullet--;
	}
}

class Police
{
	int handCuffs;
	Gun gun;

	public Police(int bNum, int hCuff)
	{
		handCuffs = hCuff;
		
		//권총의 보유여부 초기화
		//bNum(총알개수)로 판단
		if (bNum <= 0)
		{
			gun = null;
		} else
		{
			gun = new Gun(bNum);

		}
	}
	public void putHandcuff() {
		System.out.println("수갑을 채움");
		handCuffs--;
	}
	public void shut() {
		if(gun==null) {
			System.out.println("보유한 권총 없음");
		}
		else {
			gun.shutGun();
		}
	}
}

public class E05HasAComposite
{
	public static void main(String[] args)
	{
		System.out.println("===경찰1===");
		Police police1 = new Police(5, 3);
		police1.shut();
		police1.putHandcuff();
		
		System.out.println("===경찰2===");
		Police police2 = new Police(0, 3);
		police2.shut();
		police2.putHandcuff();
	}
}
