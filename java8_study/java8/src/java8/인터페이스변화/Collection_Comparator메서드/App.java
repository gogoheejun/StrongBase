package java8.인터페이스변화.Collection_Comparator메서드;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class App {
	public static void main(String[] args) {
		List<String> name = new ArrayList<>();
		name.add("lee");
		name.add("kim");
		name.add("park");
		name.add("yang");
		
//		name.forEach(System.out::println);//인자로 Consumer가 들어감
		
		//==================================================
		//=======================Spliterator=============================
		//얘는 쪼개서 순환하는 기능
		Spliterator<String> spliterator = name.spliterator();
		Spliterator<String> spliterator1 = spliterator.trySplit();//이케 trySplit을 하면 위에서 spliterator가 가지고 있던 애들이 반으로 쪼개짐.

		while(spliterator.tryAdvance(System.out::println));//다음요소가 없으면 false가 리턴됨.얘도 인자가 Consumer임.
		System.out.println("=====================");
		while(spliterator1.tryAdvance(System.out::println));
		
		//=>출력:
		/*
		 * park
			yang
			=====================
			lee
			kim
			*/
		
		
		/////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////
		Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
//		name.sort(compareToIgnoreCase.reversed().thenComparing());
		
	}
}















