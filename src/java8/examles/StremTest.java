package java8.examles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremTest {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1, "John"));
		list.add(new Person(2, "Smith"));
		list.add(new Person(3, "Peter"));
		list = list.stream().filter(person -> {return person.getId() > 1;}).collect(Collectors.toList());
		List<Long> idList = list.stream().map(person -> person.getId()).collect(Collectors.toList());
		System.out.println(list.size());
		System.out.println(idList);
	}
}
