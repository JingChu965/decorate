package condiment;

import coffee.Beverage;

/**
 * @description: 调料装饰者
 * @author: 赵波
 * @createtime :2020-06-30 10:08:32
 **/
public abstract class CondimentDecorator extends Beverage {
    /**
     * 调料份数
     */
    double nums = 1.0;

    @Override
    public abstract String getDescription();

    @Override
    public abstract double cost();
}
