package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PrimeGeneratorTest {
	
	@Test
	public void GivenValidRange() {
		PrimeGenerator gen=new PrimeGenerator(11,20);
		gen.generatePrimes();
		Long[] expectedPrimes= {11L,13L,17L,19L};
		assertArrayEquals(expectedPrimes,gen.getPrimes().toArray());
	}
	
	@Test
	public void GivenInvalidRangeThenThrowsRuntimeException() {
		try {
			PrimeGenerator gen=new PrimeGenerator(9,3);
		}catch(Exception e) {
			assertEquals("Wrong input values: from=9 to=3",e.getMessage());
		}
	}
	
	
	@Test
	public void GivenNegativesRangeThenThrowsRuntimeException() {
		try {
			PrimeGenerator gen=new PrimeGenerator(-1,3);
		}catch(Exception e) {
			assertEquals("Wrong input values: from=-1 to=3",e.getMessage());
		}
	}

	@Test
	public void GivenSingleRangeThrowsRUntimeException() {
		
			
			try {
				PrimeGenerator gen=new PrimeGenerator(11,11);
			}catch(Exception e) {
				assertEquals("Wrong input values: from=11 to=11",e.getMessage());
			}
			
	}
	
	@Test
	public void GivenNoPrimesRange() {
		PrimeGenerator gen=new PrimeGenerator(32,34);
		gen.generatePrimes();
		Long[] expectedPrimes= {};
		assertArrayEquals(expectedPrimes,gen.getPrimes().toArray());
		
	}
}
