package _17Exception_Handling;

public class _4_Person_Exception_Handling_By_Try_Catch_and_Finally {

//	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws Exception {
		
		if(age < 0)
			throw new Exception("Age can't be -ve");
		
		this.age = age;
	}
}
