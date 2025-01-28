package MethodReference;

import java.util.function.Function;

public class ArbitraryObjectMethodReference {

	public static void main(String[] args) {
		
		//LambdaExpression
		Function<String, String> lowercase = input -> input.toUpperCase();
		System.out.println(lowercase.apply("kumbakonam"));
		
		//Method Reference
		Function<String, String> uppercase = String::toLowerCase;
		System.out.println(uppercase.apply("THANJAVUR"));
		
		//LambdaExpression
		Function<String, Integer> length = input -> input.length();
		System.out.println(length.apply("AravindRavichandran"));

		//Method Reference
		Function<String, Integer> leng = String::length;
		System.out.println(leng.apply("VenkateshManalan"));
	}

}
