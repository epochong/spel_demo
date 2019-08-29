package com.ming.vo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpELTest {

    private ApplicationContext context = null;

    @Before
    public void testInit(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testAddress(){
        //getBean获得对象
        Address address = (Address) context.getBean("address");
        System.out.println(address);
        System.out.println(address.getCity());
        System.out.println(address.getStreet());
    }
    @Test
    public void testCar(){
        Car car = (Car) context.getBean("car");
        System.out.println(car);
        System.out.println(car.getBrand());
        System.out.println(car.getPrice());
        System.out.println(car.getTyreMeter());
    }

    @Test
    public void testPerson(){
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }

}
