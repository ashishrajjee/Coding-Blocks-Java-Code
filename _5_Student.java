package _16OOPS;

public class _5_Student {

	String name;
	int rollNo;
	int age;
	
	public _5_Student() {
		name = "Ashish";
		rollNo = 32;
		age = 23;
	}
	
	public _5_Student(String name, int rollNo, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
	
	public void introduceYourSelf() {
		System.out.println(name + " Roll Number is " + rollNo + " and is Age " + age);
	}
}
