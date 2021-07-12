package sequality;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculateTest{
@Test
public void testSum() {
Calculate calculate = new Calculate();
double a=calculate.sum(2,3);
double b=calculate.sum2(1,10);
int expected = 5;
assertEquals(expected,calculate.sum(2, 3));
expected = 55;
assertEquals(expected,calculate.sum2(1,10));
expected = 25;
assertEquals(expected,calculate.sumodd(1,10));
expected = 30;
assertEquals(expected,calculate.sumeven(1,10));
}
}