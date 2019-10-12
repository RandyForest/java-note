import aop.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: randy
 * Date: 2019/10/10 20:55
 */
public class AopTest {
    @Test
    void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./aop.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("aopUserDaoProxy");

        userDao.addUser();
        userDao.removeUser();
    }
}
