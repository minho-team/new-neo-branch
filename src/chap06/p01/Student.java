package chap06.p01;

import java.util.Arrays;

public class Student {

	String name;
	int[] subject;
	int no;
	char ban;
	double attendanceRate; 
	
	
	public Student() {
		no = 0;
		name="";
		ban =0;
		subject = new int[2];
		attendanceRate = 0.0;
	}
	
	
	public int subjectSum() {
		int total = 0;
		for (int i = 0; i < subject.length; i++) {
			total += subject[i];
		}
		return total;
	}
	
	
	


	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + Arrays.toString(subject) + ", no=" + no + ", ban=" + ban
				+ ", attendanceRate=" + attendanceRate + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getSubject() {
		return subject;
	}

	public void setSubject(int[] subject) {
		this.subject = subject;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public double getAttendanceRate() {
		return attendanceRate;
	}

	public void setAttendanceRate(double attendanceRate) {
		this.attendanceRate = attendanceRate;
	}

	public char getBan() {
		return ban;
	}

	public void setBan(char ban) {
		this.ban = ban;
	}
	
}
