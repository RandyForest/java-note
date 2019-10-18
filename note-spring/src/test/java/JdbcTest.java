import jsbc.User;
import jsbc.UserDao;
import jsbc.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Author: randy
 * Date: 2019/10/17 12:17
 */
public class JdbcTest {
    /**
     * 测试配置能否查询
     */
    @Test
    void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");

        // 执行查询
        jdbcTemplate.query("select * from user", rs -> {
            System.out.print("id: " + rs.getInt("id"));
            System.out.print(", name: " + rs.getString("name"));
            System.out.print(", birthday: " + rs.getDate("birthday"));
            System.out.print(", sex: " + rs.getString("sex"));
            System.out.println(", address: " + rs.getString("address"));
        });
    }

    /**
     * 测试查询
     */
    @Test
    void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");

        // 执行查询
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user");
        maps.forEach(stringObjectMap -> {
            stringObjectMap.forEach((s, o) -> System.out.println(s + ": " + o));
            System.out.println("-------------");
        });
    }

    /**
     * 测试添加操作
     */
    @Test
    void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        User user = new User();
        user.setName("naa");
        user.setPassword("naa");
        Calendar calendar = Calendar.getInstance();
        calendar.set(100, Calendar.FEBRUARY, 2);
        user.setBirthday(new Date(calendar.getTimeInMillis()));
        // user.setBirthday(new Date(System.currentTimeMillis()));
        user.setSex("男");
        user.setAddress("香港");

        int add = userDao.add(user);
        System.out.println("添加操作，改动 " + add + " 行");
    }

    /**
     * 测试删除操作
     */
    @Test
    void test4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        int delete = userDao.delete(8);
        System.out.println("删除操作，改动 " + delete + " 行");
    }

    @Test
    void testUpdate(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        User user = new User();
        user.setId(12);
        user.setPassword("paaaaa");

        int update = userDao.update(user);
        System.out.println("更新操作，改动 " + update + " 行");
    }

    /**
     * 测试验证用户名密码操作
     */
    @Test
    void  test5(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        // 输入正确密码
        User user = userDao.check("naa", "naa");
        System.out.println(user);

        // 输入错误密码
        User user2 = userDao.check("naa", "naaa");
        System.out.println(user2);

        // 利用sql漏洞
        User user3 = userDao.check("naa", "naaa' or 1=1#");
        System.out.println(user3);

    }

    /**
     * 测试查询
     */
    @Test
    void testQuery(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        User user = userDao.query(13);
        System.out.println(user);
    }

    /**
     * 测试查询全部
     */
    @Test
    void testQueryAll(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        List<User> users = userDao.queryAll();
        System.out.println(users);
    }
}
