import com.database.driver.ConnectionPoolTest;
import com.database.driver.ConnectionTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        [
            ConnectionPoolTest.class,
            ConnectionTest.class
        ])
public class ProfileTestSuite {

}