package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DistanceMetricTest {
	
	static List<List<Double>> NormalizedCarsData=new LinkedList<>();
	
	public static List<Car> generateTestData(int numCars) {
        List<Car> cars = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numCars; i++) {
            int mileage = random.nextInt(100000);
            int year = 2000 + random.nextInt(20);   
            float price = random.nextFloat(100000)  ;     
            cars.add(new Car("","",mileage, year, price));
        }

        return cars;
    }
	
	

	@BeforeAll
	public static void setUp() {
		List<Car> generatedCars=generateTestData(1500);
		NormalizedCarsData=NormalizationUtils.normalizeCars(generatedCars);
	}
	
	
	@Test
	public void EuclideanDistanceMatrixTest() {
		DistanceMetric e=new Euclidean();
		Distance d=new Distance();
		List<List<Double>> distanceMatrix= d.matrix(NormalizedCarsData,e);
		int x=100;
		int y=120;
		assertEquals(e.distance(NormalizedCarsData.get(x), NormalizedCarsData.get(y)),distanceMatrix.get(x).get(y));
	}
	
	@Test
	public void ManhattanDistanceMatrixTest() {
		DistanceMetric e=new Manhattan();
		Distance d=new Distance();
		List<List<Double>> distanceMatrix= d.matrix(NormalizedCarsData,e);
		int x=100;
		int y=120;
		assertEquals(e.distance(NormalizedCarsData.get(x), NormalizedCarsData.get(y)),distanceMatrix.get(x).get(y));
	}
	
	@Test
	public void CosineDistanceMatrixTest() {
		DistanceMetric e=new Cosine();
		Distance d=new Distance();
		List<List<Double>> distanceMatrix= d.matrix(NormalizedCarsData,e);
		int x=100;
		int y=120;
		assertEquals(e.distance(NormalizedCarsData.get(x), NormalizedCarsData.get(y)),distanceMatrix.get(x).get(y));
	}
	
	
	
	
	
	
	

}
