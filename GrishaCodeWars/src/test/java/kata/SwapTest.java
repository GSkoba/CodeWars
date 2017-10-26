package kata;

import org.junit.Test;

import static org.junit.Assert.*;
import static kata.Swap.swap;
public class SwapTest {
    @Test
    public void test1(){
       // assertEquals(" WORLD", swap("Hello world"));
        assertEquals("HEllOWOrld!",swap("HelloWorld!"));

    }

}