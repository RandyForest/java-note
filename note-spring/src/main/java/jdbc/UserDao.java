package jdbc;

import java.util.List;

/**
 * Author: randy
 * Date: 2019/10/17 13:36
 */
public interface UserDao {
    /**
     * 添加用户
     *
     * @param user 用户对象
     * @return 影响的行数
     */
    public int add(User user);

    /**
     * 移除用户
     *
     * @param id 用户ID
     * @return 影响的行数
     */
    public int delete(int id);

    /**
     * 更新用户
     *
     * @param user 用户对象
     * @return 影响的行数
     */
    public int update(User user);

    /**
     * 验证用户
     *
     * @param name 用户名
     * @param password 密码
     * @return 用户对象
     */
    public User check(String name, String password);

    /**
     * 查询用户
     *
     * @param id 用户ID
     * @return 用户对象
     */
    public User query(int id);

    /**
     * 查询全部用户
     *
     * @return 所有用户对象列表
     */
    public List<User> queryAll();
}
