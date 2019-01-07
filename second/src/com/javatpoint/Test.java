package com.javatpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        Resource resource=new ClassPathResource("applicationContext.xml");
//        BeanFactory factory=new XmlBeanFactory(resource);
//        Student student=(Student)factory.getBean("student");

        // The new way
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        employee.show();
    }
}