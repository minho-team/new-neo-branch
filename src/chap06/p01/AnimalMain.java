package chap06.p01;

public class AnimalMain {

	public static void main(String[] args) {
		
		
		Animal animal = new Animal();
		
		animal.setId(1);
		animal.setKind("Tiger");
		animal.setSpecies("백두산 호랑이");
		animal.setName("호돌이");
		animal.setAge(10);
		
		
		System.out.println(animal.toString());

	}

}
