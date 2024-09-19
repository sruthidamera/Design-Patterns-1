package edu.umb.cs680.hw14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw14.Car;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class ComparatorsTest {
	
	
	protected static LinkedList<Car> CarsList = new LinkedList<>();
	
	
	public LinkedList<String> getCarNames(LinkedList<Car> c) {
		LinkedList<String> carNames = new LinkedList<>();

        for (Car car : c) {
            carNames.add( car.getMake());
        }

        return carNames;
	}

    
	@BeforeAll
	public static void setUp() {
		CarsList.add(new Car("Ford", "Escape", 28000, 2019, 12000));
		CarsList.add(new Car("Honda", "CRV", 24000, 2020, 15000));
		CarsList.add(new Car("Hyundai", "Tucson", 26000, 2018, 18000));
		CarsList.add(new Car("Tesla", "Model 3", 50000, 2021, 5000));
		CarsList.add(new Car("Subaru", "Outback", 32000, 2022, 8000));
		CarsList.add(new Car("Porsche", "Cayenne", 75000, 2021, 8000));
	}
	

	@Test
	public void MileageComparatorTest() {
		LinkedList<String> expected = new LinkedList<>(Arrays.asList("Honda", "Hyundai", "Ford", "Subaru", "Tesla","Porsche"));
		Collections.sort(CarsList, Comparator.comparing(Car::getMileage,Comparator.naturalOrder() ));
		
		assertEquals(expected, getCarNames(CarsList));
	}
	
	@Test
	public void YearComparatorTest() {
		LinkedList<String> expected = new LinkedList<>(Arrays.asList("Subaru","Tesla","Porsche","Honda","Ford","Hyundai"    ));
		Collections.sort(CarsList, Comparator.comparing(Car::getYear).reversed());

		assertEquals(expected, getCarNames(CarsList));
	}
	
	@Test
	public void PriceComparatorTest() {
		LinkedList<String> expected = new LinkedList<>(Arrays.asList("Tesla", "Subaru", "Porsche", "Ford", "Honda","Hyundai"));
		Collections.sort(CarsList, Comparator.comparing(Car::getPrice,Comparator.naturalOrder() ));
		assertEquals(expected, getCarNames(CarsList));
	}
	
	@Test
	public void ParetoComparatorTest() {
		LinkedList<String> expected = new LinkedList<>(Arrays.asList("Subaru", "Tesla", "Porsche", "Honda", "Ford","Hyundai"));
		Collections.sort(CarsList, Comparator.comparing(Car::getDominationCount,Comparator.naturalOrder() ));

		assertEquals(expected, getCarNames(CarsList));
	}

}
