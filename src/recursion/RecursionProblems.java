package recursion;

public class RecursionProblems {
	public static int count8(int n) {
		// base case
		if (n == 0) {
			return 0; 
		}
		// Gets the ones place and if it is an 8 
		int onesPlace = n % 10;
		n /= 10; 
		// Gets rid of the ones place
		if (onesPlace == 8) {
			int tensPlace = n % 10;
			if(tensPlace == 8)
				return 2 + count8(n); // Means last digit is 8
			else
				return 1 + count8(n); // Means we have x8
		} // End if 
		
		return count8(n); // Means we have 88
	}
	
	public static void main(String [] args) {
		System.out.println("Recursion Problem #1");
		System.out.println(count8(88188));
		System.out.println(count8(8818));
		System.out.println(count8(777));
		System.out.println(count8(8888888));
		System.out.println(count8(8818));
		testCountHi(args);
		testCountHi2(args);
		testStrCount(args);
	}
	
	public static int countHi(String str) {
		if (str.length() == 0) return 0;
		if (str.startsWith("hi")) {
			return 1 + countHi(str.substring(1));
		}
		return countHi(str.substring(1));
	}
	
	public static void testCountHi(String [] args) {
		System.out.println("Recursion Problem #2");
		System.out.println(countHi(""));
		System.out.println(countHi("h"));
		System.out.println(countHi("hihi"));
		System.out.println(countHi("snyhikjf"));
		System.out.println(countHi("sssshimmmm"));
	}	
	
	public static int countHi2(String str) {
		if (str.length() == 0) return 0;
		if (str.startsWith("xhi")) {
			return countHi2(str.substring(3));
		}
		if (str.startsWith("hi")) {
			return 1 + countHi2(str.substring(2));
		}
		return countHi2(str.substring(1));
	}
	
	public static void testCountHi2(String [] args) {
		System.out.println("Recursion Problem #3");
		System.out.println(countHi2("xhixhi"));
		System.out.println(countHi2("hihi"));
		System.out.println(countHi2("xhihikjf"));
		System.out.println(countHi2("hisshixhi"));
		System.out.println(countHi2(""));
	}
	
	public static int strCount(String str, String sub) {
		if (str.length() == 0) {
			return 0;
		}
		if (str.startsWith(sub)) {
			return 1 + strCount(str.substring(sub.length()), sub);
		}
		return strCount(str.substring(1), sub);
	}
	
	public static void testStrCount(String [] args) {
		System.out.println("Recursion Problem #3");
		System.out.println(strCount("catcowcat", "cat"));
		System.out.println(strCount("aaaa", "aa"));
		System.out.println(strCount("catcowcat", "cow"));
		System.out.println(strCount("catcowcat", "dog"));
		System.out.println(strCount("", "cat"));
	}
}

	