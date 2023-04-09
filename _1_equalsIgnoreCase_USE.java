
public class _1_equalsIgnoreCase_USE {
	
	public static void main(String[] args) {
		
		 	String str1 = "GeeKS FOr gEEks";
	        String str2 = "geeKs foR gEEKs";
	        String str3 = "ksgee orF geeks";
	 
	        // Comparing strings
	        // If we ignore the cases
	        boolean result1 = str2.equalsIgnoreCase(str1);
	 
	        // Both the strings are equal so display true
	        System.out.println("str2 is equal to str1 = "
	                           + result1);
	 
	        // Even if we ignore the cases
	        boolean result2 = str2.equalsIgnoreCase(str3);
	 
	        // Both the strings are not equal so display false
	        System.out.println("str2 is equal to str3 = "
	                           + result2);
	}
}
