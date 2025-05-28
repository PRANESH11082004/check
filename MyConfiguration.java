package org.example.config;

import org.example.Pen;
import org.example.Pencil;
import org.example.Student;
import org.example.Writer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfiguration {

    @Bean(name="s1")
    public Student student(@Qualifier("pencil") Writer writer){
        Student student = new Student();    // instead of student you can give any name
        student.setRno(1);
        student.setWriter(writer);
        return student;
    }

    @Bean
    @Primary                         // there are two primary but it is only applicable for it has @Qualifier("pencil")
    public Pen pen(){
        return new Pen();
    }

    @Bean
    @Primary
    public Pencil pencil(){
        return new Pencil();
    }


}
