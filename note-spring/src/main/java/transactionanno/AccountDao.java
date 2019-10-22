package transactionanno;

import java.util.List;

/**
 * Author: randy
 * Date: 2019/10/17 13:36
 */
public interface AccountDao {
    /**
     * 添加账户
     *
     * @param account 账户对象
     * @return 影响的行数
     */
    public int add(Account account);

    /**
     * 移除账户
     *
     * @param id 账户ID
     * @return 影响的行数
     */
    public int delete(int id);

    /**
     * 查询账户
     *
     * @param id 账户ID
     * @return 账户对象
     */
    public Account query(int id);

    /**
     * 查询全部账户
     *
     * @return 所有账户对象列表
     */
    public List<Account> queryAll();

    /**
     * 转账
     *
     * @param money 金额
     * @param outUser 转款人ID
     * @param inUser 收款人ID
     * @return 是否成功
     */
    public boolean transfer(double money, int outUser, int inUser);
}
