package com.cybertek.tests.practice;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class FakerPractice {

    @Test
    public void fakeTest(){
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        System.out.println("firstName = " + firstName);

        String lastName = faker.name().lastName();
        System.out.println("lastName = " + lastName);

        System.out.println("fullname : "+ firstName+" "+lastName);

        String fullName = faker.name().fullName();
        System.out.println("fullName = " + fullName);

        System.out.println("faker.funnyName().name() = " + faker.funnyName().name());

    }
}
