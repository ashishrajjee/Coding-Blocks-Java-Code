package _17Exception_Handling;

public class _2_Person_Use_Exception_Handling_By_Try_and_Catch {

	public static void main(String[] args){
		
		_2_Person_Exception_Handling_By_Try_and_Catch p1 = new _2_Person_Exception_Handling_By_Try_and_Catch();
		
		try {
			p1.setAge(-20);//exception generated
			System.out.println(p1.getAge());//this line not run bcoz of exception in line 10
		}
		catch(Exception e) {
//			System.out.println("in catch");
			System.out.println(e.getMessage());
//			System.out.println(e);
//			e.printStackTrace();
		}
	}
}
