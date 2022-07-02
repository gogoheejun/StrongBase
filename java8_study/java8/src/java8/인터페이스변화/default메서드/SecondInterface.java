package java8.인터페이스변화.default메서드;

public interface SecondInterface extends MyInterface{
	
	//만약 이 인터페이스에서 MyInterface의 default 메서드인 PrinterNameUpperCase를 적용하고 싶지 않다면 이렇게 재정의
	//근데 이러면 SecondInterface를 상속하는 클래스들이 또 다 재정의해야 하긴 함..
	void printNameUpperCase();
	
	
	
}
