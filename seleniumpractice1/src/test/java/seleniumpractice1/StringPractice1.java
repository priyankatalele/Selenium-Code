package seleniumpractice1;

public class StringPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Priyanka";
		
		String s2 = "Devanshi";
		
		String s3 = "Priyanka";
		
		System.out.println(s1==s2); // false
		
		System.out.println(s1==s3);  // true
				
		System.out.println(s3==s2);  //false
		
		System.out.println(s1.equals(s2));  //false
		System.out.println(s1.equals(s3));   //true
		System.out.println(s3.equals(s2));   //false
		
		
		String s4 = new String("Priyanka");
		
		String s5 = new String("Devanshi");
		
		String s6 = new String("Priyanka");
		
		System.out.println(s4==s5);  // all will be false
		System.out.println(s6==s5);
		System.out.println(s6==s4);
		
		System.out.println(s4.equals(s5));  //false
		System.out.println(s6.equals(s5));  //false
		System.out.println(s4.equals(s6));  //true
		
		
		StringBuffer sb1 = new StringBuffer("Priyanka");
		StringBuffer sb2 = new StringBuffer("Devanshi");
		StringBuffer sb3 = new StringBuffer("Priyanka");
		
		System.out.println(sb1==sb2); // all will be false
		System.out.println(sb3==sb1);
		System.out.println(sb2==sb3);
		
		System.out.println(sb1.equals(sb2));  //all will be false as it is comparing addresses. 
		System.out.println(sb2.equals(sb1));
		System.out.println(sb3.equals(sb2));
		
		

	}

}
