package main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class junit {
	
	private Calculator calculate;
	
	@Before
	public void testcase() {
		calculate = new Calculator();
	}
	@Test
	public void Sum() {
		int a = 20;
		int b = 10;
		Assert.assertEquals(30, calculate.Sum(a, b));
	}
    @Test
    public void Subtract() {
	    int a = 20;
	    int b = 10;
	    Assert.assertEquals(10, calculate.Subtract(a, b));
    }
    @Test
    public void Multiply() {
	    int a = 20;
	    int b = 10;
	    Assert.assertEquals(200, calculate.Multiply(a, b));
    }
    @Test
    public void Divide() {
	    int a = 20;
	    int b = 10;
	    Assert.assertEquals(2, calculate.Divide(a, b));
}
}
