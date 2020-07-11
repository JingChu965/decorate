package coffee;

/**
 * @description: 首选咖啡
 * @author: 赵波
 * @createtime :2020-06-30 10:13:08
 **/
public class HouseBlend extends Beverage {
    /**
     * 构造函数,初始化饮品信息
     */
    public HouseBlend() {
        description = "首选咖啡";
    }

    /**
     * 没加料的咖啡原价
     * @return
     */
    @Override
    public double cost() {
        return 1.29;
    }
}
