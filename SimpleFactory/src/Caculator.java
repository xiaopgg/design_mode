/**
 * Created by apple on 2018/1/29.
 *
 * 计算抽象类，获取构造方法中获取数值，一个抽象的计算方法，子类通过继承实现自己的抽象计算方法
 */
public  abstract class Caculator
{
    private float num1 = 0;

    private float num2 = 0;

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public Caculator(float num, float numx)
    {
        num1 = num;

        num2 = numx;
    }

    public abstract  float getResult() throws Exception;

}
