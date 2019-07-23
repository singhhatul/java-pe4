package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose transpose;
    /* @Before annotation is used on a method containing Java
   code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
   */
    @Before
    public void setUp()  {
        this.transpose=new StringTranspose();
    }
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {
        this.transpose=null;
    }
    @Test
    public void givenStringInputShouldReturnTransposeOfInput(){
        String actualResult="a kciuq nworb xof spmuj revo eht yzal god ";
        String expectedResult=transpose.stringTransposing("a quick brown fox jumps over the lazy dog");
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenInputShouldNull() {
        String expectedOutput = "string input is null";
        String actualOutput = transpose.stringTransposing(null);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void givenStringInputShouldReturnTransposeOfIntegerInput() {
        String actualResult = "4321 8765 ";
        String expectedResult = transpose.stringTransposing("1234 5678");
        assertEquals(expectedResult, actualResult);
    }

}