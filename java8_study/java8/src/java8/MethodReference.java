package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReference {

	public static void main(String[] args) {
		//스태틱 메서드 참조
		UnaryOperator<String> hi = Greeting::hi;
		
		//인스턴스 메서드 참조
		Greeting greeting = new Greeting();
		UnaryOperator<String> hi2 = greeting::hello;
		
		//new생성자는 입력값은 없는데 리턴값은 있으므로 Supplier사용할수 있음.
		Supplier<Greeting> newGreeting = Greeting::new;
		newGreeting.get();
		
		//아래는 인자값 받는 생성자를 사용하고자 할 때임.
		Function<String, Greeting> HeejunGreeting = Greeting::new;
		Greeting heejun = HeejunGreeting.apply("heejun");
		System.out.println(heejun.getName());
		
		////////////////////////////////////////////////////////////////
		//Comparateor에 람다사용하기...임의객체의 인스턴스 메서드 참조
		String[] names = {"kim","lee","yang"};
//		Arrays.sort(names, (o1,o2)->0);
		Arrays.sort(names, String::compareToIgnoreCase);
		
	}
}
