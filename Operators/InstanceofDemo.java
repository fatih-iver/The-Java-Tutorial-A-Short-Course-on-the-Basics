
class Parent{}
interface MyInterface {}
class Child extends Parent implements MyInterface {}

public class InstanceofDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Null is not an instance of anything
		
		Parent obj1 = new Parent();
		Parent obj2 = new Child();
		
		System.out.println("obj1 instancof Parent:" 
				+ (obj1 instanceof Parent));
		
		System.out.println("obj1 instancof Child:" 
				+ (obj1 instanceof Child));
		
		System.out.println("obj1 instancof MyInterface:" 
				+ (obj1 instanceof MyInterface));
		
		System.out.println("obj2 instancof Parent:" 
				+ (obj2 instanceof Parent));
		
		System.out.println("obj2 instancof Child:" 
				+ (obj2 instanceof Parent));
		
		System.out.println("obj2 instancof MyInterface:" 
				+ (obj2 instanceof MyInterface));
		
		
	}

}

