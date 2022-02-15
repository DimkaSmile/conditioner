package ru.netology.domain;

public class Conditioner {
    private int currentTemperature;
    public int getCurrentTemperature(){
        return currentTemperature;
    }
public void setToMaximum(){
            currentTemperature = 30;
    }
    public void increase50p(){
        setCurrentTemperature(150 * currentTemperature / 100);

    }




    public void setCurrentTemperature(int newCurrentTemperature) {
        if (newCurrentTemperature <0) {
            return;
        }
        if (newCurrentTemperature > 30) {
            return;
        }
        currentTemperature = newCurrentTemperature;
    }

    }




