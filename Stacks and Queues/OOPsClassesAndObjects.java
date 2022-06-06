public class OOPsClassesAndObjects {
	public static class Person { // person class
		int age;
		String name;
		
		void saysHi() { // method or function
			System.out.println(name + "[" + age + "]" + " says hi to you");
		}
	}
	
	public static void main(String[] args) {
		//object of person class
		Person p1 = new Person(); // new keyword used for making object 
		p1.age = 10;
		p1.name = "A";
		p1.saysHi(); // function function calling
		
		Person p2 = new Person();
		p2.age = 20;
		p2.name = "B";
		p2.saysHi();
		
		Person p3 = p1;
		p3.age = 30;
		p3.saysHi();
		p1.saysHi();
		
		//total 3 references p1, p2, p3
		//total 2 instances
	}
}
