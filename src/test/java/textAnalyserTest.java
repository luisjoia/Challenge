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



    @Test
    @Parameters({
            "!tCL1Nical, 1, !CL1N",
            "!tCL1Nical, 2, LN",
            "!tCL1Nical, 3, CN",
            "!tCL1Nical, 100, ",
            "!tCL1Nical, 0, ",
            "!tCL1Nical, -1, ",
            ", 1, "
    })
    /**
     * getNonLowercase method should only return all non lowercase characters every Nth character
     */
    public void getNonLowercase_Should_Only_Get_All_Non_Lowercase_Letters_Every_Nth_Character(String text, int nthChar, String expectedResult){
        String result = textAnalyser.getNonLowercase(text, nthChar);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    @Parameters({
            "ItCLINiCAL, 1, ICLINCAL"
    })
    /**
     * countUppercaseChars method should only return uppercase characters every Nth character and print it
     */
    public void countUppercaseChars_Should_Only_Get_Uppercase_Letters_Every_Nth_Character_AndPrint_The_Letters_Count(String text, int nthChar, String expectedResult){
        String result = textAnalyser.countUppercaseChars(text, nthChar);

        Assert.assertEquals(expectedResult, result);
    }
}
