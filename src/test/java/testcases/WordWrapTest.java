package testcases;

import junit.model.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;


public class WordWrapTest {
    public static final int LINE_LENGTH = 5;

    @Test
    public void lineShouldWrapIfOverLineLength()
    {
        String result = WordWrap.wrap("Sundeep Y",LINE_LENGTH);
        assertEquals("Sunde\nep Y",result);
    }

    @Test
    public void shortLinesShouldNotWrap()
    {
        String result = WordWrap.wrap("The",LINE_LENGTH);
        assertEquals("The",result);

    }
}
