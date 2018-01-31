package main;

/**
 * Created by apple on 2018/1/31.
 *
 * 装饰器A类
 */
public class DecorateA extends Decorator
{

    /***
     * 这里调用了父的 行为实现的方法，在此基础之上加入了自己对行为实现的加工。
     */
    @Override
    public void Operation() {
        super.Operation();
        System.out.println("装饰类A对传入的行为进行装饰");
    }
}
