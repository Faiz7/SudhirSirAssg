package ExceptionHandle;

public abstract class Pizza {
	String type;
	String toppings;
	String name;
	float time;
	int cost;
	String size;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public Pizza(String type, String toppings, String name, float time,
	int cost, String size) throws InvalidPizzaTypeException,InvalidPizzaSizeException
	{
		super();
		this.type = type;
		if(!(type.equalsIgnoreCase("veg")||type.equalsIgnoreCase("non-veg"))){
			throw new InvalidPizzaTypeException("type can be only veg or non veg"); 
		}
		this.toppings = toppings;
		this.name = name;
		this.time = time;
		this.cost = cost;
		this.size = size;
		if(!(type.equalsIgnoreCase("small")||type.equalsIgnoreCase("medium"))){
			throw new InvalidPizzaSizeException("size are medium or small");
			}
		}
		
	/*
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	*/
	//abstract method
	
	abstract int calculateCost();
}
