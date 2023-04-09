package _16OOPS;

public class _6_Student {

	//in java - jish class ka koi parent nhi hota ush class ka parent "Object" hota hai
	//yaha Student class ka koi parent nhi hai to ishka parent Object hai
	//aur ye Object class pahle se bani banai class hai
	//par hamne yaha object ko extends nhi kiya hai. ye by default ya implicitly
	//extended hota hai. ye janne ke liye aapko main class me student class ka new
	//object banana parega for example = _6_Student s = new _6_Student();
	//aur jab aap s dot karenge tab aapko Object class jo by default extended hai
	//ushka function show hone lagega. for example = s.equals(obj); s.getClass();
	//s.hashCode(); s.toString() and so on.
	
	String name;
	int age;
	
	@Override
//	public String ToString() {						// agar aapne spaling mistake kar dii to ye override nhi huaa
//		return name + " is " + age + " years old.";	//aur ye sirf Student class ka function ban gya
//	}												//agar aap parent class ka function ko modify karna chahte hai to aapko
													//parent class ki trh hi toString ka same function likhna hoga aur tab
													//aap ushke under modify kar ke koi aur output la shkte hai
						//agar aap chahte hai ki spaling mistake hone se bache to aap
						//notation use kar shkte hai(@Override) see line 18
						//notation use karne se hame pata chal jata hai ki hamne spaling mistake ki hai
	public String toString() {
        return name + " is " + age + " years old.";
    }
	
	
	
	
	
	
	
	
	
	
}
