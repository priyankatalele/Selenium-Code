package seleniumpractice1;

public class StringPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//contains() and equals() methods are case sensitive
		
		String S1 = "WELCOME";
		String s2 = "WELCOME";
		
		System.out.println(S1.equals("WELcome"));
		System.out.println(S1.equals(s2));
		System.out.println(S1.contains("wel"));
		
		System.out.println(s2.equalsIgnoreCase("welcome"));  // this will ignore case sensitiveness

	}

}
