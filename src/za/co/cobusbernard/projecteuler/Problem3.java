package za.co.cobusbernard.projecteuler;

import java.util.ArrayList;

public class Problem3 {

	public static ArrayList<Integer> generatePrimes(int upTo) {
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		boolean isPrime = false;
		//Only check odds as all even numbers are not primes.
	    for (int i = 3; i <= upTo; i += 2) {
	    	
	    	isPrime = true;
	    	
            for (int j = 2; j <i; j++) {
            	if (i % j == 0) {
            		isPrime = false;
            		break;
            	}
	        }
            if (isPrime) {
            	primes.add(i);
            }
	    }
	    
	    return primes;
	}
	 
	/**
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?
	 * 
	 * @param topLimit the upper limit to calculate to.
	 * 
	 * @return the largest prime number.
	 */
	public static int problem3(int topLimit){
		int total = 0;
		
		
		
		return total;
	}	
	
}
