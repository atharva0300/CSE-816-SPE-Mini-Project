import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    // ---------- SQRT TESTS ----------

    @Test
    public void testSqrt1(){
        assertEquals(4.0, Main.sqrt(16), 0.001);
    }

    @Test
    public void testSqrt2(){
        assertEquals(5.0, Main.sqrt(25), 0.001);
    }

    @Test
    public void testSqrt3(){
        assertEquals(3.0, Main.sqrt(9), 0.001);
    }

    @Test
    public void testSqrt4(){
        assertEquals(1.0, Main.sqrt(1), 0.001);
    }

    @Test
    public void testSqrt5(){
        assertEquals(0.0, Main.sqrt(0), 0.001);
    }

    @Test
    public void testSqrt6(){
        assertEquals(7.0, Main.sqrt(49), 0.001);
    }

    @Test
    public void testSqrt7(){
        assertEquals(10.0, Main.sqrt(100), 0.001);
    }

    @Test
    public void testSqrt8(){
        assertEquals(Math.sqrt(2), Main.sqrt(2), 0.001);
    }

    @Test
    public void testSqrt9(){
        assertEquals(Math.sqrt(50), Main.sqrt(50), 0.001);
    }


    // ---------- FACTORIAL TESTS ----------

    @Test
    public void testFactorial1(){
        assertEquals(1, Main.factorial(0));
    }

    @Test
    public void testFactorial2(){
        assertEquals(1, Main.factorial(1));
    }

    @Test
    public void testFactorial3(){
        assertEquals(2, Main.factorial(2));
    }

    @Test
    public void testFactorial4(){
        assertEquals(6, Main.factorial(3));
    }

    @Test
    public void testFactorial5(){
        assertEquals(24, Main.factorial(4));
    }

    @Test
    public void testFactorial6(){
        assertEquals(120, Main.factorial(5));
    }

    @Test
    public void testFactorial7(){
        assertEquals(720, Main.factorial(6));
    }

    @Test
    public void testFactorial8(){
        assertEquals(5040, Main.factorial(7));
    }

    @Test
    public void testFactorial9(){
        assertEquals(40320, Main.factorial(8));
    }

    @Test
    public void testFactorial10(){
        assertEquals(3628800, Main.factorial(10));
    }


    // ---------- LN TESTS ----------

    @Test
    public void testLn1(){
        assertEquals(0.0, Main.ln(1), 0.001);
    }

    @Test
    public void testLn2(){
        assertEquals(1.0, Main.ln(Math.E), 0.001);
    }

    @Test
    public void testLn3(){
        assertEquals(Math.log(2), Main.ln(2), 0.001);
    }

    @Test
    public void testLn4(){
        assertEquals(Math.log(5), Main.ln(5), 0.001);
    }

    @Test
    public void testLn5(){
        assertEquals(Math.log(10), Main.ln(10), 0.001);
    }

    @Test
    public void testLn6(){
        assertEquals(Math.log(20), Main.ln(20), 0.001);
    }

    @Test
    public void testLn7(){
        assertEquals(Math.log(50), Main.ln(50), 0.001);
    }

    @Test
    public void testLn8(){
        assertEquals(Math.log(100), Main.ln(100), 0.001);
    }


    // ---------- POWER TESTS ----------

    @Test
    public void testPower1(){
        assertEquals(8.0, Main.power(2,3), 0.001);
    }

    @Test
    public void testPower2(){
        assertEquals(16.0, Main.power(2,4), 0.001);
    }

    @Test
    public void testPower3(){
        assertEquals(27.0, Main.power(3,3), 0.001);
    }

    @Test
    public void testPower4(){
        assertEquals(81.0, Main.power(3,4), 0.001);
    }

    @Test
    public void testPower5(){
        assertEquals(1.0, Main.power(5,0), 0.001);
    }

    @Test
    public void testPower6(){
        assertEquals(5.0, Main.power(5,1), 0.001);
    }

    @Test
    public void testPower7(){
        assertEquals(100.0, Main.power(10,2), 0.001);
    }

    @Test
    public void testPower8(){
        assertEquals(0.25, Main.power(2,-2), 0.001);
    }
}