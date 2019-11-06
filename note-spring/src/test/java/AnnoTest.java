import com.randy.note.anno.Application;
import com.randy.note.anno.UserService;
import com.randy.note.anno.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author: randy
 * Date: 2019/11/6 21:53
 */
@ComponentScan
public class AnnoTest {
    @Test
   void test(){
        System.out.println("Application.main()");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
        UserService userService= applicationContext.getBean(UserServiceImpl.class);
        userService.say();
    }
}
