package com.yedam.java.ch0402;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		//for문
		
		//예제1 - 0부터 90까지 10단위로 출력
		for(int i=0; i<=90; i+=10){
			System.out.println(i);		
		}
		//예제2 - 0부터 20까지 짝수만 출력
	/*
	for(int i=0; i<=20; i+=2){
		
		continue;
		System.out.println(i);}
*/
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("숫자 5개를 입력하세요.");
	int num = Integer.parseInt(scanner.nextLine());
	 
	int sum = 0;
	 for(int i=0; i<=5; i++) {
		 System.out.println("숫자를 입력하세요.");
		 int value = Integer.parseInt(scanner.nextLine());
		 sum += value;
		 System.out.println("출력 : " + sum);
}
	 //예제4 - 1(1~10)부터 사용자가 입력한 숫자까지 합계
	 
	 
	 int max = Integer.parseInt(scanner.nextLine());
	 int sum1 =0;
	 for(int i=1; i<=max; i++) {
		  sum1 += 1;
		  sum1 += i;
	  }
	  System.out.println("1~"+ max+"까지 합 : " +sum);	 
	 
}
}