package MethodReference;

@FunctionalInterface
interface IAdd{
	
	public void add(int num1,int num2);
}

public class StaticMethodReference {
	
	public static void Sum(int val1,int val2) {
		System.out.println(val1+val2);
	}
	public static void main(String[] args) {
		//lambda Expression
		IAdd iadd = (num1,num2) -> System.out.println(num1+num2);
		iadd.add(5, 2);
		
		//Method Reference
		IAdd iad = StaticMethodReference::Sum;
		iad.add(8, 3);
	}

}
