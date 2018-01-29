/**
 * Created by apple on 2018/1/29.
 *
 * 加法实现
 */
public class Plus extends Caculator
{
    public Plus(float num, float numx) {
        super(num, numx);
    }

    @Override
    public float getResult() {
        return getNum1()+getNum2();
    }
}
