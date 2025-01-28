package MethodReference;

import java.util.*;
import java.util.function.Function;

public class ConstructorMethodReference {

	public static void main(String[] args) {
		
		//ClassicalWay
		List<String> list = Arrays.asList("Batman","Superman","Spiderman","Iornman","Batman");
		
		Set<String> set = new HashSet<String>(list);
		System.out.println("ClassicalWay"+set);

		//LambdaExpression
		Function<List<String>, Set<String>> lambdares = lists -> new HashSet<String>(lists);
		System.out.println("Using LambdaExpression : "+lambdares.apply(list));
		
		//MethodReference
		Function<List<String>, Set<String>> methodres = HashSet::new;
		System.out.println("Using MethodReference : "+methodres.apply(list));
	}

}
