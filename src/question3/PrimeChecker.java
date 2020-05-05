package question3;

/* NOTE: To test the primality of a number
 * I checked whether a number N can be evenly divided
 * by a number ranging from 2 to sqrt of N
 */
public class PrimeChecker {
	public static void main(String[] args) {
		int[] arr = {3, 5, 34, 56, 71, 113, 139, 234};
		
		System.out.println("Through iteration the prime numbers are: ");
		iterativePrint(arr);
		
		
		System.out.println("\n\nThrough recursion the prime numbers are: ");
		recursivePrint(arr, 0);
	
	}
	
	/* ITERATIVE SOLUTION*/
	// A iterative printing method which calls the iterative primality test method
	// A number N is only printed if it is a prime
	private static void iterativePrint(int[] arr) {
		for(Integer element : arr) {
			if(iterativePrime(element)) {
				System.out.print(element + " ");
			}
		}
	}
	
	//The iterative primality test
	//The number N is prime if it cannot be evenly divided by a number
	// from 2 to sqrt(N)
	private static boolean iterativePrime(Integer element) {
		for(int i = (int) Math.sqrt(element); i >= 2; i--) {
			if(element % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	
	/* RECURSIVE SOLUTION*/
	// A recursive printing method which calls the recursive primality test method
	// The base case checks if n is already equal to the length of the array
	// A number N is only printed if it is a prime
	private static void recursivePrint(int[] arr, int n) {
		if(n == arr.length)
			return;
		
		int element = arr[n];
		
		if(recursivePrime(element, (int) Math.sqrt(element))) {
			System.out.print(element + " ");
		}
		
		recursivePrint(arr, n+1);
	}

	
	//The recursive primality test
	//The number N is prime if it cannot be evenly divided by a number
	// from 2 to sqrt(N)
	// As such, the base case checks, if n <2 
	private static boolean recursivePrime(int element, int n) {
		if(n < 2) {
			return true;
		}
		
		return element % n == 0 ? false : recursivePrime(element, n-1);
	}

	
}


