package jspiders.spring_dem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jspiders.spring_dem.dto.Product;
import jspiders.spring_dem.dto.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");

        System.out.println("IoC Container created");
        System.out.println(context.getBean("student1", Student.class));
//        System.out.println(context.getBean("student2", Student.class));
//        System.out.println(context.getBean("student3",Student.class));
        System.out.println(context.getBean("product1",Product.class));
    }
}
