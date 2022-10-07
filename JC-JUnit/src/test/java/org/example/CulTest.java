package org.example;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CulTest {

    @Test
    public void validDay() {
        Methods Methods = new Methods();

        int money = 150000;
        double expectedResult = 4838;
        double result = Methods.culDay(money);

        Assertions.assertEquals(result, expectedResult);
    }

    @Test
    public void validBalance() {
        Methods Methods = new Methods();

        int money = 150000;
        double expectedResult = 37500;
        double result = Methods.culBalance(money);

        Assertions.assertEquals(result, expectedResult);
    }


}