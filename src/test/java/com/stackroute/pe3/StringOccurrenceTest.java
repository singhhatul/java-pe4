//package com.stackroute.pe3;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class StringOccurrenceTest {
//    StringOccurrence occurrence;
//
//    /* @Before annotation is used on a method containing Java
//       code to run before each test case. i.e it runs before each test execution.
//        In the setup method ,object of class is declared
//       */
//    @Before
//    public void setUp() {
//        this.occurrence = new StringOccurrence();
//    }
//
//    /*  @After annotation is used on a method containing java code to run after each test case.
//    These methods will run even if any exceptions are thrown in the test case or in the case
//    of assertion failures.
//    In the tear down method ,object is initialized with null so that obj is destroyed
//    */
//    @After
//    public void tearDown() {
//        this.occurrence = null;
//    }
//
//    @Test
//    public void givenStringInputShouldReturnIndexOfOccurrence() {
//        String actualResult = "Found at: 4 - 6\n" + "Found at: 10 - 12\n" +
//                "Found at: 27 – 29";
//        String expectedResult = occurrence.occurrrenceOfString("She sells seashells by the seashore", "se");
//        assertEquals(expectedResult, actualResult);
//
//    }
//    @Test
//    public void givenInputShouldNull() {
//        String expectedOutput = "string input is null";
//        String actualOutput = occurrence.occurrenceOfString(null, "ab");
//        assertEquals(expectedOutput, actualOutput);
//    }
//    @Test
//    public void givenStringInputShouldReturnIndexOfOccurrence() {
//        String actualResult = "not found in the string";
//        String expectedResult = occurrence.occurrrenceOfString("She sells seashells by the seashore", "se");
//        assertEquals(expectedResult, actualResult);
//
//    }
//}