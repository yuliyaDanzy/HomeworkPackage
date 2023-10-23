package ru.netology.Homepackage.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CountRestClassTest {

@ParameterizedTest
@CsvFileSource (files = "src/test/resources/restCount.csv")

public void CountRestServiceTest(int expected,int income,int expenses,int threshold){

        CountRestService service=new CountRestService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
        }
}


