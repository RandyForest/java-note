package dynamicagent;

/**
 * Author: randy
 * Date: 2019/10/10 13:23
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void removeUser() {
        System.out.println("移除用户");
    }
}
