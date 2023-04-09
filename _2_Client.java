package _16OOPS;

public class _2_Client {

	public static void main(String[] args) {
		
		_1_Student s = new _1_Student();
		
		System.out.println(s.name);
		System.out.println(s.age);
		
		s.name = "Ashish";
		s.age = 23;
		
		System.out.println(s.name);
		System.out.println(s.age);
		
		_1_Student s1 = s; // pass address of s to s1
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		s1.name = "Tannu";
		
		System.out.println(s.name);		//see both line 25 and 26 print statement
		System.out.println(s1.name);	
		
		_1_Student s2 = new _1_Student();	//create new refrence/address
		
		s2.name = "Raju";
		
		System.out.println(s2.name);		//see both line 25 and 26 print statement
		System.out.println(s1.name);
		
		_1_Student s3 = new _1_Student();
		s3.name = "Rahul";
		s3.age = 18;
		
		_1_Student s4 = new _1_Student();
		s4.name = "Rakesh";
		s4.age = 38;
		
		test1(s3, s4);
		System.out.println(s3.name + " " + s3.age);
		System.out.println(s4.name + " " + s4.age);
		
		test2(s3, s4);
		System.out.println(s3.name + " " + s3.age);
		System.out.println(s4.name + " " + s4.age);
		
	}
	// this address change on local variable, so when this method destroy all changes will be destroy
	public static void test1(_1_Student s3, _1_Student s4) {

		_1_Student temp = s3;
		s3 = s4;
		s4 = temp;
	}
	// this function change name and age in global variable so, all change apply after destroy this function
	public static void test2(_1_Student s3, _1_Student s4) {

		String name = s3.name;
		s3.name = s4.name;
		s4.name = name;
		
		int age = s3.age;
		s3.age = s4.age;
		s4.age = age;
	}
	
}
