package sii.maroc;

public class Meal {
	
	private int orderCount;
	private String orderName;
	
	private final int cookingDurationForSalad = 6;
	private final int cookingDurationForPizza = 10;
	
	public Meal(int orderCount, String orderName) {
		super();
		this.orderCount = orderCount;
		this.orderName = orderName;
	}
	
	public int servedDishes() {
		return orderCount;
	}

	public int cookingDuration() {
		if (orderCount==1) return cookingDurationForSalad;
		return cookingDurationForSalad+(cookingDurationForSalad/2)*(orderCount-1);
	}

}
