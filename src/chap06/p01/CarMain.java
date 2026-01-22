package chap06.p01;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		// 자동차 객체 세팅
		car.setCarNo(20251124);
		car.setBrand("현대 팰리세이드");
		car.setSuv(true);
		car.setPrice(60_000_000);
		car.setManufactureYear(2025);
		car.setMileage(1250.5);
		
		// 자동차 객체 출력
		System.out.println(car.toString());
		
		System.out.println("The end!");
	}

}
