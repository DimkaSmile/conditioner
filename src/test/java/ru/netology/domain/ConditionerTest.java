package ru.netology.domain;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConditionerTest {

    @Test
    public void test() {
        Conditioner cond = new Conditioner();
        cond.setCurrentTemperature(10);

        //cond.currentTemperature = 10;
        //cond.setCurrentTemperature(50);
        //cond.setToMaximum();
        cond.increase50p();

        int expected = 15;
        int actual = cond.getCurrentTemperature(); //cond.currentTemperature;

        assertEquals(expected, actual);
    }



}