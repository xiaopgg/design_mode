/**
 * Created by apple on 2018/1/30.
 * 正常收费
 */
public class StrategyFour implements  Strategy {
    @Override
    public Double pricingStrategy(double total) {
        return total;
    }
}
