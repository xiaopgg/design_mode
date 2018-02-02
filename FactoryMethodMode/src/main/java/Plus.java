package main.java;

/**
 * Created by apple on 2018/2/2.
 * 加法类，实现加法操作
 */
public class Plus extends Operation {


    public Plus(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    double getResult() {
        return getNum1()+getNum2();
    }


}
