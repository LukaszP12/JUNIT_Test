import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class countATest {

    @Test
    public void test(){
        JunitTesting junitTesting = new JunitTesting();
        int output = junitTesting.countA("javabean");
        assertEquals(3,output);
    }

}
