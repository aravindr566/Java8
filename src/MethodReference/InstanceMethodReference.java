package MethodReference;

interface IVanakam{
	public void vanakam(String name);
}

public class InstanceMethodReference {
	
	public void greet(String names) {
		System.out.println("Vanakam "+names);
	}

	public static void main(String[] args) {
		
		//Lambda Expression
		IVanakam ivan = (name) -> System.out.println("Vanakam "+name);
		ivan.vanakam("Aravind from LambdaExpression");
		
		//Method Reference
		InstanceMethodReference obj = new InstanceMethodReference();
		IVanakam iva = obj::greet;
		iva.vanakam("Karthik from MethodReference");

	}

}
