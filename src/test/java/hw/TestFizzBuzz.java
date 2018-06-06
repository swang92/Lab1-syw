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

    String [] methodOutput = {"This need to be an positive integer > 0"};

    @Test
    public void testNegativeTen(){
        assertArrayEquals(methodOutput, fixture.fizzBuzzArray(-10));
    }

    @Test
    public void testNegativeOne(){
        assertArrayEquals(methodOutput, fixture.fizzBuzzArray(-1));
    }

    @Test
    public void testZero(){
        assertArrayEquals(methodOutput, fixture.fizzBuzzArray(0));
    }


   @Test
    public void testPositiveOne(){
        String [] output = {"1"};
        assertArrayEquals(output, fixture.fizzBuzzArray(1));
            }

    @Test
    public void testPositiveSeven(){
        String [] output = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"};
        assertArrayEquals(output, fixture.fizzBuzzArray(7));
    }

    @Test
    public void testPositiveSeventeen(){
        String [] output = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
        "13", "14", "Fizz Buzz", "16", "17" };
        assertArrayEquals(output, fixture.fizzBuzzArray(17));
    }



}
