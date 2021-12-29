package chapter04;

import java.util.Scanner;

public class Quiz1229 {

	public static void main(String[] args) {
		//
		// 문제1) 두 개의 정수가 주어졌을 때 두 정수의 합이 자연수이면 'Natural Number'을 출력하도록 하세요.
		int a = 1;
		int b = 2;
		int c = a+b;
		
		if(c>=0) { 
			System.out.println("Natural Number");
		
		
	}
		int d = 0;
		int e = 1;
		
		if(d<e) {
			System.out.println("<");									
		}else if(d>e){
			System.out.println(">");
       } else{
    	   System.out.println("=");
       }

		
		
		double BMI = 65.7 * (1.75 * 1.75);
		if(BMI >= 30) {
			System.out.println("비만");
		}else if(BMI >= 25) {
			System.out.println("과체중");
				
			}else if(BMI >= 18.5) {
				System.out.println("정상");
		} else {
			System.out.println("저체중");
}
		Scanner scanner = new Scanner(System.in);
		
		int dan = Integer.parseInt(scanner.nextLine());

		switch(dan) {
		case 1:
			System.out.println("1 x 6 = 6");
			System.out.printf("%d X 6 = %d", 1, 1*6);
			break;
		case 2:
			System.out.printf("%d X 6 = %d", 2, 2*6);
			break;
		case 3:
			System.out.printf("%d X 6 = %d", 3, 3*6);
			break;
		case 4:
			System.out.printf("%d X 6 = %d", 4, 4*6);
			break;
		case 5:
			System.out.printf("%d X 6 = %d", 5, 5*6);
			break;
		case 6:
			System.out.printf("%d X 6 = %d", 6, 6*6);
			break;
		case 7:
			System.out.printf("%d X 6 = %d", 7, 7*6);
			break;
		case 8:
			System.out.printf("%d X 6 = %d", 8, 8*6);
			break;
			
		}
		
		
		/*
		switch(result) {
		case 2:
			System.out.println(result);
			break;
			*/
		/* 문제5) 다음과 같이 점수 범위에 따라 등급을 구분하여 해당 점수에 대한 등급을 출력하도록 하세요.
		   90점 이상 100점 이하 : A 등급,=>9X, 100
		   80점 이상 90점미만 : B 등급,=>8X
		   70점 이상 80점미만 : C 등급,=>7X
		   60점 이상 70점미만 : D 등급,=>6X
		   60점미만 : E등급
		 */
		int score = 87;
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		default :
			System.out.println("E등급");
			break;
		}
		}
		
}
