/**
 * Created by apple on 2018/1/30.
 * 满100打九折
 */
public class StrategyOne implements Strategy {

    private double discovery;

    public StrategyOne()
    {
        this.discovery = 0.9;
    }

    @Override
    public Double pricingStrategy(double total) {
        return total*discovery;
    }
}
