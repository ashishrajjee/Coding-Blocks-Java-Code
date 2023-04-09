package _16OOPS;

public class _4_Client {

	public static void main(String[] args) {
		
		_3_Student s1 = new _3_Student();
		s1.name = "Rahul";
		s1.age = 18;
		
		_3_Student s2 = new _3_Student();
		s2.name = "Rakesh";
		s2.age = 38;
		
		s1.introduceYourSelf();
		s2.introduceYourSelf();
		
		s1.sayHi("Ashish");
		s1.sayHi2("Rakesh", s2);
		
		
	}
	
	
}
