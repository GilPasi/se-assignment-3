package assignment3_;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.jupiter.api.Test;


class fizzBuzzTest {
	

	@Test
	void test() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.calculateFizzBuzz(1) ;
		assertTrue(result.equals("1"));	
	}
	
	@Test
	void test2() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.calculateFizzBuzz(2) ;
		assertTrue(result.equals("1, 2"));	
	}
	
	@Test
	void testFizz() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.calculateFizzBuzz(3) ;
		assertTrue(result.equals("1, 2, Fizz"));	
	}
	
	@Test
	void testBuzz() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.calculateFizzBuzz(5) ;
		assertTrue(result.equals("1, 2, Fizz, 4, Buzz"));	
	}
	
	@Test
	void testFizzBuzz() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.calculateFizzBuzz(15) ;
		assertTrue(result.equals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz"));	
	}

}
