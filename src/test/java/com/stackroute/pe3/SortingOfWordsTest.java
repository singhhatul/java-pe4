package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingOfWordsTest {
    SortingOfWords wordSort;
    /* @Before annotation is used on a method containing Java
   code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
   */
    @Before
    public void setUp()  {
        this.wordSort=new SortingOfWords();
    }
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {
        this.wordSort=null;
    }

    @Test
    public void givenInputShouldReturnSortedString(){
        String actualResult="aajv is a aaegglnu";
        String expectedResult=wordSort.wordsSorting("java is a language");
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenNullInputShouldReturnErrorMessage(){
        String actualResult="string input is null";
        String expectedResult=wordSort.wordsSorting(null);
        assertEquals(expectedResult,actualResult);
    }

}