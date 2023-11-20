package quiz;

import java.util.Random;
import java.util.Scanner;

/*
업다운게임을 메소드를 이용해 구현한다.
컴퓨터는 1~100사이의 숫자 하나를 생성한다.
총 시도횟수는 7번을 부여한다.
사용자는 7번의 시도안에 숫자를 맞춰야 한다.
사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
함수를 사용하여 구현한다.
무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.

*/
public class QuUpDownGame {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		boolean end = false;

		while (true) {
			int comnum = random.nextInt(100) + 1;
			System.out.println(comnum);
			for (int i = 0; i < 7; i++) {
				System.out.println("1~100사이의 추측한 숫자를 입력해 주세요 : ");
				int plnum = scanner.nextInt();

				if (plnum == comnum) {
					System.out.println("===성공했습니다===");
					System.out.println("다시 도전하겠습니까?");
					end = true;
					break;
				} else if (plnum > comnum) {
					System.out.println("up");
				} else {
					System.out.println("down");
				}
			}

			if (end == false) {
				System.out.println("===실패했습니다===");
				System.out.println("다시 도전하겠습니까?");
			}

			while (true) {// 못 맞추고 7번째 도달
				System.out.println("재시작 = 1 / 종료 = 0");
				int restart = scanner.nextInt();
				if (restart == 1) {
					System.out.println("===재시작합니다===");
					break;
				} else if (restart == 0) {
					System.out.println("===종료합니다===");
					return;
				} else {
					System.out.println("올바른 값을 입력하세요");
				}
			}

		}
	}

}
