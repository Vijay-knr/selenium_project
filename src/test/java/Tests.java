import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Tests {

    public static void main(String args[]) {
        System.out.println("This is main method");
    }

    @Test
    public void test1_assertTrue() {
        System.out.println("Starting assert true test");
        assertTrue("This is failed", true);
        System.out.println("Test PASSED");
    }

    @Test
    public void test1_assertEquals() {
        System.out.println("This is assert equals test");
        assertEquals("This is failed", true, true);
        System.out.println("Test PASSED");
    }
}
