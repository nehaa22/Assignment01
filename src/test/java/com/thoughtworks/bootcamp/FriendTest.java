package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FriendTest {

    @Test
    void GivenZeroAmountSpentForSinglePerson_WhenCalculatedAmount_To_Spend_ThenShouldReturnZero()
    {
        Friend friend = new Friend("Cool",0.0,0.0);
        Assertions.assertEquals(0.0,friend.settingAmountToSpend(0.0));
    }

    @Test
    void GivenPositiveAmountSpentForSinglePerson_WhenCalculatedAmount_To_Spend_ThenShouldReturnThatAmount()
    {
       Friend friend = new Friend("Ashu",100.0,0.0);
       Assertions.assertEquals(100,friend.settingAmountToSpend(100.0));
   }




}
