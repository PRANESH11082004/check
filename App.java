package org.example;

import org.example.config.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        Student student = (Student) context.getBean("s1");

        System.out.println(student.getRno());
        student.WriteExam();


    }
}
