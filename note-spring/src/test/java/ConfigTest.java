import com.randy.note.anno.Config;
import com.randy.note.anno.UserService;
import com.randy.note.anno.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author: randy
 * Date: 2019/11/7 0:05
 */
public class ConfigTest {
    @Test
    void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = applicationContext.getBean(UserServiceImpl.class);
        userService.say();
    }
}
