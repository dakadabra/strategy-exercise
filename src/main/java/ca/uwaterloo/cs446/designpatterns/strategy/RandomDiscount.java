package ca.uwaterloo.cs446.designpatterns.strategy;

import java.util.Random;

public class RandomDiscount implements Discount {
	private double percent;

	public RandomDiscount() {
		Random random = new Random();
		int percent = random.nextInt(49);
		percent += 1;
		this.percent = percent;
	}
	
	@Override
	public double compute(double fullPrice) {
		return fullPrice * (1-this.percent/100);
	}
}
