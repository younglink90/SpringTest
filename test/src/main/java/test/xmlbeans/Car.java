package test.xmlbeans;

public class Car {

	private String model;
	private String color;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String a, String b) {
		this.model = a;
		this.color = b;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}
	
}
