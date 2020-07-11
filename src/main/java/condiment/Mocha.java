package condiment;

import coffee.Beverage;

/**
 * @description: 配料 摩卡
 * @author: 赵波
 * @createtime :2020-06-30 10:15:29
 **/
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    /**
     * 构造方法 自定义配料份数
     *
     * @param beverage 饮品品种
     * @param nums     配料份数
     */
    public Mocha(Beverage beverage, double nums) {
        this.beverage = beverage;
        this.nums = nums;
    }

    /**
     * 构造方法 标准份数1
     *
     * @param beverage 饮品品种
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + " ," + nums + "摩卡";
    }

    @Override
    public double cost() {
        return .2 * nums + beverage.cost();
    }
}
