package kata;

import org.junit.Test;

import static org.junit.Assert.*;
import static kata.Same.comp;
public class SameTest {

    @Test
    public void Test(){
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertTrue(comp(a,b));
    }

}