package main.java;

/**
 * Created by apple on 2018/2/2.
 */
public class SimpleFactory
{
    public static Factory CreateOperation(String type,double num1,double num2)
    {
        Factory factory = null;
        switch (type)
        {
            case "+":
                factory = new PlusFactory(num1, num2);
                break;

        }

        return factory;
    }
}
