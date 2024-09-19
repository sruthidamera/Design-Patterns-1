package edu.umb.cs680.hw11;

import java.util.*;

public class NormalizationUtils {

    public static List<List<Double>> normalizeCars(List<Car> cars) {

        double minMileage = (double) cars.get(0).getMileage(), maxMileage = (double) cars.get(0).getMileage();
        double minYear = (double) cars.get(0).getYear(), maxYear = (double) cars.get(0).getYear();
        double minPrice = (double) cars.get(0).getPrice(), maxPrice = (double) cars.get(0).getPrice();

        List<List<Double>> normalizedCars = new ArrayList<>();

        for (Car car : cars) {
            double mileage = (double) car.getMileage();
            double year = (double) car.getYear();
            double price = (double) car.getPrice();
            minMileage = Math.min(minMileage, mileage);
            maxMileage = Math.max(maxMileage, mileage);

            minYear = Math.min(minYear, year);
            maxYear = Math.max(maxYear, year);

            minPrice = Math.min(minPrice, price);
            maxPrice = Math.max(maxPrice, price);
        }

        for (Car car : cars) {
            double normalizedMileage = normalize(car.getMileage(), minMileage, maxMileage);
            double normalizedYear = normalize(car.getYear(), minYear, maxYear);
            double normalizedPrice = normalize(car.getPrice(), minPrice, maxPrice);

            List<Double> normalizedAttributes = Arrays.asList(normalizedMileage, normalizedYear, normalizedPrice);
            normalizedCars.add(normalizedAttributes);
        }
        return normalizedCars;
    }

    private static double normalize(double value, double min, double max) {
        return (value - min) / (max - min);
    }

    
}
