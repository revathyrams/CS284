import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyTest {

    @Test
    void countOfShouldReturnOne() {
        //setup
        int[] input = {1};
        Frequency f = new Frequency(input);

        //make the call
        int  actual = f.countOf(1);
        int expected = 1;

        //test the result
        assertEquals(expected, actual);

    }

    @Test
    void countOfShouldReturnZero() {
        int[] input = {1, 2, 3};
        Frequency f = new Frequency(input);

        int actual = f.countOf(5);

        assertEquals(0, actual);
    }

    @Test
    void countOfShouldReturnGreaterThanOne(){
        int[] input = {1, 2, 1, 1, 4, 5};
        Frequency f = new Frequency(input);

        int actual = f.countOf(1);

        assertEquals(3, actual);

    }

}