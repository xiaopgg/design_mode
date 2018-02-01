package main;

/**
 * Created by apple on 2018/1/31.
 * 行为的具体实现类
 */
public class ConcreteComponent implements Component
{
    @Override
    public void Operation() {
        System.out.println("行为实现");     // 行为的具体实现
    }
}
