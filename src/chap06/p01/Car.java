package chap06.p01;

public class Car {
	// 맴바변수, 생성자, 게세터 ,연산, 맴변 출력
	int carNo;
	String brand;
	boolean isSuv;
	int price;
	int manufactureYear;
	double mileage;
	
	// 디폴트 생성자는 맴버변수에 디폴트 값만 세팅되게 함
	public Car() {}
	
	

	
	

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", brand=" + brand + ", isSuv=" + isSuv + ", price=" + price
				+ ", manufactureYear=" + manufactureYear + ", mileage=" + mileage + "]";
	}

	
	
	

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isSuv() {
		return isSuv;
	}

	public void setSuv(boolean isSuv) {
		this.isSuv = isSuv;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	
	
	
	
}
