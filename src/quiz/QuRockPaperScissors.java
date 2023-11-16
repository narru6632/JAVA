package quiz;
/* 가위바위보게임
난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
승부를 판단하여 출력한다.
1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.
*/

import java.util.Scanner;
import java.util.Random;

public class QuRockPaperScissors {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int player = 0;
		int com = 0;

		for (int i = 0; i <= 4; i++) {
			System.out.println("무엇을 내시겠습니까?(1:가위, 2:바위, 3:보) : ");
			player = scanner.nextInt();
			com = random.nextInt(3) + 1;
			if (player <= 3 && player >= 1) {
				System.out.println("~~게임진행~~");
				switch(com){
				case 1:
					System.out.println("상대는 가위를 냈습니다");
					break;
				case 2:
					System.out.println("상대는 바위를 냈습니다");
					break;
				default:
					System.out.println("상대는 보를 냈습니다");
				}
				switch (player - com) {
				case 1:
				case -2:
					System.out.println("승리!");
					break;
				case 2:
				case -1:
					System.out.println("패배!");
					break;
				case 0:
					System.out.println("무승부!");
					break;
				default:
				}
			} else {
				System.out.println("잘못된 숫자를 입력했습니다");
			}
			if (i == 4) {
				System.out.println("5번의 게임이 끝났습니다."
						+ " 게임을 계속하시겠습니까? 재시작(1), 종료(0)");
				while (true) {
					int restart = scanner.nextInt();
					if (restart == 0) {
						System.out.println("게임이 종료되었습니다. 감사합니다.");
						System.out.println("===게임종료===");
						break;
					}
					else if(restart ==1) {
						System.out.println("===게임재시작===");
						i = 0;
						break;
					}
					else {
						System.out.println("잘못입력하셨습니다. "
								+ "재시작(1), 종료(0)중에 입력하세요");
						break;
					}
				}
			}
		} // for

	}

}
