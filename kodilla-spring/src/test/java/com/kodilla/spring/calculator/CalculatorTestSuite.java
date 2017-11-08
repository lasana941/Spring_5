package com.kodilla.spring.calculator;

import com.kodilla.spring.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double resultAdd = calculator.add(4,4);
        Double resultSub = calculator.sub(4,4);
        Double resultMul = calculator.mul(4,4);
        Double resultDiv = calculator.div(4,4);
        //Then
        Assert.assertEquals(8, resultAdd,0.0001);
        Assert.assertEquals(0, resultSub,0.0001);
        Assert.assertEquals(16, resultMul,0.0001);
        Assert.assertEquals(1, resultDiv,0.0001);
    }

}
