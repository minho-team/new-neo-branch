package chap06.p01;


public class StudentMain {

	public static void main(String[] args) {

		// 학생 성적 프로그램	
		Student student = new Student();
		
		student.setNo(1);
		student.setBan('c');
		student.setName("홍길동");
		student.subject[0] = 100;
		student.subject[1] = 90;
		student.attendanceRate = 99.9;
		
		// 학생 정보 계산
		int sum = student.subjectSum();
		double avr = sum/2.0;
		
		
		// 학생 정보 출력
		System.out.println(student.toString());
		System.out.printf("총점:%3d 평균: %5.1f",sum,avr);
		
	}




}
