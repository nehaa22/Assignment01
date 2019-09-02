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
}
