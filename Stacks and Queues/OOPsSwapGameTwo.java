public class OOPsSwapGameTwo {
	public static class Person { 
		int age;
		String name;
		
		void saysHi() { 
			System.out.println(name + "[" + age + "]" + " says hi to you");
		}
	}

	public static void main(String[] args) {
	
		Person p1 = new Person(); 
		p1.age = 10;
		p1.name = "A";
		
		
		Person p2 = new Person();
		p2.age = 20;
		p2.name = "B";
		
		
		p1.saysHi();
		p2.saysHi();
		swap2(p1, p2);
		p1.saysHi();
		p2.saysHi();

	}
	
	public static void swap2(Person prs1, Person prs2) {
		int temp = prs1.age;
		prs1.age = prs2.age;
		prs2.age = temp;
		
		String name = prs1.name;
		prs1.name = prs2.name;
		prs2.name = name;
		
	}

}

