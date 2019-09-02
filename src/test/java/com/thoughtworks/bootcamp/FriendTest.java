package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FriendTest {


   @Test
   void GivenZeroAmountSpentForSinglePerson_WhenCalculatedAmount_To_Spend_ThenShouldReturnZero()
    {
        List<String> personInList = new ArrayList<String>();
        personInList.add("Ashu");
        Friend friend = new Friend("Ashu",personInList,0.0);
        Assertions.assertEquals(0.0,friend.settingAmountToSpend(0.0));
    }

    @Test
    void GivenPositiveAmountSpentForSinglePerson_WhenCalculatedAmount_To_Spend_ThenShouldReturnThatAmount()
    {
        List<String> personInList = new ArrayList<String>();
        personInList.add("Ashu");
        Friend friend = new Friend("Ashu",personInList,100.0);
        Assertions.assertEquals(100.0,friend.settingAmountToSpend(100.0));
    }

    @Test
    void GivenNegativeAmountSpentForSinglePerson_WhenCalculatedAmount_To_Spend_ThenShouldReturnThatAmount()
    {
        List<String> personInList = new ArrayList<String>();
        personInList.add("Ashu");
        Friend friend = new Friend("Ashu",personInList,100.0);
        Assertions.assertEquals(100.0,friend.settingAmountToSpend(100.0));
    }

    @Test
    void givenAmountSpentForFourPerson_WhenCalculatedAmount_ThenShouldReturnDividedAmount()
    {
        String name;
        List<String> personInList = new ArrayList<String>();
       double amountSpent;

        personInList.add("Ashu");
        personInList.add("Bunny");
        personInList.add("Catty");
        personInList.add("Doggy");

        Friend friend = new Friend("Ashu",personInList,100.0);
        Assertions.assertEquals(25,friend.calculateDividedAmount());
    }

    void givenAmountSpentForTwoPerson_WhenCalculatedAmount_ThenShouldReturnDividedAmountof500()
    {
        String name;
        List<String> personInList = new ArrayList<String>();
        double amountSpent;

        personInList.add("Catty");
        personInList.add("Doggy");

        Friend friend = new Friend("Bunny",personInList,500.0);
        Assertions.assertEquals(250,friend.calculateDividedAmount());
    }

    void givenAmountSpentForTwoPerson_WhenCalculatedAmount_ThenShouldReturnDividedAmountof300()
    {
        String name;
        List<String> personInList = new ArrayList<String>();
        double amountSpent;

        personInList.add("Ashu");
        personInList.add("Bunny");

        Friend friend = new Friend("Doggy",personInList,300.0);
        Assertions.assertEquals(150,friend.calculateDividedAmount());
    }

    void givenAmountOfPerson_WhenCalculated_WhenCalculated_ThenShouldReturnDividesAmount()
    {
        List<String> personInList = new ArrayList<String>();
        String name;
        Friend friend = new Friend("Ashu",personInList,100.0);
        Assertions.assertEquals(75,friend.calculateEachPersonAmount());
    }

    void givenAmountOfPersonBunny_WhenCalculated_WhenCalculated_ThenShouldReturnDividesAmount()
    {
        List<String> personInList = new ArrayList<String>();
        String name;
        Friend friend = new Friend("Bunny",personInList,500.0);
        Assertions.assertEquals(325,friend.calculateBunnyAmount());
    }


}
