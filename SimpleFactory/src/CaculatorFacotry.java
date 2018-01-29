/**
 * Created by apple on 2018/1/29.
 *
 * 计算方法的生产工厂，根据传入的符号，来生生产对应的计算子类
 */
public class CaculatorFacotry
{
    public static Caculator createCaculator(String operate,float num1,float num2)
    {
        Caculator caculator = null;
        switch (operate)
        {
            case "+" :
                caculator = new Plus(num1,num2);
                break;
            case "-" :
                caculator = new Subtract(num1,num2);
                break;
            case "*" :
                caculator = new Multiplication(num1,num2);
                break;
            case "/" :
                caculator = new Division(num1,num2);
                break;
        }
        return caculator;
    }
}
