package sii.maroc;

public class Ticket {
	private int orderCount;
	private String orderName;
	
	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Ticket(int orderCount, String orderName) {
		super();
		this.orderCount = orderCount;
		this.orderName = orderName;
	}
	
	public Ticket and(String string) {
		orderCount += Integer.parseInt(string.split(" \\D*")[0]) ;
		orderName +=" " + string.replaceAll("\\d","").trim();
		return new Ticket(orderCount, string);
	}

}
