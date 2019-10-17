import aspectjanno.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: randy
 * Date: 2019/10/14 16:36
 */
public class AspectjAnnoTest {
    @Test
    void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./aspectj-annotation.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("auserDao");
        userDao.addUser();
    }
}
