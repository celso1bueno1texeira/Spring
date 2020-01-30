package br.com.spring.celso.model;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private Date birthday;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAge(int idade) {
        this.age = age;
    }
}
