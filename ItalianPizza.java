package AbstractClassess;

public class ItalianPizza extends Pizza {
	
	

	public ItalianPizza(String type,String size,String toppings) {
		super();
		this.type=type;
		this.size=size;
		this.toppings=toppings;
	}

	public ItalianPizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculateCost() {
		int total=0;
		
if(type.equalsIgnoreCase("veg")&&size.equalsIgnoreCase("small")&&toppings.contentEquals("yes")){
			
		total=230;
}else if(type.equalsIgnoreCase("veg")&&size.equalsIgnoreCase("small")&&toppings.contentEquals("no")){
	total=200;
}else if(type.equalsIgnoreCase("veg")&&size.equalsIgnoreCase("medium")&&toppings.contentEquals("yes")){
	total=380;
}else if(type.equalsIgnoreCase("veg")&&size.equalsIgnoreCase("medium")&&toppings.contentEquals("no")){
	total=300;
}else if(type.equalsIgnoreCase("non-veg")&&size.equalsIgnoreCase("small")&&toppings.contentEquals("yes")){
	total=300;
}else if(type.equalsIgnoreCase("non-veg")&&size.equalsIgnoreCase("small")&&toppings.contentEquals("no")){
	total=270;
}else if(type.equalsIgnoreCase("non-veg")&&size.equalsIgnoreCase("medium")&&toppings.contentEquals("yes")){
	total=450;
}else {
	total=420;
}
		
		
		return total;
	}

}
