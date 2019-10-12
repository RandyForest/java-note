import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import start.UserDao;

/**
 * Author: randy
 * Date: 2019/10/8 14:29
 */
public class UserDaoTest {
    /**
     * 使用Spring容器创建一个实例，并使用该实例的一个方法
     */
    @Test
    void test1(){
        //1. 初始化spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./applicationContext.xml");

        //2. 使用配置文件创建的对象获取 UserDao 实例，传入的值是配置文件中bean标签的id
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        //3. 调用方法
        userDao.say();
    }
}
