import org.junit.Test;
import org.junit.Assert;
import java.lang.Math;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
	Problem:
	GCD is Greatest common divisor. In the school math we studied this. Eg. :
		GCD for 12 & 4 = 4 because 4 can divide both 12 and 4 And No number greater than 2 can do that.
		GCD for 10 & 4 = 2 because 2 can divide both 10 and 4. And No number greater than 2 can do that.
		GCD for 7 & 11 = 1 because 1 can divide both 7 and 11. And No number greater than 1 can do that.
		
	Solution:
	Here below I have written 5 variations to solve GCD. 
		gcd1() <- Euclidean RECURSION algorithm. Uses Subtraction a-b to reduce the argument until it becomes 0
		gcd2() <- Euclidean RECURSION algorithm. Uses  Modulus a%b to reduce the argument until it becomes 0
		gcd3() <- Euclidean RECURSION algorithm. Uses  Modulus a%b to reduce the argument until it becomes 0
		gcd4() <- Euclidean ITERATIVE algorithm. Uses  Modulus a%b to reduce the argument until it becomes 0
		gcd5() <- Binary RECURSION algorithm.
	
	Asymptotic analysis:
	Reference: https://stackoverflow.com/a/59264770/1316967
	Time complexity= O(log n) where n is the upper limit of a and b
	Space complexity= O(1) in case of Iterative solution
	Space complexity=O(log n) in case of Recursive solution where n is the upper limit of a and b. This is because in recursion tree, each stack of recursion occupies some space in memory. In Iterative approach this is not required.
	
		
*/
public class Gcd{ 

	@Test
	public void testGcd(){
		System.out.println("\nstarting testGcd()");
		
		Assert.assertEquals(6l, gcd(12l, 30l));	// In Java convert int to long by adding 'l' in the end. long var = 6l;
		Assert.assertEquals(6l, gcd(30l, 12l));
		
		Assert.assertEquals(12l, gcd(12l, 60l));
		Assert.assertEquals(5l, gcd(50l, 15l));
		Assert.assertEquals(1l, gcd(21l, 13l));	// 21 & 13 don't have any common GCD so the answer = 1
	}
	
	/**
	  Euclidean RECURSION algorithm. Uses Subtraction a-b to reduce the argument until it becomes 0
	*/
	private long gcd1(long a, long b){
		long gcd=0;
		if(a==0)
			gcd= b;
		else {
			if(a>b){
				gcd=gcd1(a-b, b);
			}else{
				gcd=gcd1(b-a, a);
			}
		}
		return gcd;
	}
  }
