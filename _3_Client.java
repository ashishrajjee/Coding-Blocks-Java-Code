package _20Inheritance;

public class _3_Client {

	public static void main(String[] args) {
	
		System.out.println("----------Case 1---------------");
		//Case 1
		_1_Parent_Class p = new _1_Parent_Class();			//here p store refrence of parent class(LHS)
		System.out.println(p.d);							//and create object/instance of parent class(RHS)
		System.out.println(p.d1);
		p.fun();
		p.fun1();											//jaise hi line 9 run hogi, aapka main jo hai wo run hone se pahle
															//parent class ke blue print ko heap wale memory me load kar dega
		//when u write code compiler works on LHS 			//aise hi line 21,54 and 64 ke Parent aur Child Class heap me pahle hi load ho jayenge
		//    or Complier looks LHS side
		//when code will be run then 1st execute RHS
		
		System.out.println("\n----------Case 2---------------");
		//Case 2
		_1_Parent_Class p2 = new _2_Child_Class(); 		//here p2 store refrence of parent class(LHS) and create object/instance of Child class(RHS)
														//here p2 parent class type ka mana jayega
		System.out.println(p2.d);						//line 23, 25, 28 and 30 works fine because compiler knows p2 is
		System.out.println(((_2_Child_Class)p2).d);		//Parent Class type. So, we can excess all p2 data members without any error.
		System.out.println(p2.d1);						//line 26 and 31 generate error because compiler don't knows d2 and fun2 data member in parent class
//		System.out.println(p2.d2);						//but when code will be run then 1st execute RHS. So, we inislize all data members of child class.
		System.out.println(((_2_Child_Class)p2).d2);	//but compiler knows only parent class data members. So, How can we resolved errors ????
		p2.fun();										//line 27 and 32, we type cast in child class. So, p2 is looks like child class, now no any error.
		((_1_Parent_Class)p2).fun();					//typecasting sirf aur sirf compiler ko chup karane ke liye hai aur ishka koi kaam nhi
		p2.fun1();										//here child class and parent class have same data members. resolved this problem due to refrence.
//		p2.fun2();										//line number 21 p2 store refreance of parent class. So, print parent class data memeber's value
		((_2_Child_Class)p2).fun2();					//child and parent data members are some. if you want to print child class data members
														//then you need to typecasting, see line number 23 and 24				
														
		//"Data Members" alag tarike se resolved honge aur "Function" alag tarike se
		//matlab "Data Members" refrence ke basis pe resolved honge (p2 store refreance of parent class So, print parent class data memeber's value)
		//"Function" - jish class ko new karte hai pahle ush class me fun ko dhunda jayega, see line 21 yaha hamne new child class kiya hai
		//to child class me fun ko dhunda jayega agar mil gaya to print kar denge aur agar nhi mila to hi parent class me fun dhunda jayega.
		//yaha child calss me fun mil gya hai to child calss ka fun print hoga see line 28, if you want to print parent fun,
		//to aap parent me typecast karoge see line 29. par typecast karne ke baad v fun child class ka hi fun print hoga kyunki jo "Function"
		//hote hai unka resolved hone ka tarika alag hota hai. "Function ko kaise resolved karenge ??" - jish class ko new kiya hai(line 21 new child class)
		//ush class(child class) ke blue print me jake check karoge, kya fun present hai, agar present hoga to ushi class(child class) ki fun body execute ho jayegi,
		//agar present nhi hai to hi jake parent me check hoga, So, line 28 and 29 print child fun

//Override		
	//parent class have fun function and also child class have exactily same fun function that have
	//exactily same prototype, return type and argument of parent fun function. this Situation/Concept call "Override/Overriding"
	//whenever you do new Child Class So you will always 1st call fun of Child Class 
	//this Situation/Concept call "Override/Overriding"
	//Child ke fun ne parent ke fun ko override kar diya hai
		
		//Case 3
		System.out.println("\n-----Case 3-----'See in Code line 53 to 60'");
//		_2_Child_Class c = new _1_Parent_Class();		//here c store refrence of child class(LHS) and create object/instance of parent class(RHS)
//		System.out.println(c.d);						//here c Child class type ka mana jayega
//		System.out.println(c.d1);						//here at location 2k we have only present parent class data members(d=10,d1=100)
//		System.out.println(c.d2);						//and we can't access d2 at location 2k. because d2 is not present at location 2k.
//		c.fun();										//So, error will be rise on at run time. So, line 54 is not allow and also its data members and functions are not allow
//		c.fun1();										//compile time no error because c is child class type that have store all data members of child and parent.
//		c.fun2();										//when code run c have only data members and function of Parent class
		
		//case 4
		System.out.println("\n----------Case 4---------------");
		_2_Child_Class c1 = new _2_Child_Class();		//here c1 store refrence of Child class(LHS) and create object/instance of Child class(RHS)
		System.out.println(c1.d);						//here p2 parent class type ka mana jayega.
		System.out.println(((_1_Parent_Class)c1).d);	//line 65 and 66 same data members name in Parent class and Child class.
		System.out.println(c1.d1);						//So, here we need typecast to access parent data members
		System.out.println(c1.d2);
		c1.fun();										//line 69 and 70. print child class fun kyunki function alag tarike se resolved hoti hai
		((_1_Parent_Class)c1).fun();					//see line 32 and line 72, in line 72 here we don't need type cast because
		c1.fun1();										//here c1 is child class. So, we access child class fun2 without any error
		c1.fun2();										//line 32 here we need type cast because here p1 is parent class type and
														//we want to access child class fun2 so we need to type cast.
		
		
		
		
		
	}
	
}
