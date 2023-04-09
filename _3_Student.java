package _16OOPS;

public class _3_Student {

	String name;
	int age;
	
	public void introduceYourSelf() {
		System.out.println(name + " is " + age +" years old.");
	}
	
	public void sayHi(String name) {
		System.out.println(this.name + " says hi to " + name);
	}
	
	public void sayHi2(String name, _3_Student s) {
		System.out.println(this.name + " says hi to " + name);
		s.introduceYourSelf();
	}
}
