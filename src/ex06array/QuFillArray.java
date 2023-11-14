package ex06array;

import java.util.Scanner;

public class QuFillArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array1 = new int[10];
		for (int i = 0; i < array1.length; i++) {
			System.out.println((i + 1) + "번째 정수를 입력하세요");
			int a = scanner.nextInt();
			array1[i] = a;
		} // 1번배열

		int[] array2 = new int[array1.length];
		int t = 0;
		int q = 0;
		for (int i = 0; i < array2.length; i++) {
			if (array1[i] % 2 == 0) {
				array2[array2.length-1-t++]=array1[i];				
				}
			 else {
				array2[q++] = array1[i];
				}

		}
		

			for (int i = 0; i < array1.length; i++) {
				System.out.print(array1[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < array2.length; i++) {
				System.out.print(array2[i] + " ");
			}

		}

	}
