package _7StringBuilder;

import java.util.Scanner;

public class DemoSB {
	public static void main(String[] args) {
		
		//taking StringBuilder input using line 9,10 and 12
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println();
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		// create
		//StringBuilder sb = new StringBuilder();//empty string
		
		StringBuilder sb1 = new StringBuilder("Ashish");
		
		//print
		System.out.println(sb1);
		//length
		System.out.println(sb1.length());
		//char obtain
		System.out.println(sb1.charAt(4));
		//set single char at  any index
		sb1.setCharAt(4, 'T');
		System.out.println(sb1);
		//insert anything at  any index
		sb1.insert(4, "sh Rajraj");
		System.out.println(sb1);
		
		//insert in last using append
		sb1.append(" Kushwaha");
		System.out.println(sb1);
		
		//delete char at any index
		sb1.deleteCharAt(10);
		System.out.println(sb1);
		//delete char at starting index to ending index
		sb1.delete(10, 14);
		System.out.println(sb1);
		
		//print sub string
		System.out.println(sb1.substring(7));
		System.out.println(sb1.substring(11, sb1.length()));
		System.out.println(sb1.substring(7, 10));
		
		System.out.println(sb1);
		//convert StringBuilder to String
		String str1 = sb1.toString();
		System.out.println(str1);
		s.close();
		
		
		
		
	}
}
