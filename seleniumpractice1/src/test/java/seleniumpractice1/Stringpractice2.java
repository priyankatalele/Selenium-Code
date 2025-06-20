package seleniumpractice1;

public class Stringpractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//mutable immutable practice
		
		String s1 = "Priyanka";
		
		String s3 = new String("Devanshi");
		s1.concat("Talele");
		
		System.out.println(s1);
		
		
		String s2 = s1.concat("Talele");
		
		System.out.println(s2);
		
	//	s1 = s1.concat("Talele");
		
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Priya");
		
		sb.append(" Rane");
		
		System.out.println(sb);
		
		System.out.println(s1+s3);
		
		System.out.println(s1.concat(s3));
		
	}

}
