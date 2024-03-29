package com.alokaza.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
        //Creating Faker object to reach methods
        Faker faker= new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        //numerify() method will generate random numbers in the format we want to get
        System.out.println("faker.numerify(\"###-###-####\") = "
                + faker.numerify("###-###-####"));
        System.out.println("faker.letterify(\"????-????\") = " + faker.letterify("????-????"));

        System.out.println("faker.bothify(\"##?#-##?#-#?#?#-##??\") = " + faker.bothify("##?#-##?#-#?#?#-##??"));
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
    }


}
