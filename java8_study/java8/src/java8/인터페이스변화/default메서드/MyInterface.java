package java8.인터페이스변화.default메서드;


public interface MyInterface {


	void printName();
	
	//MyInterface를 상속하는 클래스가 이 함수를 구현하지 않아도 괜찮음.
	default void PrintNameUpperCase() {
		System.out.println(getName().toUpperCase());
	}
	
	String getName();
}
