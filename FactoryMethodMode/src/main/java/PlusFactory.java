package main.java;

/**
 * Created by apple on 2018/2/2.
 */
public class PlusFactory implements Factory {

    private double num1;

    private double num2;

    public PlusFactory(double num1, double num2) {

        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Operation Createfactory()
    {
        return new Plus(num1,num2);
    }
}
