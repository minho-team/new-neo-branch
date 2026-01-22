package chap06.p01;

public class Animal {

	int id;
	String kind; // 무슨 동물인지
	String name;
	int age;
	String species; // 종

	public Animal() {
	}
	

	@Override
	public String toString() {
		return "Animal [id=" + id + ", kind=" + kind + ", name=" + name + ", age=" + age + ", species=" + species + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

}
