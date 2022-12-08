import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;


public class RepeatedTestExample {
@DisplayName ("Testcase for Multiplication")
@RepeatedTest (5)    
 void multiply (TestInfo testInfo) 
 {
        int a, b;
            a=10;
         b=20;
             assertEquals(200, (a*b), "Matched. Test status - Passed");
}
      
}