package com.tom;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Hello world");
		int age = 18;
		System.out.println(age);
		float height = 1.8f;
		String name = "Angela";
		int grade = 1;
		float weight = 66.2f;
		System.out.println(height);
		System.out.println(name);
		System.out.println(grade);
		System.out.println(weight);*/
		
		Person p = new Person(67.2f, 1.8f);
		p.weight = 67.2f;
		p.height = 1.8f;
		System.out.println(p.bmi());
		p.hello();
		//Person hank = new Person();
		
		String name = "Hank";
		int english = 70;
		int math = 90;
		System.out.println(name + "\t" + english + "\t" + math + "\t" + (english+math)/2);
//		Person jack = null;
//		jack.hello();
		
	}

}
