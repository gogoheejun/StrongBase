package java8.인터페이스변화.default메서드;

public class DefaultMyClass implements MyInterface{

	String name;
	
	public DefaultMyClass(String name) {
		this.name = name;
	}
	
	@Override
	public void printName() {
		System.out.println("heejun");
	}

	public String getName() {
		return name;
	}
}
