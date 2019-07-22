package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterOccurrenceTest {
    CharacterOccurrence characterOccurrence;
    /* @Before annotation is used on a method containing Java
   code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
   */
    @Before
    public void setUp()  {
        this.characterOccurrence=new CharacterOccurrence();
    }
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {
        this.characterOccurrence=null;
    }

    @Test
    public void givenInputShouldReturnCountOfCharacter(){
        String str="java java java java";
        int expectedResult=6;
        int actualResult=characterOccurrence.getCharacter(str,'a');
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void givenInputShouldReturnCountOfCharacter2(){
        String str="stackroute stackroute";
        int expectedResult=0;
        int actualResult=characterOccurrence.getCharacter(str,'z');
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenInputShouldReturnNull(){
        String str=null;
        int expectedResult=0;
        int actualResult=characterOccurrence.getCharacter(str,'a');
        assertEquals(expectedResult,actualResult);
    }

}