package _16OOPS;

import java.util.ArrayList;

public class _7_Client {

	public static void main(String[] args) {
		
		_6_Student s = new _6_Student();
		System.out.println(s);	//output = _16OOPS._6_Student@1f32e575
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list);//output = []
		
		//line 9 and 12 both are object. but, why s is printed address and list is print actual value
		//we checked deep inside then found in println function. in println statement it take object x
		//println(Object x) this is LHS and we pass RHS in line 10 println function here we pass new student object,
		//for example = println(new _6_Student()) this is RHS side
		//Object x = new _6_Student(); this is the actual meaning of upper lines
		//now println call valueOf(x) function. and valueOf me ye line likhi hui hai
		//String valueOf(Object obj) { return (obj == null) ? "null" : obj.toString(); }
		//then valueOf call toString function. and toString me ye line likhi hui hai
		//String toString() { return getClass().getName() + "@" + Integer.toHexString(hashCode()); }
		//so toString ki wajah se hame address show hota hai line 10
		
		//Student class child class ish liye hai kyun ki ishne Object ko extends kiya hai
		//to yaha Object class parent hui aur Student class child hui
		
		//aapko toString ki wajah se ye output acha nhi laga to aap change kar shkte hai apne child class matlab
		//Student class me jake. see line after 18, yaha hum matlb Child(Student) class me Parent(Object) class ka
		//function(toString) ko modify kar shkte hai, diffrent ou7put ke liye
		
		//after modification
		System.out.println(s); //null is 0 years old.
		
		//ab aap socho ki arraylist itne ache se kyu print hoti hai
		//kyuki arraylist me toString Override hoti hai
		
		
		
		
	}
}
