package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Name is : " + name + ", Gender is : " + gender + ", Age is : " + age;
    }
    public void initBean() {
        System.out.println("Init Bean for : Actor");
    }

    public void destroyBean() {
        System.out.println("Init Bean for : Actor");
    }
}