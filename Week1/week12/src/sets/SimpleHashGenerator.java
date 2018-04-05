package sets;

public class SimpleHashGenerator {

	public static int generateSimpleHash(String str) {
		int h = 0;
		for (int i = 0; i < str.length(); i++) {
			h = h + str.charAt(i);
		}
		
		return h;
	}
	
	
	public static int generateHash(String str) {
		int h = 0;
		int hashMultiplier = 31;
		for (int i = 0; i < str.length(); i++) {
			h = (hashMultiplier * h) + str.charAt(i);
		}
		
		return h;
	}
	
	
	public static void main(String[] args) {


		System.out.println((int)"a".charAt(0));
		String s1 = "hi";
//		System.out.println("Code for hi: " + generateSimpleHash(s1));
//		System.out.println("Code for eat: " +generateSimpleHash("eat"));
//		System.out.println("Code for tea: " +generateSimpleHash("tea"));
//
//		System.out.println("Code for hi: " +generateHash(s1));
//		System.out.println("Code for eat: " + generateHash("eat"));
//		System.out.println("Code for tea: " +generateHash("tea"));

	}

}
