package com.junit.testing.tests;

import com.junit.testing.AccountBank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountBankTest {

    @Test
    public void depositShouldIncreaseBalanceAndDiscountFeeWhenPositiveAmount(){

        double amount = 200.0;
        double expectedValue = 196.0;
        AccountBank accountBank = new AccountBank(1L , 0.0) ;

        accountBank.deposit(amount);

        Assertions.assertEquals(expectedValue, accountBank.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount(){

        double expectedValue = 100.0;
        AccountBank accountBank = new AccountBank(1L , expectedValue) ;
        double amount = -200.0;

        accountBank.deposit(amount);

        Assertions.assertEquals(expectedValue , accountBank.getBalance());

    }
}


