package _17Exception_Handling;

public class _3_Person_Exception_Handling_By_Try_and_Catch {

//	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age){
		
		try {
			if(age < 0) {
				throw new Exception("Age can't be -ve");
			}
			this.age = age;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
