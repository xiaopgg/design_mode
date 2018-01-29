/**
 * Created by apple on 2018/1/29.
 * 乘法实现
 */
public class Multiplication extends Caculator {

    public Multiplication(float num, float numx) {
        super(num, numx);
    }

    @Override
    public float getResult() {
        return getNum1() * getNum2();
    }
}
