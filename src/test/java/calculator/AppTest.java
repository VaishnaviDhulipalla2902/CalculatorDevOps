package App;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	App calc = new App();

	@Test
	public void squareRoot_test(){
		assertEquals("True Positive for SquareRoot",5.0,App.squareRoot(25.0),0.0f);
	}

	@Test
	public void factorial_test(){
        assertEquals("True Positive for Factorial", 120, App.factorial(5), 0.0f);
    }

    @Test
    public void naturalLog_test(){
        assertEquals("True Positive for Natural Log", 1.0, App.naturalLog(2.718), 0.2f);
    }

    @Test
    public void power_test(){
        assertEquals("True Positive for Power", 32.0, App.power(2.0, 5.0), 0.0f);
    }


}

