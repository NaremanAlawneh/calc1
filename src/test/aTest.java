package test;

import static org.junit.jupiter.api.Assertions.*;

import java.calc;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class aTest {


	@Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
		// Arrange
		int a = 10;
		int b = 20;
		calc c = new calc();
	
		int result = c.add(a, b);
	
		Assert.assertTrue(result > 0);
	}

	@Test
	public void testSum_BothNumbersAreNegative_ShouldReturnNegNumber() {
		// Arrange
		int a = -10;
		int b = -20;
		calc c = new calc();
	
		int result = c.add(a, b);
	
		Assert.assertTrue(result < 0);
	}
	
}
