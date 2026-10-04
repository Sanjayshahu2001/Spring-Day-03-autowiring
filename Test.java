import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import model.Student;

public class Test {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("ApplicationContext.xml");
		BeanFactory fact=new XmlBeanFactory(r);
		Student S=(Student)fact.getBean("obj");
		System.out.println(S);

	}

}
