 package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestFizzBuzz {

    private FizzBuzz fixture;

//    @before
    public void setUp() throws Exception {
        fixture = new FizzBuzz();
    }

//    @After
    public void tearDown() throws Exception {
        fixture = null;
    }

    @Test

    public void testNull() {
        assertNull(fixture.fizzBuzz(-10));
    }
//
//    @Ignore
//    @Test (expected = NumberFormatException.class)
//    public void testNegativeTen() {
    //        assertNull(fixture.fizzBuzz(-10));
//    }
//
//    @Ignore
//    @Test (expected = IllegalArgumentException.class)
//    public void testNegativeOne(){
//        assertNull(fixture.fizzBuzz(-1));
//    }
//
//    @Ignore
//    @Test
//    public void testZero(){
//        assertNull(fixture.fizzBuzz(0));
//    }
//
//    @Ignore
//    @Test
//    public void testPostiveOne(){
//        String [] methodOutput = {"1"};
//        assertArrayEquals(fixture.fizzBuzz(1),methodOutput);
//    }
//
//    @Ignore
//    @Test
//    public void testPositiveSeven(){
//        String [] methodOutput = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"};
//        assertArrayEquals(fixture.fizzBuzz(7),methodOutput);
//    }
//
//    @Ignore
//    @Test
//    public void testPositiveSeventeen(){
//        String [] methodOutput = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
//        "13", "14", "Fizz Buzz", "16", "17" };
//        assertArrayEquals(fixture.fizzBuzz(17),methodOutput);
//    }



}
