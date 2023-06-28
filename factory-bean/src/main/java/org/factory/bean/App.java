package org.factory.bean;
import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       BeanFactory facotry =new XmlBeanFactory(new ClassPathResource("application-context.xml"));
       
       Reminder reminder= facotry.getBean("reminder",Reminder.class);
       
       System.out.println(reminder.getEvent());
       
       Calendar calendar1 =facotry.getBean("calendar",Calendar.class);
       Calendar calendar2 =facotry.getBean("calendar",Calendar.class);
      
       System.out.println("calander1 == calnder2: ?"+(calendar1 ==calendar2));
       
       
       CalanderFactoryBean bean1 =facotry.getBean("&calendar",CalanderFactoryBean.class);
       
       CalanderFactoryBean bean2 =facotry.getBean("&calendar",CalanderFactoryBean.class);
       
       
       System.out.println("factoryBean1 == factoryBean2: ?"+(bean1 ==bean2));
       
    }
}
