package _17Exception_Handling;

public class _4_Person_Use_Exception_Handling_By_Try_Catch_and_Finally {

	public static void main(String[] args){
		
		System.out.println("Hiiiiii");
		
		_4_Person_Exception_Handling_By_Try_Catch_and_Finally p1 = new _4_Person_Exception_Handling_By_Try_Catch_and_Finally();
		
		try {
			p1.setAge(20);
			System.out.println(p1.getAge());
			return;
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("finally runs always in any condition");
		}
		
		System.out.println("bye");//this line not run bcoz of line 14
	}
}
