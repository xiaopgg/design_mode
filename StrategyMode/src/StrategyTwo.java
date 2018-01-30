/**
 * Created by apple on 2018/1/30.
 * 满200减50
 */
public class StrategyTwo implements Strategy{

    private double money = 50;

    @Override
    public Double pricingStrategy(double total) {

        return total - money;
    }
}
