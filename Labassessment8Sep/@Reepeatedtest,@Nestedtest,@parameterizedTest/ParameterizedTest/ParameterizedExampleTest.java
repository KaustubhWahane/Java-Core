import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.Assertions.assertTrue;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedExampleTest {
    @ParameterizedTest
    @ValueSource(strings ={'Kaustubh',"Anushka","Devesh"} )
    void isPalindrome(String text){
        assertTrue(ParameterizedExample.isPalindrome(text));
    }
}
