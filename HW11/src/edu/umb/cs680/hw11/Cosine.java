package edu.umb.cs680.hw11;

import java.util.List;

public class Cosine implements DistanceMetric{
	
	public double distance(List<Double> p1, List<Double> p2) {
        
        double dotProduct = 0.0;
        for (int i = 0; i < p1.size(); i++) {
            dotProduct += p1.get(i) * p2.get(i);
        }
        double P1magnitude = calcMagnitude(p1);
        double P2magnitude = calcMagnitude(p2);
        double cosineSimilarity = dotProduct / (P1magnitude * P2magnitude);
        return 1 - cosineSimilarity;
    }
	
	private double calcMagnitude(List<Double> point) {
        double sumOfSquares = 0.0;
        for (Double value : point) {
            sumOfSquares += Math.pow(value, 2);
        }
        return Math.sqrt(sumOfSquares);
    }
	
	
}
