package collect;

public class Pizza {

	String type;
	String toppings;
	String name;
	float time;
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
	public Pizza(String type, String toppings, String name, float time) {
		super();
		this.type = type;
		if(!(type.equalsIgnoreCase("veg")||type.equalsIgnoreCase("non-veg"))){
		  System.out.println("type incorrect");
		}
		this.toppings = toppings;
		this.name = name;
		this.time = time;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "type:"+type+"name:"+name+"\ntopping"+toppings+"\ntime in mins:"+time;
	}

	
	
}