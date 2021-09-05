package usernametest;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static validateusername.Username.isValidUsername;

public class TDDTest {
    @Test
    public void validateUsername(){
        String username = "validusername";
        String username1="test data";
        String username2="test@123";
        String username3="test_data";
        String username4="test/data";
        String username5="test#data";

        assertTrue(isValidUsername(username));
        assertFalse(isValidUsername(username1));
        assertFalse(isValidUsername(username2));
        assertFalse(isValidUsername(username3));
        assertFalse(isValidUsername(username4));
        assertFalse(isValidUsername(username5));
    }



}
