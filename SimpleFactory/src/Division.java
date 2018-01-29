/**
 * Created by apple on 2018/1/29.
 */
public class Division extends Caculator {
    public Division(float num, float numx) {
        super(num, numx);
    }

    @Override
    public float getResult() throws Exception {
        float reult = 0;
        if (getNum2() == 0)
        {
            throw new Exception("除数不可以为0");
        }
        reult = getNum1()/getNum2();
        return reult;
    }
}
