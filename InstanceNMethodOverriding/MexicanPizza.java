package InstanceNMethodOverriding;

public class MexicanPizza extends Pizza {

	public MexicanPizza(String type, String toppings, String name, float time) {
		super(type, toppings, name, time);
		/*this.type="Non-veg";
		this.name="Mexican Pizza";
		this.toppings="chicken";
		this.time=15;*/
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type+" "+name+" with "+toppings+" toppings which take "+time+" min for preparation.";
	}

		
	
	
	
}
