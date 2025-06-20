package seleniumpractice1;

import scala.Char;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//multiple ways to create string object
		
		String s1 = "Priyanka";
		System.out.println(s1);
		
		String s2 = new String("Devanshi");
		System.out.println(s2);
		
		char[] ch = {'a','b','c','d','e'};
		String s3 = new String(ch);
		System.out.println(ch);
		
		String s4 = new String(ch, 0, 3);
		System.out.println(s4);
		
		byte[] b = {65,66,67,68,69,70};
		String s5 = new String(b);
		System.out.println(s5);
		
		

	}

}
