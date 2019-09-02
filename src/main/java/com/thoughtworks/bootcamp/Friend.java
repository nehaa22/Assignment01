package com.thoughtworks.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Friend {

    String name;
    List<String> personInList = new ArrayList<String>();
    double money;

    public Friend(String name, List<String> personInList, double money) {
        this.name = name;
        this.personInList = personInList;
        this.money = money;
    }

    public double settingAmountToSpend(Double amountSpent) {
        return amountSpent;
    }

    public double calculateDividedAmount() {
        return money / personInList.size();
    }

    public double calculateEachPersonAmount() {

        double amount = calculateDividedAmount();
        double calculation = amount*3;
        return  calculation;
    }
}

