package fr.dauphine.ja.santangelomike.td00;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.UnaryOperator;

/**
 * Hello world!
 *
 */
public class PrimeCollection
{
	private static ArrayList<Integer> numbers = new ArrayList<>();
	
	private static void initRandom(int n, int m) {
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			numbers.add(r.nextInt(m+1));
		}
	}
	
	private static boolean isPrime(int p) {
		int sqrt = (int) Math.sqrt(p);
		for (int i = 2; i < sqrt + 1; i++) {
			if (p % i == 0) return false;
		}
		return true;
	}
	
	private static void printPrimes() {
		for (int number : numbers) {
			if (isPrime(number)) System.out.println(number);
		}
	}
	
    public static void main( String[] args )
    {
    	initRandom(100, 999);
    	numbers.replaceAll(new UnaryOperator<Integer>() {
			@Override
			public Integer apply(Integer i) {
				return i+1;
			}
		});
    	printPrimes();
    }
}
