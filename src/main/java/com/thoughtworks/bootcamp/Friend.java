package com.thoughtworks.bootcamp;

public class Friend {

    String name;
    double amountToSpend;
    double amountSpent;

    public Friend(String name, double amountToSpend, double amountSpent) {
        this.name = name;
        this.amountToSpend = amountToSpend;
        this.amountSpent = amountSpent;
    }

    public double settingAmountToSpend() {
        return amountToSpend;
    }
}

