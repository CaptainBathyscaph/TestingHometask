import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void sumLongTest()
    {
        Calculator calculator = new Calculator();
        long result = calculator.sum(5, 10);
        Assert.assertEquals(result, 15);
    }

    @Test
    public void sumDoubleTest()
    {
        Calculator calculator = new Calculator();
        double result = calculator.sum(3.7, 6.5);
        Assert.assertEquals(result, 10.2);
    }

    @Test
    public void subLongTest()
    {
        Calculator calculator = new Calculator();
        long result = calculator.sub(10, 5);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void subDoubleTest()
    {
        Calculator calculator = new Calculator();
        double result = calculator.sub(8.7, 5.4);
        Assert.assertEquals(result, 3.3);
    }

    @Test
    public void multLongTest()
    {
        Calculator calculator = new Calculator();
        long result = calculator.mult(10, 5);
        Assert.assertEquals(result, 50);
    }

    @Test
    public void multDoubleTest()
    {
        Calculator calculator = new Calculator();
        double result = calculator.mult(0.5, 12);
        Assert.assertEquals(result, 6.0);
    }

    @Test
    public void divLongTest()
    {
        Calculator calculator = new Calculator();
        long result = calculator.div(15, 5);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void divtDoubleTest()
    {
        Calculator calculator = new Calculator();
        double result = calculator.div(10, 0.5);
        Assert.assertEquals(result, 20.0);
    }

    @Test
    public void powTest()
    {
        Calculator calculator = new Calculator();
        double result = calculator.pow(2.5, 0);
        Assert.assertEquals(result, 1.0);
    }

    @Test
    public void sqrtTest()
    {
        Calculator calculator = new Calculator();
        double result = calculator.sqrt(100);
        Assert.assertEquals(result, 10.0);
    }

    @Test
    public void tgTest()
    {
        Calculator calculator = new Calculator();
        double result = calculator.tg(10);
        Assert.assertEquals(result, 0.648361);
    }

    @Test
    public void сtgTest()
    {
        Calculator calculator = new Calculator();
        double result = calculator.ctg(10);
        Assert.assertEquals(result, 1.54235);
    }

    @Test
    public void cosTest()
    {
        Calculator calculator = new Calculator();
        double result = calculator.cos(10);
        Assert.assertEquals(result, -0.839071);
    }

    @Test
    public void sinTest()
    {
        Calculator calculator = new Calculator();
        double result = calculator.sin(10);
        Assert.assertEquals(result, -0.544021);
    }

    @Test
    public void isPositiveTest()
    {
        Calculator calculator = new Calculator();
        boolean result = calculator.isPositive(1);
        Assert.assertEquals(result, true);
    }

    @Test
    public void isNegativeTest()
    {
        Calculator calculator = new Calculator();
        boolean result = calculator.isPositive(-1);
        Assert.assertEquals(result, true);
    }
}
