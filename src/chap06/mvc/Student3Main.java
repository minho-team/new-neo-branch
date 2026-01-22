package chap06.mvc;

import java.util.Random;
import java.util.Scanner;

public class Student3Main {

	public static final int SIZE = 5;
	public static final int INPUT = 1, CALCULATE = 2, OUTPUT = 3, EXIT = 4;

	public static Scanner sc = new Scanner(System.in);
	

	
	//main
	public static void main(String[] args) {
		
		Student[] stuArray = new Student[SIZE];
		
		
		for (int i = 0; i < stuArray.length; i++) {
			stuArray[i] = new Student();
		}

		boolean exitFlag = false;

		while (!exitFlag) {
			switch (menuDisplay()) {
			case INPUT:
				inputStudent(stuArray);
				break;
			case CALCULATE:
				printStudent(stuArray);
				break;
			case OUTPUT:
				printStudent(stuArray);
				break;
			case EXIT:
				System.out.println("종료");
				exitFlag = true;
				break;

			default:
				System.out.println("잘못입력");
				break;
			}
		}

		System.out.println("The end");

	}// ~main

	// 학생 정보 연산 및 정보 출력
	private static void printStudent(Student[] stuArray) {
		for (int i = 0; i < SIZE; i++) {
			int total = stuArray[i].getKor() + stuArray[i].getEng() + stuArray[i].getMath();
			double avr = total / 3.0;
			char grade = calGrade(avr);

			System.out.printf("%s %s %d %d %d %d %.1f %c\n", stuArray[i].getName(), stuArray[i].getNo(),
					stuArray[i].getKor(), stuArray[i].getEng(), stuArray[i].getMath(), total, avr, grade);
		}

	}

	// 학생 정보 입력
	private static void inputStudent(Student[] stuArray) {
		for (int i = 0; i < SIZE; i++) {
			System.out.println("name:");
			String tempString = sc.nextLine();

			stuArray[i].setName(tempString);

			// 학번 입력
			stuArray[i].setNo(String.valueOf(randomInt(9999, 1000)));
			// 국어, 영어, 수학
			stuArray[i].setKor(randomInt(100, 1));
			stuArray[i].setEng(randomInt(100, 1));
			stuArray[i].setMath(randomInt(100, 1));

		}
	}

	// 메뉴선택 화면
	public static int menuDisplay() {

		System.out.printf("1.INPUT 2.CALCULATE 3.OUTPUT 4.EXIT\n");
		System.out.println("메뉴 선택:");
		return Integer.parseInt(sc.nextLine());
	}

	// 랜덤숫자
	public static int randomInt(int max, int min) {
		Random rand = new Random();

		return rand.nextInt(max) + min;
	}

	// 등급 계산
	public static char calGrade(double avr) {
		char grade = 'F';

		if (avr >= 90.0) {
			grade = 'A';
		} else if (avr >= 80.0) {
			grade = 'B';
		} else if (avr >= 70.0) {
			grade = 'C';
		} else if (avr >= 60.0) {
			grade = 'D';
		}

		return grade;
	}

}
