import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"First.xml","Second.xml"});
	
	//Resource res = new ClassPathResource("NewFile.xml");
	//BeanFactory factory = new XmlBeanFactory(res);
	
	Customer cust = (Customer)context.getBean("c");
	System.out.println(cust);
	
	context.registerShutdownHook();
}
}