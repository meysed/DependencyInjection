package ir.sample;

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
        System.out.println( "Hello World!" );
        ApplicationContext  context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person = (Person) context.getBean("person");
        person.sendMessage();
    }
}
