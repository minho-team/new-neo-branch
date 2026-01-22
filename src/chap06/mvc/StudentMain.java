package chap06.mvc;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentMain {

	public static final int SIZE= 2;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 학생 성적 처리 프로그램(5명) 이름,학번,국어,영어,수학,총점,평균,등급
		String[] name = new String[SIZE];
		String[] no = new String[SIZE];
		int[] kor = new int[SIZE];
		int[] eng = new int[SIZE];
		int[] math = new int[SIZE];
		
		int[] tot = new int[SIZE];
		double[] avr = new double[SIZE];
		char[] grade = new char[SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			System.out.println("name:");
			String tempString = sc.nextLine();
			if(isValidName(tempString)==false) {
				System.out.print("올바른 이름 입력해주세요\n");
				i--;
				continue;
			} 
			name[i] = tempString.trim();

			// 학번 입력
			System.out.println("no(숫자4자리만 입력):");

			no[i] = sc.nextLine();
			//국어, 영어, 수학
			kor[i] = randomInt(100,1);
			eng[i] = randomInt(100,1);
			math[i] = randomInt(100,1);
			tot[i] = kor[i]+eng[i]+math[i];
			avr[i] = tot[i] / 3.0;
			grade[i] = calGrade(avr[i]);
				
		}
	
		for (int i = 0; i < SIZE; i++) {
			System.out.printf("%s %s %d %d %d %d %.1f %c\n"
					,name[i],no[i],kor[i],eng[i],math[i],tot[i],avr[i],grade[i]);
		}
		
		
		//자원 반납
		sc.close();
		System.out.println("The end");
		
	} // end of main
	
	public static boolean isValidName(String name) {
		if(name==null) {
			return false;
		}	
		return Pattern.matches("^[가-힣]{2,5}$",name.trim());
	}
	
	public static int randomInt(int max, int min) {
		Random rand = new Random();
		
		return rand.nextInt(max)+min;
	}
	
	public static char calGrade(double avr) {
		char grade = 'F';
		
		if(avr >= 90.0) {
			grade = 'A';
		}else if(avr >= 80.0){
			grade = 'B';
		}else if(avr >= 70.0){
			grade = 'C';
		}else if(avr >= 60.0){
			grade = 'D';
		}
		
		return grade;
	}
	
	
	

}
