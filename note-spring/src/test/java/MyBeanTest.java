import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.randy.note.start.MyBean;

/**
 * Author: randy
 * Date: 2019/10/8 23:21
 */
public class MyBeanTest {
    /**
     * 测试能否使用Spring创建的Bean实例并调用Bean的方法
     */
    @Test
    void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./applicationContext.xml");
        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        myBean.setName("Beannnn");
        System.out.println(myBean.getName());
    }

    /**
     * 使用静态工厂方法创建实例
     * 本测试方法只用更改工厂类的参数
     */
    @Test
    void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./applicationContext.xml");
        MyBean myBean = (MyBean) applicationContext.getBean("myBean2");
        myBean.setName("Beannnn2");
        System.out.println(myBean.getName());
    }

    /**
     * 使用静态工厂方法创建实例
     * 本测试方法只用更改工厂类的参数
     */
    @Test
    void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./applicationContext.xml");
        MyBean myBean = (MyBean) applicationContext.getBean("myBean3");
        myBean.setName("Beannnn3");
        System.out.println(myBean.getName());
    }
}
