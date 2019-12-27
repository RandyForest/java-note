import org.junit.jupiter.api.Test;

/**
 * Author: randy
 * Date: 2019/12/25 23:01
 */
public class SplitTest {
    @Test
    void test() {
        String[] strings = {"aaa", "bbb", "ccc"};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            // System.out.println(strings[i]);
            if (i < strings.length - 1)
                stringBuilder.append(strings[i]).append(".");
            else {
                stringBuilder.append(System.currentTimeMillis()).append(".").append(strings[i]);
            }
        }
        System.out.println(stringBuilder);
    }
}
