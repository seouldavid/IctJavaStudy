package com.ict.day05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 국어 영어 수학  점수 받고 총접 평균 구하고 계속할까요?
		Scanner scan = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double average = 0;
		int option = 0;
		while(true) {
			
			System.out.print("국어 점수를 입력하시오: ");
			kor = scan.nextInt();
			
			System.out.print("영어 점수를 입력하시오: ");
			eng = scan.nextInt();
			
			System.out.print("수학 점수를 입력하시오: ");
			math = scan.nextInt();
			sum = kor + eng + math;
			average = sum/3;
			System.out.println("총점: " + sum);
			System.out.println("평균: "+ average );
			System.out.print("계속하시겠습니까? (yes ->1 no ->2) : ");
			option = scan.nextInt();
			if (option == 1) {
				continue;
			} else if (option == 2) {
				break;
			} else {
				System.out.print("계속하시겠습니까? (yes ->1 no ->2) : ");
				option = scan.nextInt();
			}
		}
		
		

	}

}
