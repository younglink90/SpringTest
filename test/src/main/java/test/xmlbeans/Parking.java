package test.xmlbeans;

import java.util.List;

public class Parking {
	
	private List<Car> carList;

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
	
	public void list() {
		for(Car car : carList) {
			System.out.println(car);
		}
	}
}
