package chapter04;

import java.util.Scanner;

public class Quiz12292 {

	public static void main(String[] args) {
		// 트리 만들기
		/*
		 * for(int i=1; i<=5; i++) { { } for(int a=1;a<=i;a++) { System.out.print("*");
		 * }
		 * 
		 * System.out.println(); }
		 */
		String tree = "";
		for (int i = 1; i <= 5; i++) {
			tree = tree + "*";
			// tree += "*";
			System.out.println(tree);
		}
		//
		/*
		 * int count = 0;
		 * 
		 * for(int i=1; i<=100; i++) { if(i%2 == 0) { continue;
		 * 
		 * //count = += 1; //count++;
		 * 
		 * 
		 * } count = count + 1;
		 * 
		 * 
		 * 
		 * } System.out.println("홀수의 건수 :"+count); }
		 */
		// 문제 3
		/*
		 * Outter : for(int x=1; x<=10; x++){ for(int y=1; y<=10; y++) { if(4*x + 5*y ==
		 * 60) { System.out.printf("(%d, %d )\n", x, y); break Outter; } //문제 4 /*do {
		 * }while();>기본적 do while 형태
		 */

		int value = 0;
		do {
			value = (int) (Math.random() * 10) + 1;
			System.out.println(value);
		} while (value != 7);
		// 문제 5

		int totalCount = 0;
		while (true) {
			// 두개의 숫자 -> 주사위를 던진 랜덤한 값
			int x = (int) (Math.random() * 6) + 1;
			int y = (int) (Math.random() * 6) + 1;
			totalCount++;
			// 두개의 숫자를 더한 값이 5가 아닐 경우에만 반복
			int result = x + y;
			if (result == 5) {
				System.out.printf("(%d , %d)\n", x, y); // break; <바로 거는거
				System.out.printf("주사위를 던진 횟수 : " + totalCount);
				break;// <걸기 직전
			}
		}

		// 167p 문제7

		//int dan = Integer.parseInt(scanner.nextLine());
		
		boolean run =true;
		int balance = 0;//금액도 밖에다 빼놈 안에다가 선언하면 사라졌다가 새로생기는 구조 초기화 되도 되면 안에다 선언
		Scanner scanner = new Scanner(System.in);//여러개 선언하면 오류남 그러니 밖에다 빼놈
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------");
			System.out.print("선택>");
			int menuNo = Integer.parseInt(scanner.nextLine());
			
			switch(menuNo) {
			case 1://예금
				System.out.print("예금액>");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2://출금
				System.out.print("출금액>");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3://잔고
				System.out.print("잔고>" + balance);
				break;
			case 4://종료
				run = false;
				break;
			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
			
			}
			
			
		}
		System.out.println("프로그램 종료");
	}

	{
	}
}
