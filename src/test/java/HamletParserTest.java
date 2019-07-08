import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {

        String hamlet = "Hamlet";
        String expected = "Leon";
        Converter converter = new Converter(hamlet);

        converter.replace("(Hamlet)", expected);
        String actual = converter.toString();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testChangeHoratioToTariq() {
        String hamlet = "Horatio";
        String expected = "Tariq";
        Converter converter = new Converter(hamlet);

        converter.replace("(Horatio)", expected);
        String actual = converter.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHoratio() {
    }

    @Test
    public void testFindHamlet() {
    }
}