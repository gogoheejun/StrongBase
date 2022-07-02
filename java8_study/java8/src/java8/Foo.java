package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Foo {

	public static void main(String[] args) {
		//Function<T,R>은 입력값 1개로 T타입을 받고, 리턴으로 R을 리턴함.
		//BiFunction<T,U,R>도 있는데 입력값 2개로 T,U타입을 받고, 
		Function<Integer, Integer> plus10 = (i)-> i+10;
		Function<Integer, Integer> multiply2 = (i)-> i*2;
		Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
		
		
//		System.out.println(plus10.apply(1));
//		System.out.println(multiply2AndPlus10.apply(2));
//		System.out.println(plus10.andThen(multiply2).apply(2));
		
		
		
		//Consumer는 입력값은 받지만 리턴을 하지 않음.================================
		Consumer<Integer> printT = (i)->System.out.println(i);
		printT.accept(10);
		
		
		//Supplier<T>는 T타입의 값을 제공함======================================
		Supplier<Integer> get10 = ()->10;
//		System.out.println(get10.get());
	
		
		//Predicate<T>는 T타입을 받고 boolean을 리턴함======================================
		Predicate<String> startsWithKim = (s) ->s.startsWith("Kim");
		Predicate<Integer> isEven = (i)-> i%2 == 0;
		

	}

}












