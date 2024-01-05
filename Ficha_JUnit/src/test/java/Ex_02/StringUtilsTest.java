package Ex_02;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {


    StringUtils stringUtils;

    @BeforeEach
    public void setUp(){
        stringUtils = new StringUtils();
    }

    @Test
    public void isPalindormeTest(){



        assertTrue(StringUtils.isPalindrome("123321"));
        assertTrue(StringUtils.isPalindrome("ana"));


        assertFalse(StringUtils.isPalindrome(null));
        assertFalse(StringUtils.isPalindrome("Lais"));


    }




}
