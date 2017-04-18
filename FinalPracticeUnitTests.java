

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class FinalPracticeUnitTests.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FinalPracticeUnitTests
{
    /**
     * Convert Fahrenheit to Celcius
     */
    @Test
    public void Test1FahrenheitToCelciusCalc()
    {
        assertEquals(0, Helper.FahrenheitToCelsius(32), 0.01);
        assertEquals(5, Helper.FahrenheitToCelsius(41), 0.01);
        assertEquals(10, Helper.FahrenheitToCelsius(50), 0.01);
        assertEquals(20, Helper.FahrenheitToCelsius(68), 0.01);
    }

    /*
     * Check if a temperature is above, below or at freezing
     */
    @Test
    public void Test2Freezing()
    {
    	assertEquals("at freezing", Helper.isFreezing(32));
    	assertEquals("below freezing", Helper.isFreezing(0));
    	assertEquals("below freezing", Helper.isFreezing(20));
    	assertEquals("above freezing", Helper.isFreezing(40));
    	assertEquals("above freezing", Helper.isFreezing(100));
    }
    
    /*
     * Find the smallest number that is divisible by both the given numbers.
     */
    @Test
    public void Test3FindSmallestNumberDivisible()
    {
    	assertEquals(24, Helper.SmallestNumberDivisibleBy(6, 8));
    	assertEquals(40, Helper.SmallestNumberDivisibleBy(10, 8));
    	assertEquals(30, Helper.SmallestNumberDivisibleBy(6, 10));
    }
    
    /*
     * Find the range of an array
     */
    @Test
    public void Test4FindArrayRange()
    {
    	double[] values1 = {0.0, 10.0};
    	assertEquals(10.0, Helper.FindRange(values1), 0.01);
    	double[] values2 = {1.0, 2.0, 3.0, 4.0};
    	assertEquals(3.0, Helper.FindRange(values2), 0.01);
    	double[] values3 = {5.0, 1.0, -2.0, -4.0, 3.0};
    	assertEquals(9.0, Helper.FindRange(values3), 0.01);
    }
    
    /*
     * Sum the sum of first n numbers
     */
    @Test
    public void Test5SumOfSum()
    {
    	assertEquals(3, Helper.SumofSumFrom0(1, 1, 1));
    	assertEquals(5, Helper.SumofSumFrom0(1, 1, 2));
    	assertEquals(5, Helper.SumofSumFrom0(1, 2, 1));
    	assertEquals(10, Helper.SumofSumFrom0(3, 2, 1));
    }
    
    /*
     * Test toString function of Circle is correct
     */
    @Test
    public void Test6ShapeToString()
    {
    	Shape c1 = new Circle(10);
    	assertEquals("Circle (r=10)", c1.toString());
    	Shape c2 = new Circle(1);
    	assertEquals("Circle (r=1)", c2.toString());
    }
    
    /*
     * Test that the car is initialized properly and that
     * the monthly payment over 60 months is calculated
     * correctly.
     */
    public void Test7CarPayments()
    {
    	Car c1 = new Car("Ford Focus 2017", 15000);
    	assertEquals("Ford Focus 2017", c1.getName());
    	assertEquals(15000, c1.getPrice(), .01);
    	assertEquals(250, c1.getMonthly_payment(), 0.01);
    	
    	Car c2 = new Car("Ford Escape 2017", 20000);
    	assertEquals("Ford Escape 2017", c2.getName());
    	assertEquals(20000, c2.getPrice(), .01);
    	assertEquals(333.333, c2.getMonthly_payment(), .01);
    }
}
