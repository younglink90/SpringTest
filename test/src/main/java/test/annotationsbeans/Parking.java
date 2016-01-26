package test.annotationsbeans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Parking {

	@Autowired
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
