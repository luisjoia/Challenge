import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class textAnalyserTest {
    private TextAnalyser textAnalyser;


    @Before
    public void setup(){
        this.textAnalyser = TextAnalyser.getTextAnalyser();
    }

    @Test
    @Parameters({
            "ITCLiNicAl, 1, ITCLNA",
            "ITCLiNicAl, 2, TLN",
            "ITCLiNicAl, 3, CNA",
            "ITCLiNicAl, 100, ",
            "ITCLiNicAl, 0, ",
            "ITCLiNicAl, -1, ",
            ", 1, "
    })
    /**
     * getUppercase method should only return uppercase letters every Nth character
     */
    public void getUppercase_Should_Only_Get_Uppercase_Letters_Every_Nth_Character(String text, int nthChar, String expectedResult){
        String result = textAnalyser.getUppercase(text, nthChar);

        Assert.assertEquals(expectedResult, result);
    }
}
