import coffee.Beverage;
import coffee.Espresso;
import coffee.HouseBlend;
import condiment.Mocha;

import java.text.DecimalFormat;

/**
 * @description: 装饰者模式测试类
 * @author: 赵波
 * @createtime :2020-06-30 10:30:11
 **/
public class TestDecorate {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription());
        System.out.println(df.format(beverage.cost()));

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1, 0.5);
        System.out.println(beverage1.getDescription());
        System.out.println(df.format(beverage1.cost()));
    }
}
