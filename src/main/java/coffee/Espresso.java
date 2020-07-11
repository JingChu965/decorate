package coffee;

/**
 * @description: 意大利浓咖啡
 * @author: 赵波
 * @createtime :2020-06-30 10:11:03
 **/
public class Espresso extends Beverage {
    /**
     * 构造函数,初始化饮品信息
     */
    public Espresso() {
        description = "意大利浓咖啡";
    }

    /**
     * 没加料的咖啡原价
     * @return
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
