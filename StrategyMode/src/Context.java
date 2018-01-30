/**
 * Created by apple on 2018/1/30.
 */
public class Context
{
    private Strategy strategy =null;

    public Context(String  type)
    {
        switch (type)
        {
            case "正常收费":
                strategy = new StrategyFour();
                break;
            case "满100打九折":
                strategy = new StrategyOne();
                break;
            case "满200减50":
                strategy = new StrategyTwo();
                break;
            case "满500减200":
                strategy = new StrategyThree();
                break;

        }
    }

    public double getResult(double total)
    {
        return  strategy.pricingStrategy(total);
    }
}
