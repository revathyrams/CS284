import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringTest {
    @Test
    void compareEqualsSameLenStrings(){
        MyString s = new MyString("hoboken");

        assertTrue(s.compareEquals("hoboken"));

    }

    @Test
    void compareEqualsDiffLenStrings(){
        MyString s = new MyString("hoboken");

        assertFalse(s.compareEquals("ho"));
    }

    @Test
    void compareEqualsWithOneNullString(){
        MyString s = new MyString("hoboken");

        assertFalse(s.compareEquals(null));
    }

    @Test
    void compareEqualsWithBothStringsNull(){
        MyString s = new MyString(null);

        assertTrue(s.compareEquals(null));
    }

    @Test
    void compareEqualsEmptyStrings(){
        MyString s = new MyString("");

        assertTrue(s.compareEquals(""));
    }

    @Test
    void reverseStringWithManyChars(){
        MyString s = new MyString("hoboken");
        String expected = "nekoboh";

        String actual = s.reverse();

        assertEquals(expected.length(), actual.length());
        assertEquals(expected, actual);
        assertNotSame(expected, actual);
        // Note that `expected` and `actuals` are 2 different objects in memory
    }

    @Test
    void reverseEmptyString(){
        MyString s = new MyString("");
        String expected = ""; // Empty String literal

        String actual = s.reverse();

        assertEquals(expected, actual);
        assertSame(expected, actual);

        /*
         An empty String literal is denoted by "".
         All empty String literals are referenced to a single memory instance.
         So `expected` and `actual` are the same objects in memory.
        */
    }

    @Test

    void concatenateShouldReturnNewString(){
        MyString s = new MyString("hoboken");
        String anotherString = " nj";
        String expected = "hoboken nj";

        String actual = s.concatenate(anotherString);

        assertEquals(expected, actual);
        assertNotSame(expected, actual);
    }

    @Test
    void concatenateWithNullString(){
        MyString s = new MyString(null);
        String anotherString = "hoboken nj";
        String expected = "hoboken nj";

        String actual = s.concatenate(anotherString);

        assertEquals(expected, actual);

    }

    @Test
    void concatenateTwoNullStrings(){
        MyString s  = new MyString(null);

        String actual = s.concatenate(null);

        assertEquals("", actual);
        /*
            An empty StringBuffer refers to an empty String literal
        */
    }

}