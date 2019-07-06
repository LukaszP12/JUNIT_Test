import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class square_test {

    @Test
    public void squareTest(){
        JunitTesting junitTesting = new JunitTesting();
        int output = junitTesting.square(5);
        assertEquals(25,output);
    }

}
