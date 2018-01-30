/**
 * Created by apple on 2018/1/30.
 * 满500减200
 */
public class StrategyThree implements Strategy{

    private double money;

    public StrategyThree() {
        this.money=200;
    }

    @Override
    public Double pricingStrategy(double total) {
        return total-money;
    }
}
