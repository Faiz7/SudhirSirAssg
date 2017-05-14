package InstanceNMethodOverriding;

public class ItalianPizza extends Pizza {

	public ItalianPizza(String type, String toppings, String name, float time) {
		super(type, toppings, name, time);
		/*this.type="Veg";
		this.name="Margherita Pizza";
		this.toppings="mushroom";
		this.time=10;*/
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type+" "+name+" with "+toppings+" toppings which take "+time+" min for preparation.";
	}

	

}
