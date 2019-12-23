import org.junit.jupiter.api.Test;

/**
 * Author: randy
 * Date: 2019/12/21 20:53
 */
public class MatcherTest {
    @Test
    void test(){
        boolean matches = "1999-1".matches("\\d+-\\d+");
        System.out.println(matches);
    }
}
