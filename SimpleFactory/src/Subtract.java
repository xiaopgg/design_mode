/**
 * Created by apple on 2018/1/29.
 * 减法
 */
public class Subtract extends Caculator{

    public Subtract(float num, float numx) {
        super(num, numx);
    }

    @Override
    public float getResult() {
        return getNum1() - getNum2();
    }
}
