package chap06.mvc;

public class Student {

	//1.맴변
	String name;
	String no;
	int kor;
	int eng;
	int math;
	int[] score;
	//2.생성자
	public Student() {
		this.score = new int[3];
		this.no = "c반";
	}
	
	//3.개새터
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	//4.출력 toString

	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
}
