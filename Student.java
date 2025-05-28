package org.example;

public class Student {

    private int rno;
    private Writer writer;


    public Student(){
        System.out.println("Student const");
    }

    public void show(){
        System.out.println("show student method");
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void WriteExam(){
       writer.write();
    }



}
