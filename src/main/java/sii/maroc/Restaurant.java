package sii.maroc;

import sii.maroc.exceptions.UnavailableDishException;

public class Restaurant {
	private final int ballMozzarellaForSalade=1;
	private final int tomatesForSalade=2;
	
	private int ballMozzarellaStock;
	private int tomatoesStock;
	private boolean oliveOil;
	private boolean pepper;
	
	public Restaurant(String ballMozzarellaStock, String tomatoesStock, String oliveOil, String pepper) {
		this.ballMozzarellaStock = Integer.parseInt(ballMozzarellaStock.split(" \\D*")[0]) ;
		this.tomatoesStock = Integer.parseInt(tomatoesStock.split(" \\D*")[0]) ;
		this.oliveOil=oliveOil.equals("olive oil");
		this.oliveOil=pepper.equals("pepper");
	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
	}

	public Ticket order(String order) throws UnavailableDishException {
		
		int orderCount = Integer.parseInt(order.split(" \\D*")[0]) ;
		String orderName = order.replaceAll("\\d","").trim();

		if(orderCount*ballMozzarellaForSalade > ballMozzarellaStock || orderCount*tomatesForSalade > tomatoesStock) 
			throw new UnavailableDishException("Stock is empty");
			
		return new Ticket(orderCount,orderName);
	}

	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
		return new Meal(ticket.getOrderCount(),ticket.getOrderName());
	}


	
}
