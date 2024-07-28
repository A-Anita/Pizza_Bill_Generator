
public class Pizza {
	private int price;
	private Boolean veg;
	private int extraCheesePrice=100;
	private int extraToppingsPrice=150;
	private int backpack=20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded;
	private boolean isExtraToppingsAdded;
	private boolean isOptedForTakeAway;
	public Pizza(Boolean veg) {
		this.veg=veg;
		if(this.veg) {
			this.price=300;
		}else {
			this.price=400;
			
		}
		basePizzaPrice=this.price;
	}

	public void ExtraCheese() {
		isExtraCheeseAdded=true;
		this.price += extraCheesePrice;
	}
	public void addExtraTopping() {
		isExtraToppingsAdded=true;
		this.price += extraToppingsPrice;

	}
	public void takeAway() {
		isOptedForTakeAway=true;
		this.price += backpack;

	}
	public void getBill() {
		String bill="";
		System.out.println("Pizza: "+basePizzaPrice);
		if(isExtraCheeseAdded) {
			bill+="Extra Cheese Added: "+extraCheesePrice+"\n";
		}
		if(isExtraToppingsAdded) {
			bill+="Extra Toppings Added: "+extraToppingsPrice+"\n";
		}
		if(isOptedForTakeAway) {
			bill+="Take away: "+backpack+"\n";
		}
		bill+="Bill: "+this.price+"\n";
		System.out.println(bill);
		}

	}

