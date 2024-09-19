package edu.umb.cs680.hw02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw02.SingletonPrimeGeneratorTest;
public class SingletonPrimeGeneratorTest {
	

	
@Test 
public void getInstanceCheckIfReturnsNonNullValue() {
	SingletonPrimeGenerator gen=SingletonPrimeGenerator.getInstance(11,20);
	assertNotNull(gen);
}

@Test 
public void getInstanceCheckIfReturnsIdenticalInstanceWhenCalledMultipleTimes() {
	SingletonPrimeGenerator gen=SingletonPrimeGenerator.getInstance(11,20);
	SingletonPrimeGenerator gen2=SingletonPrimeGenerator.getInstance(21,23);
	assertSame(gen,gen2);
}


@Test
public void GivenValidRange() {
	SingletonPrimeGenerator gen=SingletonPrimeGenerator.getInstance(11,20);
	gen.generatePrimes();
	Long[] expectedPrimes= {11L,13L,17L,19L};
	assertArrayEquals(expectedPrimes,gen.getPrimes().toArray());
}

@Test
public void GivenInvalidRangeThenThrowsRuntimeException() {
	try {
		SingletonPrimeGenerator gen=SingletonPrimeGenerator.getInstance(9,3);
	}catch(Exception e) {
		assertEquals("Wrong input values: from=9 to=3",e.getMessage());
	}
}


@Test
public void GivenNegativesRangeThenThrowsRuntimeException() {
	try {
		SingletonPrimeGenerator gen=SingletonPrimeGenerator.getInstance(-1,3);
	}catch(Exception e) {
		assertEquals("Wrong input values: from=-1 to=3",e.getMessage());
	}
}

@Test
public void GivenSingleRangeThrowsRUntimeException() {
	
		
		try {
			SingletonPrimeGenerator gen=SingletonPrimeGenerator.getInstance(11,11);
		}catch(Exception e) {
			assertEquals("Wrong input values: from=11 to=11",e.getMessage());
		}
		
}



}