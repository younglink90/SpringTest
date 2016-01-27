package test.annotationsbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test.annotationsbeans.Parking;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext myContext = new AnnotationConfigApplicationContext(Config.class);
        Parking parking = (Parking) myContext.getBean(Parking.class);
        parking.list();
        ((ConfigurableApplicationContext) myContext).close();
    }
}
