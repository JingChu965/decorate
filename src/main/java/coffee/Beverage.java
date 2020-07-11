package coffee;

/**
 * @description: 咖啡饮料
 * @author: 赵波
 * @createtime :2020-06-30 10:05:42
 **/
public abstract class Beverage {
    /**
     * 描述
     */
    String description = "未知种类的饮品";

    /**
     * 饮料的描述
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 原料的价钱
     *
     * @return
     */
    public abstract double cost();
}
