package java8.examles;

import java.util.StringJoiner;
public class StringJoinerTest {

	public static void main(String[] args) {
		StringJoiner name = new StringJoiner(",", "[", "]");
		name.add("Raj");
		name.add("John");
		StringJoiner country = new StringJoiner(";", "{", "}");
		country.add("India");
		country.add("USA");
		StringJoiner merged = country.merge(name);
		System.out.println(merged.toString());
	}
}
