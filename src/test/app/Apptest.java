package app;

import org.junit.Assert;
import org.junit.Test;

public class Apptest {

    @Test
    public void mainTest() {
        int numberFactorial = 7;
       int result  =  App.findFactorial(numberFactorial);
        Assert.assertEquals(5040, result);
    }

}
