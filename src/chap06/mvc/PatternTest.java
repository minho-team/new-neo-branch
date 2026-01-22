package chap06.mvc;

import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		System.out.println(isValidName("홍길동"));
	}
	
	public static boolean isValidName(String name) {
		if(name==null) {
			return false;
		}
		
		return Pattern.matches("^[가-힣]{2,5}$",name.trim());
	}
	

}
