package test.annotationsbeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
public class Config
{
	@Autowired
	ApplicationContext myContext;
	
    @Bean(name="car1") 
    public Car createCar1() {
    	return new Car("PK","Red");
    }
    
    @Bean(name="car2") 
    public Car createCar2() {
    	return new Car("Nightwish","Violet");
    }
    
    @Bean(name="car3") 
    public Car createCar3() {
    	return new Car("LOLIPOPY","Black");
    }
    
    @Bean(name="myParking")
    public Parking getParking() {
    	return  new Parking();
    }
    
    @Bean(name="carList")
    public List<Car> createCarList() {
     	Map<String, Car> carMap = myContext.getBeansOfType(Car.class);
    	return new ArrayList<>(carMap.values());
    }
}
