import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial0() { //test factorial of 0
		MyCalculator mt = new MyCalculator(); //creates an instance of MyCalculator
		float actual = mt.nfactorial(0);//invoke nfactorial method
		assertEquals("0!=1",1,actual,0.0); //check if output is correct
	}
	
	@Test
	public void testNfactorial3() { //test factorial of 3
		MyCalculator mt = new MyCalculator(); //creates an instance of MyCalculator
		float actual = mt.nfactorial(3); //invoke nfactorial method
		assertEquals("3!=6",6,actual,0.0); //check if output is correct
	}
	
	@Test
	public void testNfactorial4() { //test factorial of 4
		MyCalculator mt = new MyCalculator(); //creates an instance of MyCalculator
		float actual = mt.nfactorial(4); //invoke nfactorial method
		assertEquals("4!=24",24,actual,0.0); //check if output is correct
	}

	@Test
	public void testBinarySearch2() { //test binarysearching in an array of 6 elements
		MyCalculator mc = new MyCalculator(); //creates an instance of MyCalculator
		int [] arr = {9, 2, 5, 8, 3, 1}; //creates an array
		int val = mc.binarySearch(arr, 2); //invoke binarySearch method
		assertEquals("Searched 2",1,val,0.0);  //check if searched
	}
	
	@Test
	public void testBinarySearch1() { //test binarysearching in an array of 1 element
		MyCalculator mc = new MyCalculator(); //creates an instance of MyCalculator
		int [] arr = {1}; //creates an array
		int val = mc.binarySearch(arr, 1); //invoke binarySearch method
		assertEquals("Searched 1",0,val,0.0);  //check if searched
	}
	
	public void testBinarySearch3() { //test binarysearching in an array of 3 elements
		MyCalculator mc = new MyCalculator(); //creates an instance of MyCalculator
		int [] arr = {5, 8, 3}; //creates an array
		int val = mc.binarySearch(arr, 3); //invoke binarySearch method
		assertEquals("Searched 3",2,val,0.0);  //check if searched
	}

	public void testBinarySearch4() { //test binarysearching in an array of 4 elements
		MyCalculator mc = new MyCalculator(); //creates an instance of MyCalculator
		int [] arr = {9, 2, 4, 8}; //creates an array
		int val = mc.binarySearch(arr, 4); //invoke binarySearch method
		assertEquals("Searched 4",2,val,0.0);  //check if searched
	}
}
