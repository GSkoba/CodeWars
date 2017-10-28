package Kata;

import org.junit.Test;
import static Kata.Dinglemouse.paintLetterboxes;
import static org.junit.Assert.*;

public class DinglemouseTest {
    @Test
    public void paintLetterboxesTest() throws Exception {
        assertArrayEquals(new int[]{1,9,6,3,0,1,1,1,1,1}, Dinglemouse.paintLetterboxes(125,132));
    }

}