public class OOPsSwapGameOne {
	
	public static class Person { 
		int age;
		String name;
		
		void saysHi() { 
			System.out.println(name + "[" + age + "]" + " says hi to you");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(); 
		p1.age = 10;
		p1.name = "A";
		
		
		Person p2 = new Person();
		p2.age = 20;
		p2.name = "B";
		
		
		p1.saysHi();
		p2.saysHi();
		swap1(p1, p2);
		p1.saysHi();
		p2.saysHi();
	}
	
	//nothing changes 
	public static void swap1(Person prs1, Person prs2) {
		Person temp = prs1;
		prs1 = prs2;
		prs2 = temp;
	}
	
	

}

