package resultmap;

/**
 * 该类的属性名与表中的列名一一对应
 * Author: randy
 * Date: 2019/10/23 22:46
 */
public class Book {
    private int b_id;
    private String b_name;
    private String b_price;

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_price() {
        return b_price;
    }

    public void setB_price(String b_price) {
        this.b_price = b_price;
    }

    @Override
    public String toString() {
        return "Book{" + "b_id=" + b_id + ", b_name='" + b_name + '\'' + ", b_price='" + b_price + '\'' + '}';
    }
}
