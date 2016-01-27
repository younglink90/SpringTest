package test.xmlbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
        ApplicationContext myContext = new ClassPathXmlApplicationContext("/test/xmlbeans/Beans.xml");
        Parking parking = (Parking) myContext.getBean("myParking");
        parking.list();
    }
}
