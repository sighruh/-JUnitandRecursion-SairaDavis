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
		System.out.println(count8(88188));
		System.out.println(count8(8818));
		System.out.println(count8(777));
		System.out.println(count8(8888888));
		System.out.println(count8(8818));
		
	}
}
	